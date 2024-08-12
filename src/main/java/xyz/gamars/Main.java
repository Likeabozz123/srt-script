package xyz.gamars;

import org.yaml.snakeyaml.Yaml;
import xyz.gamars.builders.CraftingRecipeBuilder;
import xyz.gamars.crafting.CraftingRecipe;
import xyz.gamars.enums.IDType;
import xyz.gamars.objects.MMOItem;
import xyz.gamars.objects.MMOItems;
import xyz.gamars.parser.MMOItemDeserializer;
import xyz.gamars.utils.QuickCraftUtils;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MMOItems.registerItems();

        /*CraftingRecipeBuilder craftingRecipeBuilder = CraftingRecipeBuilder.craftingRecipe();
        craftingRecipeBuilder.shapedRecipe(QuickCraftUtils.quickShaped(
                MMOItems.RAZOR_SHARP_LEAF, MMOItems.RAZOR_SHARP_LEAF, MMOItems.RAZOR_SHARP_LEAF,
                MMOItems.RAZOR_SHARP_LEAF, MMOItems.SPIRIT_OF_ARTISTRY, MMOItems.RAZOR_SHARP_LEAF,
                MMOItems.RAZOR_SHARP_LEAF, MMOItems.RAZOR_SHARP_LEAF, MMOItems.RAZOR_SHARP_LEAF, IDType.MMO_MATERIAL));
        CraftingRecipe craftingRecipe = craftingRecipeBuilder.build();
        System.out.println(craftingRecipe);*/

        MMOItemDeserializer mmoItemDeserializer = new MMOItemDeserializer();
        Yaml mmoYaml = mmoItemDeserializer.getYaml();

        MMOItems.SRT_PRISMARINECHESTPLATE.addAdditionalInfo("spell-vampirism", 10D);
        MMOItems.BANANASUIT.addAdditionalInfo("goop-hat", true);
        /*MMOItems.ITEMS.forEach((id, item) -> {
            System.out.println(mmoYaml.dump(Map.of(id, Map.of("base", item))));
        });*/



        System.out.println(mmoYaml.dump(Map.of(MMOItems.DARYAN_ITEM.getId(), Map.of("base", MMOItems.DARYAN_ITEM))));

    }
}