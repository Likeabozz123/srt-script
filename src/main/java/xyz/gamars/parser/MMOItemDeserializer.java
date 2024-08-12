package xyz.gamars.parser;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.introspector.Property;
import org.yaml.snakeyaml.introspector.PropertySubstitute;
import org.yaml.snakeyaml.nodes.NodeTuple;
import org.yaml.snakeyaml.nodes.Tag;
import org.yaml.snakeyaml.representer.Representer;
import xyz.gamars.crafting.CraftingRecipe;
import xyz.gamars.crafting.ShapedRecipe;
import xyz.gamars.crafting.ShapelessRecipe;
import xyz.gamars.crafting.SmeltingRecipe;
import xyz.gamars.objects.base.ItemParticle;
import xyz.gamars.objects.MMOItem;
import xyz.gamars.objects.base.NumericStat;
import xyz.gamars.objects.base.PotionEffect;
import xyz.gamars.objects.base.SoundEffect;
import xyz.gamars.snakeyaml.CleanRepresenter;
import xyz.gamars.snakeyaml.QuietPropertySubstitute;
import xyz.gamars.snakeyaml.QuietTypeDescription;

import java.util.*;
import java.util.stream.Collectors;

public class MMOItemDeserializer {

    private Yaml yaml;
    private LoaderOptions loaderOptions;
    private DumperOptions dumperOptions;
    private Representer representer;
    private Constructor constructor;
    private QuietTypeDescription baseTypeDescription;
    private QuietTypeDescription craftingTypeDescriptions;
    private QuietTypeDescription shapedCraftingTypeDescriptions;
    private QuietTypeDescription shapelessCraftingTypeDescriptions;
    private QuietTypeDescription smeltingTypeDescriptions;
    private QuietTypeDescription numericStatsTypeDescription;
    private QuietTypeDescription soundEffectTypeDescription;
    private QuietTypeDescription itemParticleTypeDescription;

    public MMOItemDeserializer() {
        loaderOptions = new LoaderOptions();
        constructor = new Constructor(MMOItem.class, loaderOptions);
        dumperOptions = new DumperOptions();
        representer = new CleanRepresenter(dumperOptions, this);
        representer.getPropertyUtils().setSkipMissingProperties(true);

        baseTypeDescription = new QuietTypeDescription(MMOItem.class);
        craftingTypeDescriptions = new QuietTypeDescription(CraftingRecipe.class);
        shapedCraftingTypeDescriptions = new QuietTypeDescription(ShapedRecipe.class);
        shapelessCraftingTypeDescriptions = new QuietTypeDescription(ShapelessRecipe.class);
        smeltingTypeDescriptions = new QuietTypeDescription(SmeltingRecipe.class);
        numericStatsTypeDescription = new QuietTypeDescription(NumericStat.class);
        soundEffectTypeDescription = new QuietTypeDescription(SoundEffect.class);
        itemParticleTypeDescription = new QuietTypeDescription(ItemParticle.class);
        prepareSubstitutes();

        constructor.addTypeDescription(baseTypeDescription);
        constructor.addTypeDescription(craftingTypeDescriptions);
        constructor.addTypeDescription(shapedCraftingTypeDescriptions);
        constructor.addTypeDescription(shapelessCraftingTypeDescriptions);
        constructor.addTypeDescription(smeltingTypeDescriptions);
        constructor.addTypeDescription(numericStatsTypeDescription);
        constructor.addTypeDescription(soundEffectTypeDescription);
        constructor.addTypeDescription(itemParticleTypeDescription);

        yaml = new Yaml(constructor, representer);
    }

    public Yaml getYaml() {
        return yaml;
    }

    public QuietTypeDescription getBaseTypeDescription() {
        return baseTypeDescription;
    }

    public void prepareSubstitutes() {
        baseTypeDescription.substituteProperty(substitute("custom-model-data", Double.class));
        baseTypeDescription.substituteProperty(substitute("skull-texture", HashMap.class));
        baseTypeDescription.substituteProperty(substitute("max-durability", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("will-break", Boolean.class));
        baseTypeDescription.substituteProperty(substitute("gem-color", String.class));
        baseTypeDescription.substituteProperty(substitute("gem-upgrade-scaling", String.class));
        baseTypeDescription.substituteProperty(substitute("item-type-restriction", ArrayList.class));
        baseTypeDescription.substituteProperty(substitute("lore-format", String.class));
        baseTypeDescription.substituteProperty(substitute("displayed-type", String.class));
        baseTypeDescription.substituteProperty(substitute("hide-enchants", Boolean.class));
        baseTypeDescription.substituteProperty(substitute("item-particles", ItemParticle.class));
        baseTypeDescription.substituteProperty(substitute("disable-interaction", Boolean.class));
        baseTypeDescription.substituteProperty(substitute("disable-crafting", Boolean.class));
        baseTypeDescription.substituteProperty(substitute("disable-smelting", Boolean.class));
        baseTypeDescription.substituteProperty(substitute("disable-enchanting", Boolean.class));
        baseTypeDescription.substituteProperty(substitute("disable-advanced-enchants", Boolean.class));
        baseTypeDescription.substituteProperty(substitute("disable-repairing", Boolean.class));
        baseTypeDescription.substituteProperty(substitute("disable-smithing", Boolean.class));
        baseTypeDescription.substituteProperty(substitute("disable-attack-passive", Boolean.class));
        baseTypeDescription.substituteProperty(substitute("disable-death-drop", Boolean.class));
        baseTypeDescription.substituteProperty(substitute("disable-dropping", Boolean.class));
        baseTypeDescription.substituteProperty(substitute("durability-bar", Boolean.class));
        baseTypeDescription.substituteProperty(substitute("custom-scrap", Double.class));
        baseTypeDescription.substituteProperty(substitute("dye-color", String.class));
        baseTypeDescription.substituteProperty(substitute("hide-dye", Boolean.class));
        baseTypeDescription.substituteProperty(substitute("hide-armor-trim", Boolean.class));
        baseTypeDescription.substituteProperty(substitute("trim-material", String.class));
        baseTypeDescription.substituteProperty(substitute("trim-pattern", String.class));
        baseTypeDescription.substituteProperty(substitute("required-level", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("required-class", ArrayList.class));
        baseTypeDescription.substituteProperty(substitute("success-rate", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("attack-damage", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("attack-speed", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("critical-strike-chance", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("critical-strike-power", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("block-power", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("block-rating", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("break-downgrade", Boolean.class));
        baseTypeDescription.substituteProperty(substitute("death-downgrade", Boolean.class));
        baseTypeDescription.substituteProperty(substitute("death-downgrade-chance", Double.class));
        baseTypeDescription.substituteProperty(substitute("block-cooldown-reduction", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("dodge-rating", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("dodge-cooldown-reduction", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("parry-rating", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("parry-cooldown-reduction", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("cooldown-reduction", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("mana-cost", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("stamina-cost", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("pve-damage", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("pvp-damage", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("weapon-damage", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("skill-damage", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("projectile-damage", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("magic-damage", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("physical-damage", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("damage-reduction", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("fall-damage-reduction", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("projectile-damage-reduction", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("physical-damage-reduction", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("fire-damage-reduction", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("magic-damage-reduction", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("pve-damage-reduction", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("pvp-damage-reduction", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("undead-damage", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("armor-toughness", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("max-health", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("max-mana", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("knockback-resistance", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("movement-speed", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("two-handed", Boolean.class));
        baseTypeDescription.substituteProperty(substitute("equip-priority", Double.class));
        baseTypeDescription.substituteProperty(substitute("perm-effects", HashMap.class));
        baseTypeDescription.substituteProperty(substitute("granted-permissions", ArrayList.class));
        baseTypeDescription.substituteProperty(substitute("item-cooldown", NumericStat.class));

        craftingTypeDescriptions.substituteProperty(substitute("shaped", HashMap.class, "getShapedRecipes", "setShapedRecipeMap"));
        craftingTypeDescriptions.substituteProperty(substitute("shapeless", HashMap.class, "getShapelessRecipe", "setShapelessRecipeMap"));
        craftingTypeDescriptions.substituteProperty(substitute("furnace", HashMap.class, "getFurnaceRecipe", "setFurnaceRecipeMap"));
        craftingTypeDescriptions.substituteProperty(substitute("blast", HashMap.class, "getBlastRecipe", "setBlastRecipeMap"));
        craftingTypeDescriptions.substituteProperty(substitute("smoker", HashMap.class, "getSmokerRecipe", "setSmokerRecipeMap"));
        craftingTypeDescriptions.substituteProperty(substitute("campfire", HashMap.class, "getCampfireRecipe", "setCampfireRecipeMap"));

        baseTypeDescription.substituteProperty(substitute("craft-permission", String.class));
        baseTypeDescription.substituteProperty(substitute("crafted-amount", Double.class));
        baseTypeDescription.substituteProperty(substitute("gem-sockets", ArrayList.class));
        baseTypeDescription.substituteProperty(substitute("repair-type", String.class));
        baseTypeDescription.substituteProperty(substitute("health-regeneration", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("mana-regeneration", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("max-stamina", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("stamina-regeneration", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("additional-experience", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("faction-damage-enemy", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("required-dexterity", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("required-strength", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("profession-enchanting", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("profession-smithing", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("profession-mining", NumericStat.class));

        numericStatsTypeDescription.substituteProperty("max-spread", Double.class, "getMaxSpread", "setMaxSpread");

        itemParticleTypeDescription.substituteProperty("rotation-speed", Double.class, "getRotationSpeed", "setRotationSpeed");

        // consumable
        baseTypeDescription.substituteProperty(substitute("disable-right-click-consume", Boolean.class));
        baseTypeDescription.substituteProperty(substitute("restore-health", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("restore-food", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("restore-saturation", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("restore-mana", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("restore-stamina", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("can-identify", Boolean.class));
        baseTypeDescription.substituteProperty(substitute("can-deconstruct", Boolean.class));
        baseTypeDescription.substituteProperty(substitute("can-deskin", Boolean.class));
        baseTypeDescription.substituteProperty(substitute("soulbinding-chance", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("soulbinding-break-chance", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("soulbound-level", NumericStat.class));
        baseTypeDescription.substituteProperty(substitute("vanilla-eating", Boolean.class));
        baseTypeDescription.substituteProperty(substitute("max-consume", Double.class));

        // bows
        baseTypeDescription.substituteProperty(substitute("arrow-particles", ItemParticle.class));
        baseTypeDescription.substituteProperty(substitute("arrow-velocity", Double.class));
        baseTypeDescription.substituteProperty(substitute("arrow-potion-effects", PotionEffect.class));
    }

    private QuietPropertySubstitute substitute(String name, Class<?> clazz, String getter, String setter) {
        return new QuietPropertySubstitute(name, clazz, getter, setter);
    }

    private QuietPropertySubstitute substitute(String name, Class<?> type) {
        return substitute(name, type, "get" + capitalize(dashToCamel(name)), "set" + capitalize(dashToCamel(name)));
    }

    public static String dashToCamel(String dashStr) {
        StringBuilder result = new StringBuilder();

        // Split the string by dash ('-')
        String[] components = dashStr.split("-");

        // Append the first component as is
        result.append(components[0]);

        // Capitalize the first letter of each subsequent component and append to the result
        for (int i = 1; i < components.length; i++) {
            result.append(capitalize(components[i]));
        }

        return result.toString();
    }

    private static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
