package xyz.gamars.parser;

import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import xyz.gamars.objects.MMOItem;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class MMOItemParser {

    private String filePath;

    public MMOItemParser(String filePath) {
        this.filePath = filePath;
    }

    public HashMap<String, MMOItem> parseItems() {
        Yaml yaml = new Yaml(new Constructor(HashMap.class, new LoaderOptions()));
        Yaml mmoItemYaml = new MMOItemDeserializer().getYaml();
        HashMap<String, MMOItem> items = new HashMap<>();
        try {
            HashMap<String, HashMap<String, Object>> hashMap = yaml.load(new FileReader(filePath));
            hashMap.forEach((id, base) -> {
                MMOItem item = mmoItemYaml.load(yaml.dump(base.get("base")));
                item.setId(id);
                items.put(id, item);
            });

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return items;
    }


}
