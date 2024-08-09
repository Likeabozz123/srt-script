package xyz.gamars;

import xyz.gamars.parser.MaterialParser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

/*        HashMap<Character, CraftingItem> craftingItems = new HashMap<>();
        craftingItems.put('B', new CraftingItem(IDType.VANILLA, "stick"));
        craftingItems.put('R', new CraftingItem(IDType.MMO_MATERIAL, "razor_sharp_leaf"));
        craftingItems.put('T', new CraftingItem(IDType.VANILLA, "tnt"));
        craftingItems.put('P', new CraftingItem(IDType.MMO_MATERIAL, "peridot_shard"));
        craftingItems.put('S', new CraftingItem(IDType.MMO_MATERIAL, "spirit_of_ingenuity"));
        CraftingRecipe scrapShotCrafting = new CraftingRecipe(craftingItems, "BRT", "PSP", "TRB");
        AbilityStone scrapShot = new AbilityStone("artificer", "ingenuity", 5, "scrap_shot", scrapShotCrafting);

        System.out.println(scrapShot);*/
        MaterialParser materialParser = new MaterialParser();
        materialParser.parseMaterials();





    }
}