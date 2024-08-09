package xyz.gamars.crafting;

import java.util.ArrayList;

public class CraftingRecipe {

    private ArrayList<ShapelessRecipe> shapelessRecipe;
    private ArrayList<ShapedRecipe> shapedRecipe;
    private ArrayList<SmeltingRecipe> furnaceRecipes;
    private ArrayList<SmeltingRecipe> blastRecipes;
    private ArrayList<SmeltingRecipe> smokerRecipes;
    private ArrayList<SmeltingRecipe> campfireRecipes;

    public CraftingRecipe(ArrayList<ShapelessRecipe> shapelessRecipe, ArrayList<ShapedRecipe> shapedRecipe, ArrayList<SmeltingRecipe> furnaceRecipes, ArrayList<SmeltingRecipe> blastRecipes, ArrayList<SmeltingRecipe> smokerRecipes, ArrayList<SmeltingRecipe> campfireRecipes) {
        this.shapelessRecipe = shapelessRecipe;
        this.shapedRecipe = shapedRecipe;
        this.furnaceRecipes = furnaceRecipes;
        this.blastRecipes = blastRecipes;
        this.smokerRecipes = smokerRecipes;
        this.campfireRecipes = campfireRecipes;
    }

    public ArrayList<ShapelessRecipe> getShapelessRecipe() {
        return shapelessRecipe;
    }

    public void setShapelessRecipe(ArrayList<ShapelessRecipe> shapelessRecipe) {
        this.shapelessRecipe = shapelessRecipe;
    }

    public ArrayList<ShapedRecipe> getShapedRecipe() {
        return shapedRecipe;
    }

    public void setShapedRecipe(ArrayList<ShapedRecipe> shapedRecipe) {
        this.shapedRecipe = shapedRecipe;
    }

    public ArrayList<SmeltingRecipe> getFurnaceRecipes() {
        return furnaceRecipes;
    }

    public void setFurnaceRecipes(ArrayList<SmeltingRecipe> furnaceRecipes) {
        this.furnaceRecipes = furnaceRecipes;
    }

    public ArrayList<SmeltingRecipe> getBlastRecipes() {
        return blastRecipes;
    }

    public void setBlastRecipes(ArrayList<SmeltingRecipe> blastRecipes) {
        this.blastRecipes = blastRecipes;
    }

    public ArrayList<SmeltingRecipe> getSmokerRecipes() {
        return smokerRecipes;
    }

    public void setSmokerRecipes(ArrayList<SmeltingRecipe> smokerRecipes) {
        this.smokerRecipes = smokerRecipes;
    }

    public ArrayList<SmeltingRecipe> getCampfireRecipes() {
        return campfireRecipes;
    }

    public void setCampfireRecipes(ArrayList<SmeltingRecipe> campfireRecipes) {
        this.campfireRecipes = campfireRecipes;
    }
}
