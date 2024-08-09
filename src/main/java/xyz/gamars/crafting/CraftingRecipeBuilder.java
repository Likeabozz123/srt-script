package xyz.gamars.crafting;

import java.util.ArrayList;

public final class CraftingRecipeBuilder {


    private ArrayList<ShapelessRecipe> shapelessRecipe;
    private ArrayList<ShapedRecipe> shapedRecipe;
    private ArrayList<SmeltingRecipe> furnaceRecipes;
    private ArrayList<SmeltingRecipe> blastRecipes;
    private ArrayList<SmeltingRecipe> smokerRecipes;
    private ArrayList<SmeltingRecipe> campfireRecipes;

    private CraftingRecipeBuilder() {
    }

    public static CraftingRecipeBuilder craftingRecipe() {
        return new CraftingRecipeBuilder();
    }

    public CraftingRecipeBuilder shapelessRecipe(ArrayList<ShapelessRecipe> shapelessRecipe) {
        this.shapelessRecipe = shapelessRecipe;
        return this;
    }

    public CraftingRecipeBuilder shapedRecipe(ArrayList<ShapedRecipe> shapedRecipe) {
        this.shapedRecipe = shapedRecipe;
        return this;
    }

    public CraftingRecipeBuilder furnaceRecipes(ArrayList<SmeltingRecipe> furnaceRecipes) {
        this.furnaceRecipes = furnaceRecipes;
        return this;
    }

    public CraftingRecipeBuilder blastRecipes(ArrayList<SmeltingRecipe> blastRecipes) {
        this.blastRecipes = blastRecipes;
        return this;
    }

    public CraftingRecipeBuilder smokerRecipes(ArrayList<SmeltingRecipe> smokerRecipes) {
        this.smokerRecipes = smokerRecipes;
        return this;
    }

    public CraftingRecipeBuilder campfireRecipes(ArrayList<SmeltingRecipe> campfireRecipes) {
        this.campfireRecipes = campfireRecipes;
        return this;
    }

    public CraftingRecipe build() {
        return new CraftingRecipe(shapelessRecipe, shapedRecipe, furnaceRecipes, blastRecipes, smokerRecipes, campfireRecipes);
    }
}
