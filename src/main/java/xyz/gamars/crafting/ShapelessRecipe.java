package xyz.gamars.crafting;

import java.util.ArrayList;

public class ShapelessRecipe {

    private ArrayList<CraftingItem> recipe;

    public ShapelessRecipe(ArrayList<CraftingItem> recipe) {
        this.recipe = recipe;
    }

    public ArrayList<CraftingItem> getRecipe() {
        return recipe;
    }

    public void setRecipe(ArrayList<CraftingItem> recipe) {
        this.recipe = recipe;
    }
}
