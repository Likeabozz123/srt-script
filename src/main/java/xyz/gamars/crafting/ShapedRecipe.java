package xyz.gamars.crafting;

import xyz.gamars.enums.IDType;
import xyz.gamars.objects.MMOItem;

import java.util.ArrayList;

public class ShapedRecipe {

    private ArrayList<CraftingItem> recipe;

    public ShapedRecipe() {
    }

    public ShapedRecipe(ArrayList<CraftingItem> recipe) {
        this.recipe = recipe;
    }

    public ArrayList<CraftingItem> getRecipe() {
        return recipe;
    }

    public void setRecipe(ArrayList<CraftingItem> recipe) {
        this.recipe = recipe;
    }


    public String toString(int i) {
        String output =
                "      shaped:\n" +
                        "        '" + (i + 1) +"':\n" +
                        "          input:\n";
        String shapedRecipeString = "          - ";
        int index = 0;
        int row = 0;
        for (CraftingItem craftingItem : recipe) {
            shapedRecipeString += craftingItem + "|";
            index++;
            if (index >= 3) {
                shapedRecipeString = shapedRecipeString.substring(0, shapedRecipeString.length() - 1);
                row++;
                if (row < 3) {
                    shapedRecipeString += "\n          - ";
                }
                index = 0;
            }
        }
        output += shapedRecipeString;
        return output;
    }

    public String toString() {
        String output =
                "      shaped:\n" +
                        "        '" + 1 +"':\n" +
                        "          input:\n";
        String shapedRecipeString = "          - ";
        int index = 0;
        int row = 0;
        for (CraftingItem craftingItem : recipe) {
            shapedRecipeString += craftingItem + "|";
            index++;
            if (index >= 3) {
                shapedRecipeString = shapedRecipeString.substring(0, shapedRecipeString.length() - 1);
                row++;
                if (row < 3) {
                    shapedRecipeString += "\n          - ";
                }
                index = 0;
            }
        }
        output += shapedRecipeString;
        return output;
    }
}
