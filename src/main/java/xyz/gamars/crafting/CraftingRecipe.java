package xyz.gamars.crafting;

import xyz.gamars.enums.IDType;

import java.util.ArrayList;
import java.util.HashMap;

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

    public CraftingRecipe() {
        this.shapelessRecipe = new ArrayList<>();
        this.shapedRecipe = new ArrayList<>();
        this.furnaceRecipes = new ArrayList<>();
        this.blastRecipes = new ArrayList<>();
        this.smokerRecipes = new ArrayList<>();
        this.campfireRecipes = new ArrayList<>();
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

    public void setShapedRecipeMap(HashMap<String, HashMap<String, ArrayList<String>>> map) {

        map.forEach((key, input) -> {
            ArrayList<CraftingItem> craftingItems = new ArrayList<>();
            input.get("input").forEach(row -> {
                row = row.toLowerCase();
                String firstItemString = row.substring(0, row.indexOf('|'));
                row = row.substring(row.indexOf('|') + 1);
                String secondItemString = row.substring(0, row.indexOf('|'));
                row = row.substring(row.indexOf('|') + 1);
                String thirdItemString = row;

                craftingItems.add(readItemString(firstItemString));
                craftingItems.add(readItemString(secondItemString));
                craftingItems.add(readItemString(thirdItemString));
            });
            shapedRecipe.add(new ShapedRecipe(craftingItems));
        });
    }

    public void setShapelessRecipeMap(HashMap<String, HashMap<String, ArrayList<String>>> map) {

        map.forEach((key, input) -> {
            ArrayList<CraftingItem> craftingItems = new ArrayList<>();
            input.get("input").forEach(item -> {
                item = item.toLowerCase();
                craftingItems.add(readItemString(item));
            });
            shapelessRecipe.add(new ShapelessRecipe(craftingItems));
        });
    }

    public void setFurnaceRecipeMap(HashMap<String, HashMap<String, Object>> map) {
        map.forEach((key, input) -> {
            furnaceRecipes.add(new SmeltingRecipe(readItemString((String) input.get("item")), (Integer) input.get("time"), (Double) input.get("experience")));
        });
    }

    public void setBlastRecipeMap(HashMap<String, HashMap<String, Object>> map) {
        map.forEach((key, input) -> {
            blastRecipes.add(new SmeltingRecipe(readItemString((String) input.get("item")), (Integer) input.get("time"), (Double) input.get("experience")));
        });
    }

    public void setSmokerRecipeMap(HashMap<String, HashMap<String, Object>> map) {
        map.forEach((key, input) -> {
            smokerRecipes.add(new SmeltingRecipe(readItemString((String) input.get("item")), (Integer) input.get("time"), (Double) input.get("experience")));
        });
    }

    public void setCampfireRecipeMap(HashMap<String, HashMap<String, Object>> map) {
        map.forEach((key, input) -> {
            campfireRecipes.add(new SmeltingRecipe(readItemString((String) input.get("item")), (Integer) input.get("time"), (Double) input.get("experience")));
        });
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

    private CraftingItem readItemString(String itemString) {
        itemString = itemString.substring(0, itemString.indexOf('.'));

        if (itemString.charAt(0) == 'v') {
            IDType idType = IDType.VANILLA;
            itemString = itemString.substring(2);
            int dashIndex = itemString.indexOf(" - ");

            if (dashIndex == -1) {
                return new CraftingItem(IDType.VANILLA, "air", 0);
            }
            String id = itemString.substring(0, dashIndex);

            itemString = itemString.substring(itemString.indexOf(" - ") + 3);
            int amount = Integer.parseInt(itemString);

            return new CraftingItem(idType, id, amount);
        } else if (itemString.charAt(0) == 'm') {
            IDType idType = null;
            if (itemString.contains(IDType.MMO_MATERIAL.toString())) {
                idType = IDType.MMO_MATERIAL;
                itemString = itemString.substring(IDType.MMO_MATERIAL.toString().length() + 1);
            } else if (itemString.contains(IDType.MMO_CONSUMABLE.toString())) {
                idType = IDType.MMO_CONSUMABLE;
                itemString = itemString.substring(IDType.MMO_CONSUMABLE.toString().length() + 1);
            } else if (itemString.contains(IDType.MMO_GEM_STONE.toString())) {
                idType = IDType.MMO_GEM_STONE;
                itemString = itemString.substring(IDType.MMO_GEM_STONE.toString().length() + 1);
            }
            Integer amount = Integer.valueOf("" + itemString.charAt(itemString.length() - 1));
            String id = itemString.substring(0, itemString.length() - 2);
            return new CraftingItem(idType, id, amount);
        }
        return null;
    }
}
