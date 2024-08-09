package xyz.gamars.snakeyaml;

import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.internal.Logger;
import org.yaml.snakeyaml.introspector.Property;
import org.yaml.snakeyaml.introspector.PropertySubstitute;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class QuietPropertySubstitute extends PropertySubstitute {

    private static final Logger log =
            Logger.getLogger(PropertySubstitute.class.getPackage().getName());

    protected Class<?> targetType;
    private final String readMethod;
    private final String writeMethod;
    private transient Method read;
    private transient Method write;
    private Field field;
    protected Class<?>[] parameters;
    private Property delegate;
    private boolean filler;

    public QuietPropertySubstitute(String name, Class<?> type, String readMethod, String writeMethod,
                              Class<?>... params) {
        super(name, type);
        this.readMethod = readMethod;
        this.writeMethod = writeMethod;
        setActualTypeArguments(params);
        this.filler = false;
    }

    public QuietPropertySubstitute(String name, Class<?> type, Class<?>... params) {
        this(name, type, null, null, params);
    }

    @Override
    public Class<?>[] getActualTypeArguments() {
        if (parameters == null && delegate != null) {
            return delegate.getActualTypeArguments();
        }
        return parameters;
    }

    public void setActualTypeArguments(Class<?>... args) {
        if (args != null && args.length > 0) {
            parameters = args;
        } else {
            parameters = null;
        }
    }

    @Override
    public void set(Object object, Object value) throws Exception {
        if (write != null) {
            if (!filler) {
                write.invoke(object, value);
            } else if (value != null) {
                if (value instanceof Collection<?>) {
                    Collection<?> collection = (Collection<?>) value;
                    for (Object val : collection) {
                        write.invoke(object, val);
                    }
                } else if (value instanceof Map<?, ?>) {
                    Map<?, ?> map = (Map<?, ?>) value;
                    for (Map.Entry<?, ?> entry : map.entrySet()) {
                        write.invoke(object, entry.getKey(), entry.getValue());
                    }
                } else if (value.getClass().isArray()) {
                    // TODO: maybe arrays need 2 fillers like SET(index, value) add ADD(value)
                    int len = Array.getLength(value);
                    for (int i = 0; i < len; i++) {
                        write.invoke(object, Array.get(value, i));
                    }
                }
            }
        } else if (field != null) {
            field.set(object, value);
        } else if (delegate != null) {
            delegate.set(object, value);
        } else {
            log.warn("No setter/delegate for '" + getName() + "' on object " + object);
        }
        // TODO: maybe throw YAMLException here
    }

    @Override
    public Object get(Object object) {
        try {
            if (read != null) {
                return read.invoke(object);
            } else if (field != null) {
                return field.get(object);
            }
        } catch (Exception e) {
            throw new YAMLException(
                    "Unable to find getter for property '" + getName() + "' on object " + object + ":" + e);
        }

        if (delegate != null) {
            return delegate.get(object);
        }
        throw new YAMLException(
                "No getter or delegate for property '" + getName() + "' on object " + object);
    }

    @Override
    public List<Annotation> getAnnotations() {
        Annotation[] annotations = null;
        if (read != null) {
            annotations = read.getAnnotations();
        } else if (field != null) {
            annotations = field.getAnnotations();
        }
        return annotations != null ? Arrays.asList(annotations) : delegate.getAnnotations();
    }

    @Override
    public <A extends Annotation> A getAnnotation(Class<A> annotationType) {
        A annotation;
        if (read != null) {
            annotation = read.getAnnotation(annotationType);
        } else if (field != null) {
            annotation = field.getAnnotation(annotationType);
        } else {
            annotation = delegate.getAnnotation(annotationType);
        }
        return annotation;
    }

    public void setTargetType(Class<?> targetType) {
        if (this.targetType != targetType) {
            this.targetType = targetType;

            final String name = getName();
            for (Class<?> c = targetType; c != null; c = c.getSuperclass()) {
                for (Field f : c.getDeclaredFields()) {
                    if (f.getName().equals(name)) {
                        int modifiers = f.getModifiers();
                        if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers)) {
                            f.setAccessible(true);
                            field = f;
                        }
                        break;
                    }
                }
            }
            // Retrieve needed info
            if (readMethod != null) {
                read = discoverMethod(targetType, readMethod);
            }
            if (writeMethod != null) {
                filler = false;
                write = discoverMethod(targetType, writeMethod, getType());
                if (write == null && parameters != null) {
                    filler = true;
                    write = discoverMethod(targetType, writeMethod, parameters);
                }
            }
        }
    }

    private Method discoverMethod(Class<?> type, String name, Class<?>... params) {
        for (Class<?> c = type; c != null; c = c.getSuperclass()) {
            for (Method method : c.getDeclaredMethods()) {
                if (name.equals(method.getName())) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length != params.length) {
                        continue;
                    }
                    boolean found = true;
                    for (int i = 0; i < parameterTypes.length; i++) {
                        if (!parameterTypes[i].isAssignableFrom(params[i])) {
                            found = false;
                        }
                    }
                    if (found) {
                        method.setAccessible(true);
                        return method;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public String getName() {
        final String n = super.getName();
        if (n != null) {
            return n;
        }
        return delegate != null ? delegate.getName() : null;
    }

    @Override
    public Class<?> getType() {
        final Class<?> t = super.getType();
        if (t != null) {
            return t;
        }
        return delegate != null ? delegate.getType() : null;
    }

    @Override
    public boolean isReadable() {
        return (read != null) || (field != null) || (delegate != null && delegate.isReadable());
    }

    @Override
    public boolean isWritable() {
        return (write != null) || (field != null) || (delegate != null && delegate.isWritable());
    }

    public void setDelegate(Property delegate) {
        this.delegate = delegate;
        if (writeMethod != null && write == null && !filler) {
            filler = true;
            write = discoverMethod(targetType, writeMethod, getActualTypeArguments());
        }
    }



}
