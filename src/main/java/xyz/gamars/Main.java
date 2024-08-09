package xyz.gamars;

import xyz.gamars.builders.CraftingRecipeBuilder;
import xyz.gamars.crafting.CraftingItem;
import xyz.gamars.crafting.ShapedRecipe;
import xyz.gamars.enums.IDType;
import xyz.gamars.objects.MMOItem;
import xyz.gamars.parser.MMOItemParser;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        HashMap<String, MMOItem> items = new HashMap<>();
        File[] files = new File("mmoitem").listFiles();
        for (File file : files) {
            System.out.println(file.toPath());
            MMOItemParser mmoItemParser = new MMOItemParser(file.getPath());
            items.putAll(mmoItemParser.parseItems());
            items.forEach((id, item) -> {
                System.out.println(id + " : " + item.getId());
            });
        }

    }
}