package xyz.gamars.parser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import xyz.gamars.objects.Materials;
import xyz.gamars.objects.base.MMOItem;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MaterialParser {


    private Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .serializeNulls()
            .registerTypeAdapter(MMOItem.class, new MMOItemDeserializer())
            .create();

    public void parseMaterials() {
        try {
            Materials materials = gson.fromJson(new FileReader("material.json"), Materials.class);
            for (MMOItem mmoItem : materials.getMaterials()) {
                System.out.println(mmoItem);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
