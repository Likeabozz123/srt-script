package xyz.gamars.parser;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.introspector.Property;
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
import xyz.gamars.snakeyaml.QuietTypeDescription;

import java.util.ArrayList;
import java.util.HashMap;

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

    public MMOItemDeserializer() {
        loaderOptions = new LoaderOptions();
        constructor = new Constructor(MMOItem.class, loaderOptions);
        dumperOptions = new DumperOptions();
        representer = new Representer(dumperOptions);
        representer.getPropertyUtils().setSkipMissingProperties(true);

        baseTypeDescription = new QuietTypeDescription(MMOItem.class);
        craftingTypeDescriptions = new QuietTypeDescription(CraftingRecipe.class);
        shapedCraftingTypeDescriptions = new QuietTypeDescription(ShapedRecipe.class);
        shapelessCraftingTypeDescriptions = new QuietTypeDescription(ShapelessRecipe.class);
        smeltingTypeDescriptions = new QuietTypeDescription(SmeltingRecipe.class);
        numericStatsTypeDescription = new QuietTypeDescription(NumericStat.class);
        soundEffectTypeDescription = new QuietTypeDescription(SoundEffect.class);
        prepareSubstitutes();

        constructor.addTypeDescription(baseTypeDescription);
        constructor.addTypeDescription(craftingTypeDescriptions);
        constructor.addTypeDescription(shapedCraftingTypeDescriptions);
        constructor.addTypeDescription(shapelessCraftingTypeDescriptions);
        constructor.addTypeDescription(smeltingTypeDescriptions);
        constructor.addTypeDescription(numericStatsTypeDescription);
        constructor.addTypeDescription(soundEffectTypeDescription);

        yaml = new Yaml(constructor, representer);
    }

    public Yaml getYaml() {
        return yaml;
    }

    public void prepareSubstitutes() {
        baseTypeDescription.substituteProperty("custom-model-data", Double.class, "getCustomModelData", "setCustomModelData");
        baseTypeDescription.substituteProperty("max-durability", NumericStat.class, "getMaxDurability", "setMaxDurability");
        baseTypeDescription.substituteProperty("will-break", Boolean.class, "getWillBreak", "setWillBreak");
        baseTypeDescription.substituteProperty("lore-format", String.class, "getLoreFormat", "setLoreFormat");
        baseTypeDescription.substituteProperty("displayed-type", String.class, "getDisplayedType", "setDisplayedType");
        baseTypeDescription.substituteProperty("hide-enchants", Boolean.class, "getHideEnchants", "setHideEnchants");
        baseTypeDescription.substituteProperty("item-particles", ItemParticle.class, "getItemParticles", "setItemParticles");
        baseTypeDescription.substituteProperty("disable-interaction", Boolean.class, "getDisableInteraction", "setDisableInteraction");
        baseTypeDescription.substituteProperty("disable-crafting", Boolean.class, "getDisableCrafting", "setDisableCrafting");
        baseTypeDescription.substituteProperty("disable-smelting", Boolean.class, "getDisableSmelting", "setDisableSmelting");
        baseTypeDescription.substituteProperty("disable-enchanting", Boolean.class, "getDisableEnchanting", "setDisableEnchanting");
        baseTypeDescription.substituteProperty("disable-repairing", Boolean.class, "getDisableRepairing", "setDisableRepairing");
        baseTypeDescription.substituteProperty("disable-attack-passive", Boolean.class, "getDisableAttackPassive", "setDisableAttackPassive");
        baseTypeDescription.substituteProperty("required-level", NumericStat.class, "getRequiredLevel", "setRequiredLevel");
        baseTypeDescription.substituteProperty("required-class", ArrayList.class, "getRequiredClass", "setRequiredClass");
        baseTypeDescription.substituteProperty("attack-damage", NumericStat.class, "getAttackDamage", "setAttackDamage");
        baseTypeDescription.substituteProperty("attack-speed", NumericStat.class, "getAttackSpeed", "setAttackSpeed");
        baseTypeDescription.substituteProperty("critical-strike-chance", NumericStat.class, "getCriticalStrikeChance", "setCriticalStrikeChance");
        baseTypeDescription.substituteProperty("critical-strike-power", NumericStat.class, "getCriticalStrikePower", "setCriticalStrikePower");
        baseTypeDescription.substituteProperty("block-power", NumericStat.class, "getBlockPower", "setBlockPower");
        baseTypeDescription.substituteProperty("block-rating", NumericStat.class, "getBlockRating", "setBlockRating");
        baseTypeDescription.substituteProperty("block-cooldown-reduction", NumericStat.class, "getBlockCooldownReduction", "setBlockCooldownReduction");
        baseTypeDescription.substituteProperty("dodge-rating", NumericStat.class, "getDodgeRating", "setDodgeRating");
        baseTypeDescription.substituteProperty("dodge-cooldown-reduction", NumericStat.class, "getDodgeCooldownReduction", "setDodgeCooldownReduction");
        baseTypeDescription.substituteProperty("parry-rating", NumericStat.class, "getParryRating", "setParryRating");
        baseTypeDescription.substituteProperty("parry-cooldown-reduction", NumericStat.class, "getParryCooldownReduction", "setParryCooldownReduction");
        baseTypeDescription.substituteProperty("cooldown-reduction", NumericStat.class, "getCooldownReduction", "setCooldownReduction");
        baseTypeDescription.substituteProperty("mana-cost", NumericStat.class, "getManaCost", "setManaCost");
        baseTypeDescription.substituteProperty("stamina-cost", NumericStat.class, "getStaminaCost", "setStaminaCost");
        baseTypeDescription.substituteProperty("pve-damage", NumericStat.class, "getPveDamage", "setPveDamage");
        baseTypeDescription.substituteProperty("pvp-damage", NumericStat.class, "getPvpDamage", "setPvpDamage");
        baseTypeDescription.substituteProperty("weapon-damage", NumericStat.class, "getWeaponDamage", "setWeaponDamage");
        baseTypeDescription.substituteProperty("skill-damage", NumericStat.class, "getSkillDamage", "setSkillDamage");
        baseTypeDescription.substituteProperty("projectile-damage", NumericStat.class, "getProjectileDamage", "setProjectileDamage");
        baseTypeDescription.substituteProperty("magic-damage", NumericStat.class, "getMagicDamage", "setMagicDamage");
        baseTypeDescription.substituteProperty("physical-damage", NumericStat.class, "getPhysicalDamage", "setPhysicalDamage");
        baseTypeDescription.substituteProperty("damage-reduction", NumericStat.class, "getDamageReduction", "setDamageReduction");
        baseTypeDescription.substituteProperty("fall-damage-reduction", NumericStat.class, "getFallDamageReduction", "setFallDamageReduction");
        baseTypeDescription.substituteProperty("projectile-damage-reduction", NumericStat.class, "getProjectileDamageReduction", "setProjectileDamageReduction");
        baseTypeDescription.substituteProperty("physical-damage-reduction", NumericStat.class, "getPhysicalDamageReduction", "setPhysicalDamageReduction");
        baseTypeDescription.substituteProperty("fire-damage-reduction", NumericStat.class, "getFireDamageReduction", "setFireDamageReduction");
        baseTypeDescription.substituteProperty("magic-damage-reduction", NumericStat.class, "getMagicDamageReduction", "setMagicDamageReduction");
        baseTypeDescription.substituteProperty("pve-damage-reduction", NumericStat.class, "getPveDamageReduction", "setPveDamageReduction");
        baseTypeDescription.substituteProperty("pvp-damage-reduction", NumericStat.class, "getPvpDamageReduction", "setPvpDamageReduction");
        baseTypeDescription.substituteProperty("undead-damage", NumericStat.class, "getUndeadDamage", "setUndeadDamage");
        baseTypeDescription.substituteProperty("armor-toughness", NumericStat.class, "getArmorToughness", "setArmorToughness");
        baseTypeDescription.substituteProperty("max-health", NumericStat.class, "getMaxHealth", "setMaxHealth");
        baseTypeDescription.substituteProperty("max-mana", NumericStat.class, "getMaxMana", "setMaxMana");
        baseTypeDescription.substituteProperty("knockback-resistance", NumericStat.class, "getKnockbackResistance", "setKnockbackResistance");
        baseTypeDescription.substituteProperty("movement-speed", NumericStat.class, "getMovementSpeed", "setMovementSpeed");
        baseTypeDescription.substituteProperty("two-handed", Boolean.class, "getTwoHanded", "setTwoHanded");
        baseTypeDescription.substituteProperty("equip-priority", Double.class, "getEquipPriority", "setEquipPriority");
        baseTypeDescription.substituteProperty("perm-effects", PotionEffect.class, "getPermEffects", "setPermEffects");
        baseTypeDescription.substituteProperty("granted-permissions", ArrayList.class, "getGrantedPermissions", "setGrantedPermissions");
        baseTypeDescription.substituteProperty("item-cooldown", NumericStat.class, "getItemCooldown", "setItemCooldown");

        craftingTypeDescriptions.substituteProperty("shaped", HashMap.class, "getShapedRecipe", "setShapedRecipeMap");
        craftingTypeDescriptions.substituteProperty("shapeless", HashMap.class, "getShapelessRecipe", "setShapelessRecipeMap");
        craftingTypeDescriptions.substituteProperty("furnace", HashMap.class, "getFurnaceRecipe", "setFurnaceRecipeMap");
        craftingTypeDescriptions.substituteProperty("blast", HashMap.class, "getBlastRecipe", "setBlastRecipeMap");
        craftingTypeDescriptions.substituteProperty("smoker", HashMap.class, "getSmokerRecipe", "setSmokerRecipeMap");
        craftingTypeDescriptions.substituteProperty("campfire", HashMap.class, "getCampfireRecipe", "setCampfireRecipeMap");

        baseTypeDescription.substituteProperty("craft-permission", String.class, "getCraftPermission", "setCraftPermission");
        baseTypeDescription.substituteProperty("crafted-amount", Double.class, "getCraftedAmount", "setCraftedAmount");
        baseTypeDescription.substituteProperty("gem-sockets", ArrayList.class, "getGemSockets", "setGemSockets");
        baseTypeDescription.substituteProperty("repair-type", String.class, "getRepairType", "setRepairType");
        baseTypeDescription.substituteProperty("health-regeneration", NumericStat.class, "getHealthRegeneration", "setHealthRegeneration");
        baseTypeDescription.substituteProperty("mana-regeneration", NumericStat.class, "getManaRegeneration", "setManaRegeneration");
        baseTypeDescription.substituteProperty("max-stamina", NumericStat.class, "getMaxStamina", "setMaxStamina");
        baseTypeDescription.substituteProperty("stamina-regeneration", NumericStat.class, "getStaminaRegeneration", "setStaminaRegeneration");
        baseTypeDescription.substituteProperty("additional-experience", NumericStat.class, "getAdditionalExperience", "setAdditionalExperience");
        baseTypeDescription.substituteProperty("faction-damage-enemy", NumericStat.class, "getFactionDamageEnemy", "setFactionDamageEnemy");
        baseTypeDescription.substituteProperty("required-dexterity", NumericStat.class, "getRequiredDexterity", "setRequiredDexterity");
        baseTypeDescription.substituteProperty("required-strength", NumericStat.class, "getRequiredStrength", "setRequiredStrength");
        baseTypeDescription.substituteProperty("profession-enchanting", NumericStat.class, "getProfessionEnchanting", "setProfessionEnchanting");
        baseTypeDescription.substituteProperty("profession-smithing", NumericStat.class, "getProfessionSmithing", "setProfessionSmithing");
        baseTypeDescription.substituteProperty("profession-mining", NumericStat.class, "getProfessionMining", "setProfessionMining");

        numericStatsTypeDescription.substituteProperty("max-spread", Double.class, "getMaxSpread", "setMaxSpread");

        // consumable
        baseTypeDescription.substituteProperty("disable-right-click-consume", Boolean.class, "getDisableRightClickConsume", "setDisableRightClickConsume");
        baseTypeDescription.substituteProperty("restore-health", NumericStat.class, "getRestoreHealth", "setRestoreHealth");
        baseTypeDescription.substituteProperty("restore-food", NumericStat.class, "getRestoreFood", "setRestoreFood");
        baseTypeDescription.substituteProperty("restore-saturation", NumericStat.class, "getRestoreSaturation", "setRestoreSaturation");
        baseTypeDescription.substituteProperty("restore-mana", NumericStat.class, "getRestoreMana", "setRestoreMana");
        baseTypeDescription.substituteProperty("restore-stamina", NumericStat.class, "getRestoreStamina", "setRestoreStamina");
        baseTypeDescription.substituteProperty("can-identify", Boolean.class, "getCanIdentify", "setCanIdentify");
        baseTypeDescription.substituteProperty("can-deconstruct", Boolean.class, "getCanDeconstruct", "setCanDeconstruct");
        baseTypeDescription.substituteProperty("can-deskin", Boolean.class, "getCanDeskin", "setCanDeskin");
        baseTypeDescription.substituteProperty("soulbinding-chance", NumericStat.class, "getSoulbindingChance", "setSoulbindingChance");
        baseTypeDescription.substituteProperty("soulbinding-break-chance", NumericStat.class, "getSoulbindingBreakChance", "setSoulbindingBreakChance");
        baseTypeDescription.substituteProperty("soulbound-level", NumericStat.class, "getSoulboundLevel", "setSoulboundLevel");
        baseTypeDescription.substituteProperty("vanilla-eating", Boolean.class, "getVanillaEating", "setVanillaEating");
        baseTypeDescription.substituteProperty("max-consume", Double.class, "getMaxConsume", "setMaxConsume");

        // bows
        baseTypeDescription.substituteProperty("arrow-particles", ItemParticle.class, "getArrowParticles", "setArrowParticles");
        baseTypeDescription.substituteProperty("arrow-velocity", Double.class, "getArrowVelocity", "setArrowVelocity");
        baseTypeDescription.substituteProperty("arrow-potion-effects", PotionEffect.class, "getArrowPotionEffects", "setArrowPotionEffects");
    }
}
