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
}
