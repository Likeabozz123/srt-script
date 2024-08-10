package xyz.gamars.utils;

import xyz.gamars.crafting.CraftingItem;
import xyz.gamars.crafting.ShapedRecipe;
import xyz.gamars.enums.IDType;
import xyz.gamars.objects.MMOItem;

import java.util.ArrayList;

public class QuickCraftUtils {

    public static ArrayList<ShapedRecipe> quickShaped(MMOItem item1,
                                                      MMOItem item2,
                                                      MMOItem item3,
                                                      MMOItem item4,
                                                      MMOItem item5,
                                                      MMOItem item6,
                                                      MMOItem item7,
                                                      MMOItem item8,
                                                      MMOItem item9,
                                                      IDType idType) {
        ArrayList<ShapedRecipe> shapedRecipes = new ArrayList<>();
        ArrayList<CraftingItem> craftingItems = new ArrayList<>();
        craftingItems.add(new CraftingItem(idType, item1.getId()));
        craftingItems.add(new CraftingItem(idType, item2.getId()));
        craftingItems.add(new CraftingItem(idType, item3.getId()));
        craftingItems.add(new CraftingItem(idType, item4.getId()));
        craftingItems.add(new CraftingItem(idType, item5.getId()));
        craftingItems.add(new CraftingItem(idType, item6.getId()));
        craftingItems.add(new CraftingItem(idType, item7.getId()));
        craftingItems.add(new CraftingItem(idType, item8.getId()));
        craftingItems.add(new CraftingItem(idType, item9.getId()));

        shapedRecipes.add(new ShapedRecipe(craftingItems));

        return shapedRecipes;
    }

}
