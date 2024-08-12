package xyz.gamars.objects;

import xyz.gamars.crafting.CraftingRecipe;
import xyz.gamars.objects.base.*;
import xyz.gamars.snakeyaml.CleanRepresenter;

import java.util.ArrayList;
import java.util.HashMap;

public class MMOItem {

    private String id;
    private String material;
    private NumericStat durability;
    private Double customModelData;
    private NumericStat maxDurability;
    private Boolean willBreak;
    private String name;
    private HashMap<String, HashMap<String, String>> skullTexture;
    private String gemColor;
    private String gemUpgradeScaling;
    private ArrayList<String> itemTypeRestriction;
    private ArrayList<String> lore;
    private String loreFormat;
    private String displayedType;
    private HashMap<String, Double> enchants;
    private Boolean hideEnchants;
    private String permission;
    private ItemParticle itemParticles;
    private Boolean disableInteraction;
    private Boolean disableCrafting;
    private Boolean disableSmelting;
    private Boolean disableSmithing;
    private Boolean disableAdvancedEnchants;
    private Boolean disableEnchanting;
    private Boolean disableRepairing;
    private Boolean disableAttackPassive;
    private Boolean disableDeathDrop;
    private Boolean disableDropping;
    private Boolean durabilityBar;
    private Double customScrap;
    private String dyeColor;
    private Boolean hideDye;
    private Boolean hideArmorTrim;
    private String trimMaterial;
    private String trimPattern;
    private ArrayList<String> requiredClass;
    private NumericStat successRate;
    private NumericStat attackDamage;
    private NumericStat attackSpeed;
    private NumericStat criticalStrikeChance;
    private NumericStat criticalStrikePower;
    private NumericStat blockPower;
    private NumericStat blockRating;
    private Boolean breakDowngrade;
    private Boolean deathDowngrade;
    private Boolean deathDowngradeChance;
    private NumericStat blockCooldownReduction;
    private NumericStat dodgeRating;
    private NumericStat dodgeCooldownReduction;
    private NumericStat parryRating;
    private NumericStat parryCooldownReduction;
    private NumericStat cooldownReduction;
    private NumericStat manaCost;
    private NumericStat staminaCost;
    private NumericStat pveDamage;
    private NumericStat pvpDamage;
    private NumericStat weaponDamage;
    private NumericStat skillDamage;
    private NumericStat projectileDamage;
    private NumericStat magicDamage;
    private NumericStat physicalDamage;
    private NumericStat defense;
    private NumericStat lifesteal;
    private NumericStat damageReduction;
    private NumericStat fallDamageReduction;
    private NumericStat projectileDamageReduction;
    private NumericStat physicalDamageReduction;
    private NumericStat fireDamageReduction;
    private NumericStat magicDamageReduction;
    private NumericStat pveDamageReduction;
    private NumericStat pvpDamageReduction;
    private NumericStat undeadDamage;
    private Boolean unbreakable;
    private String tier;
    private String set;
    private NumericStat armor;
    private NumericStat armorToughness;
    private NumericStat maxHealth;
    private Boolean unstackable;
    private NumericStat maxMana;
    private NumericStat knockbackResistance;
    private NumericStat movementSpeed;
    private Boolean twoHanded;
    private Double equipPriority;
    private HashMap<String, PotionEffect> permEffects;
    private ArrayList<String> grantedPermissions;
    private NumericStat itemCooldown;
    private CraftingRecipe crafting;
    private String craftPermission;
    private Double craftedAmount;
    private HashMap<String, SoundEffect> sounds;
    private HashMap<String, HashMap<String, HashMap<String, Double>>> element;
    private HashMap<String, HashMap<String, Command>> commands;
    private ArrayList<String> gemSockets;
    private String repairType;
    private HashMap<String, HashMap<String, Ability>> ability;
    private HashMap<String, Boolean> upgrade;
    private NumericStat healthRegeneration;
    private NumericStat manaRegeneration;
    private NumericStat maxStamina;
    private NumericStat staminaRegeneration;
    private NumericStat additionalExperience;
    private NumericStat factionDamageEnemy;
    private NumericStat requiredLevel;
    private NumericStat requiredDexterity;
    private NumericStat requiredStrength;
    private NumericStat professionEnchanting;
    private NumericStat professionSmithing;
    private NumericStat professionMining;

    // consumable fields
    private Boolean disableRightClickConsume;
    private NumericStat restoreHealth;
    private NumericStat restoreFood;
    private NumericStat restoreSaturation;
    private NumericStat restoreMana;
    private NumericStat restoreStamina;
    private Boolean canIdentify;
    private Boolean canDeconstruct;
    private Boolean canDeskin;
    private HashMap<String, PotionEffect> effects;
    private NumericStat soulbindingChance;
    private NumericStat souldboundBreakChance;
    private NumericStat soulboundLevel;
    private Boolean vanillaEating;
    private Boolean inedible;
    private Boolean maxConsume;
    private Double repair;

    // bow fields
    private ItemParticle arrowParticles;
    private Double arrowVelocity;
    private PotionEffect arrowPotionEffects;

    private HashMap<String, Object> additionalInfo;

    public MMOItem() {
        this.additionalInfo = new HashMap<>();
    }

    public HashMap<String, HashMap<String, String>> getSkullTexture() {
        return skullTexture;
    }

    public void setSkullTexture(HashMap<String, HashMap<String, String>> skullTexture) {
        this.skullTexture = skullTexture;
    }

    public Boolean getDisableDropping() {
        return disableDropping;
    }

    public void setDisableDropping(Boolean disableDropping) {
        this.disableDropping = disableDropping;
    }

    public Boolean getBreakDowngrade() {
        return breakDowngrade;
    }

    public void setBreakDowngrade(Boolean breakDowngrade) {
        this.breakDowngrade = breakDowngrade;
    }

    public Boolean getDeathDowngrade() {
        return deathDowngrade;
    }

    public void setDeathDowngrade(Boolean deathDowngrade) {
        this.deathDowngrade = deathDowngrade;
    }

    public Boolean getDeathDowngradeChance() {
        return deathDowngradeChance;
    }

    public void setDeathDowngradeChance(Boolean deathDowngradeChance) {
        this.deathDowngradeChance = deathDowngradeChance;
    }


    public void addAdditionalInfo(String key, Object object) {
        CleanRepresenter.order.add(key);
        additionalInfo.put(key, object);
    }

    public HashMap<String, Object> getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(HashMap<String, Object> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public NumericStat getLifesteal() {
        return lifesteal;
    }

    public void setLifesteal(NumericStat lifesteal) {
        this.lifesteal = lifesteal;
    }

    public Double getCustomScrap() {
        return customScrap;
    }

    public void setCustomScrap(Double customScrap) {
        this.customScrap = customScrap;
    }

    public Boolean getDurabilityBar() {
        return durabilityBar;
    }

    public void setDurabilityBar(Boolean durabilityBar) {
        this.durabilityBar = durabilityBar;
    }

    public Boolean getDisableDeathDrop() {
        return disableDeathDrop;
    }

    public void setDisableDeathDrop(Boolean disableDeathDrop) {
        this.disableDeathDrop = disableDeathDrop;
    }

    public Boolean getDisableAdvancedEnchants() {
        return disableAdvancedEnchants;
    }

    public void setDisableAdvancedEnchants(Boolean disableAdvancedEnchants) {
        this.disableAdvancedEnchants = disableAdvancedEnchants;
    }

    public Boolean getHideArmorTrim() {
        return hideArmorTrim;
    }

    public void setHideArmorTrim(Boolean hideArmorTrim) {
        this.hideArmorTrim = hideArmorTrim;
    }

    public String getTrimMaterial() {
        return trimMaterial;
    }

    public void setTrimMaterial(String trimMaterial) {
        this.trimMaterial = trimMaterial;
    }

    public String getTrimPattern() {
        return trimPattern;
    }

    public void setTrimPattern(String trimPattern) {
        this.trimPattern = trimPattern;
    }

    public String getDyeColor() {
        return dyeColor;
    }

    public void setDyeColor(String dyeColor) {
        this.dyeColor = dyeColor;
    }

    public Boolean getHideDye() {
        return hideDye;
    }

    public void setHideDye(Boolean hideDye) {
        this.hideDye = hideDye;
    }

    public ArrayList<String> getItemTypeRestriction() {
        return itemTypeRestriction;
    }

    public void setItemTypeRestriction(ArrayList<String> itemTypeRestriction) {
        this.itemTypeRestriction = itemTypeRestriction;
    }

    public String getGemUpgradeScaling() {
        return gemUpgradeScaling;
    }

    public void setGemUpgradeScaling(String gemUpgradeScaling) {
        this.gemUpgradeScaling = gemUpgradeScaling;
    }

    public String getGemColor() {
        return gemColor;
    }

    public void setGemColor(String gemColor) {
        this.gemColor = gemColor;
    }

    public Boolean getDisableRightClickConsume() {
        return disableRightClickConsume;
    }

    public void setDisableRightClickConsume(Boolean disableRightClickConsume) {
        this.disableRightClickConsume = disableRightClickConsume;
    }

    public NumericStat getRestoreHealth() {
        return restoreHealth;
    }

    public void setRestoreHealth(NumericStat restoreHealth) {
        this.restoreHealth = restoreHealth;
    }

    public NumericStat getRestoreFood() {
        return restoreFood;
    }

    public void setRestoreFood(NumericStat restoreFood) {
        this.restoreFood = restoreFood;
    }

    public NumericStat getRestoreSaturation() {
        return restoreSaturation;
    }

    public void setRestoreSaturation(NumericStat restoreSaturation) {
        this.restoreSaturation = restoreSaturation;
    }

    public NumericStat getRestoreMana() {
        return restoreMana;
    }

    public void setRestoreMana(NumericStat restoreMana) {
        this.restoreMana = restoreMana;
    }

    public NumericStat getRestoreStamina() {
        return restoreStamina;
    }

    public void setRestoreStamina(NumericStat restoreStamina) {
        this.restoreStamina = restoreStamina;
    }

    public Boolean getCanIdentify() {
        return canIdentify;
    }

    public void setCanIdentify(Boolean canIdentify) {
        this.canIdentify = canIdentify;
    }

    public Boolean getCanDeconstruct() {
        return canDeconstruct;
    }

    public void setCanDeconstruct(Boolean canDeconstruct) {
        this.canDeconstruct = canDeconstruct;
    }

    public Boolean getCanDeskin() {
        return canDeskin;
    }

    public void setCanDeskin(Boolean canDeskin) {
        this.canDeskin = canDeskin;
    }

    public HashMap<String, PotionEffect> getEffects() {
        return effects;
    }

    public void setEffects(HashMap<String, PotionEffect> effects) {
        this.effects = effects;
    }

    public NumericStat getSoulbindingChance() {
        return soulbindingChance;
    }

    public void setSoulbindingChance(NumericStat soulbindingChance) {
        this.soulbindingChance = soulbindingChance;
    }

    public NumericStat getSouldboundBreakChance() {
        return souldboundBreakChance;
    }

    public void setSouldboundBreakChance(NumericStat souldboundBreakChance) {
        this.souldboundBreakChance = souldboundBreakChance;
    }

    public NumericStat getSoulboundLevel() {
        return soulboundLevel;
    }

    public void setSoulboundLevel(NumericStat soulboundLevel) {
        this.soulboundLevel = soulboundLevel;
    }

    public Boolean getVanillaEating() {
        return vanillaEating;
    }

    public void setVanillaEating(Boolean vanillaEating) {
        this.vanillaEating = vanillaEating;
    }

    public Boolean getInedible() {
        return inedible;
    }

    public void setInedible(Boolean inedible) {
        this.inedible = inedible;
    }

    public Boolean getMaxConsume() {
        return maxConsume;
    }

    public void setMaxConsume(Boolean maxConsume) {
        this.maxConsume = maxConsume;
    }

    public Double getRepair() {
        return repair;
    }

    public void setRepair(Double repair) {
        this.repair = repair;
    }

    public ItemParticle getArrowParticles() {
        return arrowParticles;
    }

    public void setArrowParticles(ItemParticle arrowParticles) {
        this.arrowParticles = arrowParticles;
    }

    public Double getArrowVelocity() {
        return arrowVelocity;
    }

    public void setArrowVelocity(Double arrowVelocity) {
        this.arrowVelocity = arrowVelocity;
    }

    public PotionEffect getArrowPotionEffects() {
        return arrowPotionEffects;
    }

    public void setArrowPotionEffects(PotionEffect arrowPotionEffects) {
        this.arrowPotionEffects = arrowPotionEffects;
    }

    public NumericStat getRequiredLevel() {
        return requiredLevel;
    }

    public void setRequiredLevel(NumericStat requiredLevel) {
        this.requiredLevel = requiredLevel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public NumericStat getDurability() {
        return durability;
    }

    public void setDurability(NumericStat durability) {
        this.durability = durability;
    }

    public NumericStat getMaxDurability() {
        return maxDurability;
    }

    public void setMaxDurability(NumericStat maxDurability) {
        this.maxDurability = maxDurability;
    }

    public Double getCustomModelData() {
        return customModelData;
    }

    public void setCustomModelData(Double customModelData) {
        this.customModelData = customModelData;
    }

    public Boolean getWillBreak() {
        return willBreak;
    }

    public void setWillBreak(Boolean willBreak) {
        this.willBreak = willBreak;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getLore() {
        return lore;
    }

    public void setLore(ArrayList<String> lore) {
        this.lore = lore;
    }

    public String getLoreFormat() {
        return loreFormat;
    }

    public void setLoreFormat(String loreFormat) {
        this.loreFormat = loreFormat;
    }

    public String getDisplayedType() {
        return displayedType;
    }

    public void setDisplayedType(String displayedType) {
        this.displayedType = displayedType;
    }

    public HashMap<String, Double>  getEnchants() {
        return enchants;
    }

    public void setEnchants(HashMap<String, Double>  enchants) {
        this.enchants = enchants;
    }

    public Boolean getHideEnchants() {
        return hideEnchants;
    }

    public void setHideEnchants(Boolean hideEnchants) {
        this.hideEnchants = hideEnchants;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public ItemParticle getItemParticles() {
        return itemParticles;
    }

    public void setItemParticles(ItemParticle itemParticles) {
        this.itemParticles = itemParticles;
    }

    public Boolean getDisableInteraction() {
        return disableInteraction;
    }

    public void setDisableInteraction(Boolean disableInteraction) {
        this.disableInteraction = disableInteraction;
    }

    public Boolean getDisableCrafting() {
        return disableCrafting;
    }

    public void setDisableCrafting(Boolean disableCrafting) {
        this.disableCrafting = disableCrafting;
    }

    public Boolean getDisableSmelting() {
        return disableSmelting;
    }

    public void setDisableSmelting(Boolean disableSmelting) {
        this.disableSmelting = disableSmelting;
    }

    public Boolean getDisableSmithing() {
        return disableSmithing;
    }

    public void setDisableSmithing(Boolean disableSmithing) {
        this.disableSmithing = disableSmithing;
    }

    public Boolean getDisableEnchanting() {
        return disableEnchanting;
    }

    public void setDisableEnchanting(Boolean disableEnchanting) {
        this.disableEnchanting = disableEnchanting;
    }

    public Boolean getDisableRepairing() {
        return disableRepairing;
    }

    public void setDisableRepairing(Boolean disableRepairing) {
        this.disableRepairing = disableRepairing;
    }

    public Boolean getDisableAttackPassive() {
        return disableAttackPassive;
    }

    public void setDisableAttackPassive(Boolean disableAttackPassive) {
        this.disableAttackPassive = disableAttackPassive;
    }

    public ArrayList<String> getRequiredClass() {
        return requiredClass;
    }

    public void setRequiredClass(ArrayList<String> requiredClass) {
        this.requiredClass = requiredClass;
    }

    public NumericStat getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(NumericStat successRate) {
        this.successRate = successRate;
    }

    public NumericStat getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(NumericStat attackDamage) {
        this.attackDamage = attackDamage;
    }

    public NumericStat getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(NumericStat attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public NumericStat getCriticalStrikeChance() {
        return criticalStrikeChance;
    }

    public void setCriticalStrikeChance(NumericStat criticalStrikeChance) {
        this.criticalStrikeChance = criticalStrikeChance;
    }

    public NumericStat getCriticalStrikePower() {
        return criticalStrikePower;
    }

    public void setCriticalStrikePower(NumericStat criticalStrikePower) {
        this.criticalStrikePower = criticalStrikePower;
    }

    public NumericStat getBlockPower() {
        return blockPower;
    }

    public void setBlockPower(NumericStat blockPower) {
        this.blockPower = blockPower;
    }

    public NumericStat getBlockRating() {
        return blockRating;
    }

    public void setBlockRating(NumericStat blockRating) {
        this.blockRating = blockRating;
    }

    public NumericStat getBlockCooldownReduction() {
        return blockCooldownReduction;
    }

    public void setBlockCooldownReduction(NumericStat blockCooldownReduction) {
        this.blockCooldownReduction = blockCooldownReduction;
    }

    public NumericStat getDodgeRating() {
        return dodgeRating;
    }

    public void setDodgeRating(NumericStat dodgeRating) {
        this.dodgeRating = dodgeRating;
    }

    public NumericStat getDodgeCooldownReduction() {
        return dodgeCooldownReduction;
    }

    public void setDodgeCooldownReduction(NumericStat dodgeCooldownReduction) {
        this.dodgeCooldownReduction = dodgeCooldownReduction;
    }

    public NumericStat getParryRating() {
        return parryRating;
    }

    public void setParryRating(NumericStat parryRating) {
        this.parryRating = parryRating;
    }

    public NumericStat getParryCooldownReduction() {
        return parryCooldownReduction;
    }

    public void setParryCooldownReduction(NumericStat parryCooldownReduction) {
        this.parryCooldownReduction = parryCooldownReduction;
    }

    public NumericStat getCooldownReduction() {
        return cooldownReduction;
    }

    public void setCooldownReduction(NumericStat cooldownReduction) {
        this.cooldownReduction = cooldownReduction;
    }

    public NumericStat getManaCost() {
        return manaCost;
    }

    public void setManaCost(NumericStat manaCost) {
        this.manaCost = manaCost;
    }

    public NumericStat getStaminaCost() {
        return staminaCost;
    }

    public void setStaminaCost(NumericStat staminaCost) {
        this.staminaCost = staminaCost;
    }

    public NumericStat getPveDamage() {
        return pveDamage;
    }

    public void setPveDamage(NumericStat pveDamage) {
        this.pveDamage = pveDamage;
    }

    public NumericStat getPvpDamage() {
        return pvpDamage;
    }

    public void setPvpDamage(NumericStat pvpDamage) {
        this.pvpDamage = pvpDamage;
    }

    public NumericStat getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(NumericStat weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public NumericStat getSkillDamage() {
        return skillDamage;
    }

    public void setSkillDamage(NumericStat skillDamage) {
        this.skillDamage = skillDamage;
    }

    public NumericStat getProjectileDamage() {
        return projectileDamage;
    }

    public void setProjectileDamage(NumericStat projectileDamage) {
        this.projectileDamage = projectileDamage;
    }

    public NumericStat getMagicDamage() {
        return magicDamage;
    }

    public void setMagicDamage(NumericStat magicDamage) {
        this.magicDamage = magicDamage;
    }

    public NumericStat getPhysicalDamage() {
        return physicalDamage;
    }

    public void setPhysicalDamage(NumericStat physicalDamage) {
        this.physicalDamage = physicalDamage;
    }

    public NumericStat getDefense() {
        return defense;
    }

    public void setDefense(NumericStat defense) {
        this.defense = defense;
    }

    public NumericStat getDamageReduction() {
        return damageReduction;
    }

    public void setDamageReduction(NumericStat damageReduction) {
        this.damageReduction = damageReduction;
    }

    public NumericStat getFallDamageReduction() {
        return fallDamageReduction;
    }

    public void setFallDamageReduction(NumericStat fallDamageReduction) {
        this.fallDamageReduction = fallDamageReduction;
    }

    public NumericStat getProjectileDamageReduction() {
        return projectileDamageReduction;
    }

    public void setProjectileDamageReduction(NumericStat projectileDamageReduction) {
        this.projectileDamageReduction = projectileDamageReduction;
    }

    public NumericStat getPhysicalDamageReduction() {
        return physicalDamageReduction;
    }

    public void setPhysicalDamageReduction(NumericStat physicalDamageReduction) {
        this.physicalDamageReduction = physicalDamageReduction;
    }

    public NumericStat getFireDamageReduction() {
        return fireDamageReduction;
    }

    public void setFireDamageReduction(NumericStat fireDamageReduction) {
        this.fireDamageReduction = fireDamageReduction;
    }

    public NumericStat getMagicDamageReduction() {
        return magicDamageReduction;
    }

    public void setMagicDamageReduction(NumericStat magicDamageReduction) {
        this.magicDamageReduction = magicDamageReduction;
    }

    public NumericStat getPveDamageReduction() {
        return pveDamageReduction;
    }

    public void setPveDamageReduction(NumericStat pveDamageReduction) {
        this.pveDamageReduction = pveDamageReduction;
    }

    public NumericStat getPvpDamageReduction() {
        return pvpDamageReduction;
    }

    public void setPvpDamageReduction(NumericStat pvpDamageReduction) {
        this.pvpDamageReduction = pvpDamageReduction;
    }

    public NumericStat getUndeadDamage() {
        return undeadDamage;
    }

    public void setUndeadDamage(NumericStat undeadDamage) {
        this.undeadDamage = undeadDamage;
    }

    public Boolean getUnbreakable() {
        return unbreakable;
    }

    public void setUnbreakable(Boolean unbreakable) {
        this.unbreakable = unbreakable;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public NumericStat getArmor() {
        return armor;
    }

    public void setArmor(NumericStat armor) {
        this.armor = armor;
    }

    public NumericStat getArmorToughness() {
        return armorToughness;
    }

    public void setArmorToughness(NumericStat armorToughness) {
        this.armorToughness = armorToughness;
    }

    public NumericStat getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(NumericStat maxHealth) {
        this.maxHealth = maxHealth;
    }

    public Boolean getUnstackable() {
        return unstackable;
    }

    public void setUnstackable(Boolean unstackable) {
        this.unstackable = unstackable;
    }

    public NumericStat getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(NumericStat maxMana) {
        this.maxMana = maxMana;
    }

    public NumericStat getKnockbackResistance() {
        return knockbackResistance;
    }

    public void setKnockbackResistance(NumericStat knockbackResistance) {
        this.knockbackResistance = knockbackResistance;
    }

    public NumericStat getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(NumericStat movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public Boolean getTwoHanded() {
        return twoHanded;
    }

    public void setTwoHanded(Boolean twoHanded) {
        this.twoHanded = twoHanded;
    }

    public Double getEquipPriority() {
        return equipPriority;
    }

    public void setEquipPriority(Double equipPriority) {
        this.equipPriority = equipPriority;
    }

    public HashMap<String, PotionEffect> getPermEffects() {
        return permEffects;
    }

    public void setPermEffects(HashMap<String, PotionEffect> permEffects) {
        this.permEffects = permEffects;
    }

    public ArrayList<String> getGrantedPermissions() {
        return grantedPermissions;
    }

    public void setGrantedPermissions(ArrayList<String> grantedPermissions) {
        this.grantedPermissions = grantedPermissions;
    }

    public NumericStat getItemCooldown() {
        return itemCooldown;
    }

    public void setItemCooldown(NumericStat itemCooldown) {
        this.itemCooldown = itemCooldown;
    }

    public CraftingRecipe getCrafting() {
        return crafting;
    }

    public void setCrafting(CraftingRecipe crafting) {
        this.crafting = crafting;
    }

    public String getCraftPermission() {
        return craftPermission;
    }

    public void setCraftPermission(String craftPermission) {
        this.craftPermission = craftPermission;
    }

    public Double getCraftedAmount() {
        return craftedAmount;
    }

    public void setCraftedAmount(Double craftedAmount) {
        this.craftedAmount = craftedAmount;
    }

    public HashMap<String, SoundEffect> getSounds() {
        return sounds;
    }

    public void setSounds(HashMap<String, SoundEffect> sounds) {
        this.sounds = sounds;
    }

    public HashMap<String, HashMap<String, HashMap<String, Double>>> getElement() {
        return element;
    }

    public void setElement(HashMap<String, HashMap<String, HashMap<String, Double>>> element) {
        this.element = element;
    }

    public HashMap<String, HashMap<String, Command>> getCommands() {
        return commands;
    }

    public void setCommands(HashMap<String, HashMap<String, Command>> commands) {
        this.commands = commands;
    }

    public ArrayList<String> getGemSockets() {
        return gemSockets;
    }

    public void setGemSockets(ArrayList<String> gemSockets) {
        this.gemSockets = gemSockets;
    }

    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType;
    }

    public HashMap<String, HashMap<String, Ability>> getAbility() {
        return ability;
    }

    public void setAbility(HashMap<String, HashMap<String, Ability>> ability) {
        this.ability = ability;
    }

    public HashMap<String, Boolean> getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(HashMap<String, Boolean> upgrade) {
        this.upgrade = upgrade;
    }

    public NumericStat getHealthRegeneration() {
        return healthRegeneration;
    }

    public void setHealthRegeneration(NumericStat healthRegeneration) {
        this.healthRegeneration = healthRegeneration;
    }

    public NumericStat getManaRegeneration() {
        return manaRegeneration;
    }

    public void setManaRegeneration(NumericStat manaRegeneration) {
        this.manaRegeneration = manaRegeneration;
    }

    public NumericStat getMaxStamina() {
        return maxStamina;
    }

    public void setMaxStamina(NumericStat maxStamina) {
        this.maxStamina = maxStamina;
    }

    public NumericStat getStaminaRegeneration() {
        return staminaRegeneration;
    }

    public void setStaminaRegeneration(NumericStat staminaRegeneration) {
        this.staminaRegeneration = staminaRegeneration;
    }

    public NumericStat getAdditionalExperience() {
        return additionalExperience;
    }

    public void setAdditionalExperience(NumericStat additionalExperience) {
        this.additionalExperience = additionalExperience;
    }

    public NumericStat getFactionDamageEnemy() {
        return factionDamageEnemy;
    }

    public void setFactionDamageEnemy(NumericStat factionDamageEnemy) {
        this.factionDamageEnemy = factionDamageEnemy;
    }

    public NumericStat getRequiredDexterity() {
        return requiredDexterity;
    }

    public void setRequiredDexterity(NumericStat requiredDexterity) {
        this.requiredDexterity = requiredDexterity;
    }

    public NumericStat getRequiredStrength() {
        return requiredStrength;
    }

    public void setRequiredStrength(NumericStat requiredStrength) {
        this.requiredStrength = requiredStrength;
    }

    public NumericStat getProfessionEnchanting() {
        return professionEnchanting;
    }

    public void setProfessionEnchanting(NumericStat professionEnchanting) {
        this.professionEnchanting = professionEnchanting;
    }

    public NumericStat getProfessionSmithing() {
        return professionSmithing;
    }

    public void setProfessionSmithing(NumericStat professionSmithing) {
        this.professionSmithing = professionSmithing;
    }

    public NumericStat getProfessionMining() {
        return professionMining;
    }

    public void setProfessionMining(NumericStat professionMining) {
        this.professionMining = professionMining;
    }
}
