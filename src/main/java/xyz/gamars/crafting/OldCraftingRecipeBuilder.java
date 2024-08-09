package xyz.gamars.crafting;

import java.util.HashMap;

public final class OldCraftingRecipeBuilder {


    private HashMap<Character, CraftingItem> craftingItems;
    private String top;
    private String middle;
    private String bottom;

    private OldCraftingRecipeBuilder() {
    }

    public static OldCraftingRecipeBuilder craftingRecipe() {
        return new OldCraftingRecipeBuilder();
    }

    public OldCraftingRecipeBuilder craftingItems(HashMap<Character, CraftingItem> craftingItems) {
        this.craftingItems = craftingItems;
        return this;
    }

    public OldCraftingRecipeBuilder top(String top) {
        this.top = top;
        return this;
    }

    public OldCraftingRecipeBuilder middle(String middle) {
        this.middle = middle;
        return this;
    }

    public OldCraftingRecipeBuilder bottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    public OldCraftingRecipe build() {
        return new OldCraftingRecipe(craftingItems, top, middle, bottom);
    }
}
