package xyz.gamars.crafting;

import java.util.HashMap;

public class CraftingRecipe {

    private HashMap<Character, CraftingItem> craftingItems;
    private String top;
    private String middle;
    private String bottom;

    public CraftingRecipe(HashMap<Character, CraftingItem> craftingItems, String top, String middle, String bottom) {
        this.craftingItems = craftingItems;
        this.top = top;
        this.middle = middle;
        this.bottom = bottom;
    }

    public String convert() {
        String recipe = "";
        String convertedTop = "";
        String convertedMiddle = "";
        String convertedBottom = "";

        for (Character character : top.toCharArray()) {
            convertedTop += craftingItems.get(character);
            convertedTop += "|";
        }
        convertedTop = convertedTop.substring(0, convertedTop.length() - 1);

        for (Character character : middle.toCharArray()) {
            convertedMiddle += craftingItems.get(character);
            convertedMiddle += "|";
        }
        convertedMiddle = convertedMiddle.substring(0, convertedMiddle.length() - 1);

        for (Character character : bottom.toCharArray()) {
            convertedBottom += craftingItems.get(character);
            convertedBottom += "|";
        }
        convertedBottom = convertedBottom.substring(0, convertedBottom.length() - 1);

        recipe += "          - " + convertedTop + "\n";
        recipe += "          - " + convertedMiddle + "\n";
        recipe += "          - " + convertedBottom + "\n";

        return recipe;
    }

    @Override
    public String toString() {
        return convert();
    }
}
