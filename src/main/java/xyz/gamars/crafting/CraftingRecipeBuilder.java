package xyz.gamars.crafting;

import java.util.HashMap;

public final class CraftingRecipeBuilder {


    private HashMap<Character, CraftingItem> craftingItems;
    private String top;
    private String middle;
    private String bottom;

    private CraftingRecipeBuilder() {
    }

    public static CraftingRecipeBuilder craftingRecipe() {
        return new CraftingRecipeBuilder();
    }

    public CraftingRecipeBuilder craftingItems(HashMap<Character, CraftingItem> craftingItems) {
        this.craftingItems = craftingItems;
        return this;
    }

    public CraftingRecipeBuilder top(String top) {
        this.top = top;
        return this;
    }

    public CraftingRecipeBuilder middle(String middle) {
        this.middle = middle;
        return this;
    }

    public CraftingRecipeBuilder bottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    public CraftingRecipe build() {
        return new CraftingRecipe(craftingItems, top, middle, bottom);
    }
}
