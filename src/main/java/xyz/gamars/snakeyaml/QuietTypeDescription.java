package xyz.gamars.snakeyaml;

import org.yaml.snakeyaml.nodes.Tag;

public class QuietTypeDescription extends org.yaml.snakeyaml.TypeDescription {


    public QuietTypeDescription(Class<?> clazz, Tag tag) {
        super(clazz, tag);
    }

    public QuietTypeDescription(Class<?> clazz, Tag tag, Class<?> impl) {
        super(clazz, tag, impl);
    }

    public QuietTypeDescription(Class<?> clazz, String tag) {
        super(clazz, tag);
    }

    public QuietTypeDescription(Class<?> clazz) {
        super(clazz);
    }

    public QuietTypeDescription(Class<?> clazz, Class<?> impl) {
        super(clazz, impl);
    }

    @Override
    public void substituteProperty(String pName, Class<?> pType, String getter, String setter, Class<?>... argParams) {
        substituteProperty(new QuietPropertySubstitute(pName, pType, getter, setter, argParams));
    }
}
