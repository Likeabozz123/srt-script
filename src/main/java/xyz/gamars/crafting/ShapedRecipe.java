package xyz.gamars.crafting;

import java.util.ArrayList;
import java.util.Map;

public class ShapedRecipe {

    private ArrayList<CraftingItem> recipe;

    public ShapedRecipe(ArrayList<CraftingItem> recipe) {
        this.recipe = recipe;
    }

    public ArrayList<CraftingItem> getRecipe() {
        return recipe;
    }

    public void setRecipe(ArrayList<CraftingItem> recipe) {
        this.recipe = recipe;
    }
}
