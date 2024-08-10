package xyz.gamars;

import xyz.gamars.builders.CraftingRecipeBuilder;
import xyz.gamars.crafting.CraftingRecipe;
import xyz.gamars.enums.IDType;
import xyz.gamars.objects.MMOItems;
import xyz.gamars.utils.QuickCraftUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MMOItems.registerItems();

        CraftingRecipeBuilder craftingRecipeBuilder = CraftingRecipeBuilder.craftingRecipe();
        craftingRecipeBuilder.shapedRecipe(QuickCraftUtils.quickShaped(
                MMOItems.RAZOR_SHARP_LEAF, MMOItems.RAZOR_SHARP_LEAF, MMOItems.RAZOR_SHARP_LEAF,
                MMOItems.RAZOR_SHARP_LEAF, MMOItems.RAZOR_SHARP_LEAF, MMOItems.RAZOR_SHARP_LEAF,
                MMOItems.RAZOR_SHARP_LEAF, MMOItems.RAZOR_SHARP_LEAF, MMOItems.RAZOR_SHARP_LEAF, IDType.MMO_MATERIAL));
        CraftingRecipe craftingRecipe = craftingRecipeBuilder.build();
        System.out.println(craftingRecipe);

    }
}