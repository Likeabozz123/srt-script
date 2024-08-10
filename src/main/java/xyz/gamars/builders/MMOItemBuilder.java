package xyz.gamars.builders;

import xyz.gamars.crafting.CraftingRecipe;
import xyz.gamars.objects.MMOItem;
import xyz.gamars.objects.base.*;

import java.util.ArrayList;
import java.util.HashMap;

public final class MMOItemBuilder {

    private String id;
    private String material;
    private NumericStat durability;
    private Double customModelData;
    private NumericStat maxDurability;
    private Boolean willBreak;
    private String name;
    private ArrayList<String> lore;
    private String loreFormat;
    private String displayedType;
    private HashMap<String, Double> enchants;
    private Boolean hideEnchants;
    private String permission;
    private ItemParticle itemParticle;
    private Boolean disableInteraction;
    private Boolean disableCrafting;
    private Boolean disableSmelting;
    private Boolean disableSmithing;
    private Boolean disableEnchanting;
    private Boolean disableRepairing;
    private Boolean disableAttackPassive;
    private ArrayList<String> requiredClass;
    private NumericStat successRate;
    private NumericStat attackDamage;
    private NumericStat attackSpeed;
    private NumericStat criticalStrikeChance;
    private NumericStat criticalStrikePower;
    private NumericStat blockPower;
    private NumericStat blockRating;
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
    private ItemParticle arrowParticles;
    private Double arrowVelocity;
    private PotionEffect arrowPotionEffects;

    private MMOItemBuilder() {
    }

    public static MMOItemBuilder mmoItem() {
        return new MMOItemBuilder();
    }

    public MMOItemBuilder id(String id) {
        this.id = id;
        return this;
    }

    public MMOItemBuilder material(String material) {
        this.material = material;
        return this;
    }

    public MMOItemBuilder durability(NumericStat durability) {
        this.durability = durability;
        return this;
    }

    public MMOItemBuilder customModelData(Double customModelData) {
        this.customModelData = customModelData;
        return this;
    }

    public MMOItemBuilder maxDurability(NumericStat maxDurability) {
        this.maxDurability = maxDurability;
        return this;
    }

    public MMOItemBuilder willBreak(Boolean willBreak) {
        this.willBreak = willBreak;
        return this;
    }

    public MMOItemBuilder name(String name) {
        this.name = name;
        return this;
    }

    public MMOItemBuilder lore(ArrayList<String> lore) {
        this.lore = lore;
        return this;
    }

    public MMOItemBuilder loreFormat(String loreFormat) {
        this.loreFormat = loreFormat;
        return this;
    }

    public MMOItemBuilder displayedType(String displayedType) {
        this.displayedType = displayedType;
        return this;
    }

    public MMOItemBuilder enchants(HashMap<String, Double> enchants) {
        this.enchants = enchants;
        return this;
    }

    public MMOItemBuilder hideEnchants(Boolean hideEnchants) {
        this.hideEnchants = hideEnchants;
        return this;
    }

    public MMOItemBuilder permission(String permission) {
        this.permission = permission;
        return this;
    }

    public MMOItemBuilder itemParticle(ItemParticle itemParticle) {
        this.itemParticle = itemParticle;
        return this;
    }

    public MMOItemBuilder disableInteraction(Boolean disableInteraction) {
        this.disableInteraction = disableInteraction;
        return this;
    }

    public MMOItemBuilder disableCrafting(Boolean disableCrafting) {
        this.disableCrafting = disableCrafting;
        return this;
    }

    public MMOItemBuilder disableSmelting(Boolean disableSmelting) {
        this.disableSmelting = disableSmelting;
        return this;
    }

    public MMOItemBuilder disableSmithing(Boolean disableSmithing) {
        this.disableSmithing = disableSmithing;
        return this;
    }

    public MMOItemBuilder disableEnchanting(Boolean disableEnchanting) {
        this.disableEnchanting = disableEnchanting;
        return this;
    }

    public MMOItemBuilder disableRepairing(Boolean disableRepairing) {
        this.disableRepairing = disableRepairing;
        return this;
    }

    public MMOItemBuilder disableAttackPassive(Boolean disableAttackPassive) {
        this.disableAttackPassive = disableAttackPassive;
        return this;
    }

    public MMOItemBuilder requiredClass(ArrayList<String> requiredClass) {
        this.requiredClass = requiredClass;
        return this;
    }

    public MMOItemBuilder successRate(NumericStat successRate) {
        this.successRate = successRate;
        return this;
    }

    public MMOItemBuilder attackDamage(NumericStat attackDamage) {
        this.attackDamage = attackDamage;
        return this;
    }

    public MMOItemBuilder attackSpeed(NumericStat attackSpeed) {
        this.attackSpeed = attackSpeed;
        return this;
    }

    public MMOItemBuilder criticalStrikeChance(NumericStat criticalStrikeChance) {
        this.criticalStrikeChance = criticalStrikeChance;
        return this;
    }

    public MMOItemBuilder criticalStrikePower(NumericStat criticalStrikePower) {
        this.criticalStrikePower = criticalStrikePower;
        return this;
    }

    public MMOItemBuilder blockPower(NumericStat blockPower) {
        this.blockPower = blockPower;
        return this;
    }

    public MMOItemBuilder blockRating(NumericStat blockRating) {
        this.blockRating = blockRating;
        return this;
    }

    public MMOItemBuilder blockCooldownReduction(NumericStat blockCooldownReduction) {
        this.blockCooldownReduction = blockCooldownReduction;
        return this;
    }

    public MMOItemBuilder dodgeRating(NumericStat dodgeRating) {
        this.dodgeRating = dodgeRating;
        return this;
    }

    public MMOItemBuilder dodgeCooldownReduction(NumericStat dodgeCooldownReduction) {
        this.dodgeCooldownReduction = dodgeCooldownReduction;
        return this;
    }

    public MMOItemBuilder parryRating(NumericStat parryRating) {
        this.parryRating = parryRating;
        return this;
    }

    public MMOItemBuilder parryCooldownReduction(NumericStat parryCooldownReduction) {
        this.parryCooldownReduction = parryCooldownReduction;
        return this;
    }

    public MMOItemBuilder cooldownReduction(NumericStat cooldownReduction) {
        this.cooldownReduction = cooldownReduction;
        return this;
    }

    public MMOItemBuilder manaCost(NumericStat manaCost) {
        this.manaCost = manaCost;
        return this;
    }

    public MMOItemBuilder staminaCost(NumericStat staminaCost) {
        this.staminaCost = staminaCost;
        return this;
    }

    public MMOItemBuilder pveDamage(NumericStat pveDamage) {
        this.pveDamage = pveDamage;
        return this;
    }

    public MMOItemBuilder pvpDamage(NumericStat pvpDamage) {
        this.pvpDamage = pvpDamage;
        return this;
    }

    public MMOItemBuilder weaponDamage(NumericStat weaponDamage) {
        this.weaponDamage = weaponDamage;
        return this;
    }

    public MMOItemBuilder skillDamage(NumericStat skillDamage) {
        this.skillDamage = skillDamage;
        return this;
    }

    public MMOItemBuilder projectileDamage(NumericStat projectileDamage) {
        this.projectileDamage = projectileDamage;
        return this;
    }

    public MMOItemBuilder magicDamage(NumericStat magicDamage) {
        this.magicDamage = magicDamage;
        return this;
    }

    public MMOItemBuilder physicalDamage(NumericStat physicalDamage) {
        this.physicalDamage = physicalDamage;
        return this;
    }

    public MMOItemBuilder defense(NumericStat defense) {
        this.defense = defense;
        return this;
    }

    public MMOItemBuilder damageReduction(NumericStat damageReduction) {
        this.damageReduction = damageReduction;
        return this;
    }

    public MMOItemBuilder fallDamageReduction(NumericStat fallDamageReduction) {
        this.fallDamageReduction = fallDamageReduction;
        return this;
    }

    public MMOItemBuilder projectileDamageReduction(NumericStat projectileDamageReduction) {
        this.projectileDamageReduction = projectileDamageReduction;
        return this;
    }

    public MMOItemBuilder physicalDamageReduction(NumericStat physicalDamageReduction) {
        this.physicalDamageReduction = physicalDamageReduction;
        return this;
    }

    public MMOItemBuilder fireDamageReduction(NumericStat fireDamageReduction) {
        this.fireDamageReduction = fireDamageReduction;
        return this;
    }

    public MMOItemBuilder magicDamageReduction(NumericStat magicDamageReduction) {
        this.magicDamageReduction = magicDamageReduction;
        return this;
    }

    public MMOItemBuilder pveDamageReduction(NumericStat pveDamageReduction) {
        this.pveDamageReduction = pveDamageReduction;
        return this;
    }

    public MMOItemBuilder pvpDamageReduction(NumericStat pvpDamageReduction) {
        this.pvpDamageReduction = pvpDamageReduction;
        return this;
    }

    public MMOItemBuilder undeadDamage(NumericStat undeadDamage) {
        this.undeadDamage = undeadDamage;
        return this;
    }

    public MMOItemBuilder unbreakable(Boolean unbreakable) {
        this.unbreakable = unbreakable;
        return this;
    }

    public MMOItemBuilder tier(String tier) {
        this.tier = tier;
        return this;
    }

    public MMOItemBuilder set(String set) {
        this.set = set;
        return this;
    }

    public MMOItemBuilder armor(NumericStat armor) {
        this.armor = armor;
        return this;
    }

    public MMOItemBuilder armorToughness(NumericStat armorToughness) {
        this.armorToughness = armorToughness;
        return this;
    }

    public MMOItemBuilder maxHealth(NumericStat maxHealth) {
        this.maxHealth = maxHealth;
        return this;
    }

    public MMOItemBuilder unstackable(Boolean unstackable) {
        this.unstackable = unstackable;
        return this;
    }

    public MMOItemBuilder maxMana(NumericStat maxMana) {
        this.maxMana = maxMana;
        return this;
    }

    public MMOItemBuilder knockbackResistance(NumericStat knockbackResistance) {
        this.knockbackResistance = knockbackResistance;
        return this;
    }

    public MMOItemBuilder movementSpeed(NumericStat movementSpeed) {
        this.movementSpeed = movementSpeed;
        return this;
    }

    public MMOItemBuilder twoHanded(Boolean twoHanded) {
        this.twoHanded = twoHanded;
        return this;
    }

    public MMOItemBuilder equipPriority(Double equipPriority) {
        this.equipPriority = equipPriority;
        return this;
    }

    public MMOItemBuilder permEffects(HashMap<String, PotionEffect> permEffects) {
        this.permEffects = permEffects;
        return this;
    }

    public MMOItemBuilder grantedPermissions(ArrayList<String> grantedPermissions) {
        this.grantedPermissions = grantedPermissions;
        return this;
    }

    public MMOItemBuilder itemCooldown(NumericStat itemCooldown) {
        this.itemCooldown = itemCooldown;
        return this;
    }

    public MMOItemBuilder crafting(CraftingRecipe crafting) {
        this.crafting = crafting;
        return this;
    }

    public MMOItemBuilder craftPermission(String craftPermission) {
        this.craftPermission = craftPermission;
        return this;
    }

    public MMOItemBuilder craftedAmount(Double craftedAmount) {
        this.craftedAmount = craftedAmount;
        return this;
    }

    public MMOItemBuilder sounds(HashMap<String, SoundEffect> sounds) {
        this.sounds = sounds;
        return this;
    }

    public MMOItemBuilder element(HashMap<String, HashMap<String, HashMap<String, Double>>> element) {
        this.element = element;
        return this;
    }

    public MMOItemBuilder commands(HashMap<String, HashMap<String, Command>> commands) {
        this.commands = commands;
        return this;
    }

    public MMOItemBuilder gemSockets(ArrayList<String> gemSockets) {
        this.gemSockets = gemSockets;
        return this;
    }

    public MMOItemBuilder repairType(String repairType) {
        this.repairType = repairType;
        return this;
    }

    public MMOItemBuilder ability(HashMap<String, HashMap<String, Ability>> ability) {
        this.ability = ability;
        return this;
    }

    public MMOItemBuilder upgrade(HashMap<String, Boolean> upgrade) {
        this.upgrade = upgrade;
        return this;
    }

    public MMOItemBuilder healthRegeneration(NumericStat healthRegeneration) {
        this.healthRegeneration = healthRegeneration;
        return this;
    }

    public MMOItemBuilder manaRegeneration(NumericStat manaRegeneration) {
        this.manaRegeneration = manaRegeneration;
        return this;
    }

    public MMOItemBuilder maxStamina(NumericStat maxStamina) {
        this.maxStamina = maxStamina;
        return this;
    }

    public MMOItemBuilder staminaRegeneration(NumericStat staminaRegeneration) {
        this.staminaRegeneration = staminaRegeneration;
        return this;
    }

    public MMOItemBuilder additionalExperience(NumericStat additionalExperience) {
        this.additionalExperience = additionalExperience;
        return this;
    }

    public MMOItemBuilder factionDamageEnemy(NumericStat factionDamageEnemy) {
        this.factionDamageEnemy = factionDamageEnemy;
        return this;
    }

    public MMOItemBuilder requiredLevel(NumericStat requiredLevel) {
        this.requiredLevel = requiredLevel;
        return this;
    }

    public MMOItemBuilder requiredDexterity(NumericStat requiredDexterity) {
        this.requiredDexterity = requiredDexterity;
        return this;
    }

    public MMOItemBuilder requiredStrength(NumericStat requiredStrength) {
        this.requiredStrength = requiredStrength;
        return this;
    }

    public MMOItemBuilder professionEnchanting(NumericStat professionEnchanting) {
        this.professionEnchanting = professionEnchanting;
        return this;
    }

    public MMOItemBuilder professionSmithing(NumericStat professionSmithing) {
        this.professionSmithing = professionSmithing;
        return this;
    }

    public MMOItemBuilder professionMining(NumericStat professionMining) {
        this.professionMining = professionMining;
        return this;
    }

    public MMOItemBuilder disableRightClickConsume(Boolean disableRightClickConsume) {
        this.disableRightClickConsume = disableRightClickConsume;
        return this;
    }

    public MMOItemBuilder restoreHealth(NumericStat restoreHealth) {
        this.restoreHealth = restoreHealth;
        return this;
    }

    public MMOItemBuilder restoreFood(NumericStat restoreFood) {
        this.restoreFood = restoreFood;
        return this;
    }

    public MMOItemBuilder restoreSaturation(NumericStat restoreSaturation) {
        this.restoreSaturation = restoreSaturation;
        return this;
    }

    public MMOItemBuilder restoreMana(NumericStat restoreMana) {
        this.restoreMana = restoreMana;
        return this;
    }

    public MMOItemBuilder restoreStamina(NumericStat restoreStamina) {
        this.restoreStamina = restoreStamina;
        return this;
    }

    public MMOItemBuilder canIdentify(Boolean canIdentify) {
        this.canIdentify = canIdentify;
        return this;
    }

    public MMOItemBuilder canDeconstruct(Boolean canDeconstruct) {
        this.canDeconstruct = canDeconstruct;
        return this;
    }

    public MMOItemBuilder canDeskin(Boolean canDeskin) {
        this.canDeskin = canDeskin;
        return this;
    }

    public MMOItemBuilder effects(HashMap<String, PotionEffect> effects) {
        this.effects = effects;
        return this;
    }

    public MMOItemBuilder soulbindingChance(NumericStat soulbindingChance) {
        this.soulbindingChance = soulbindingChance;
        return this;
    }

    public MMOItemBuilder souldboundBreakChance(NumericStat souldboundBreakChance) {
        this.souldboundBreakChance = souldboundBreakChance;
        return this;
    }

    public MMOItemBuilder soulboundLevel(NumericStat soulboundLevel) {
        this.soulboundLevel = soulboundLevel;
        return this;
    }

    public MMOItemBuilder vanillaEating(Boolean vanillaEating) {
        this.vanillaEating = vanillaEating;
        return this;
    }

    public MMOItemBuilder inedible(Boolean inedible) {
        this.inedible = inedible;
        return this;
    }

    public MMOItemBuilder maxConsume(Boolean maxConsume) {
        this.maxConsume = maxConsume;
        return this;
    }

    public MMOItemBuilder repair(Double repair) {
        this.repair = repair;
        return this;
    }

    public MMOItemBuilder arrowParticles(ItemParticle arrowParticles) {
        this.arrowParticles = arrowParticles;
        return this;
    }

    public MMOItemBuilder arrowVelocity(Double arrowVelocity) {
        this.arrowVelocity = arrowVelocity;
        return this;
    }

    public MMOItemBuilder arrowPotionEffects(PotionEffect arrowPotionEffects) {
        this.arrowPotionEffects = arrowPotionEffects;
        return this;
    }

    public MMOItem build() {
        MMOItem mMOItem = new MMOItem();
        mMOItem.setId(id);
        mMOItem.setMaterial(material);
        mMOItem.setDurability(durability);
        mMOItem.setCustomModelData(customModelData);
        mMOItem.setMaxDurability(maxDurability);
        mMOItem.setWillBreak(willBreak);
        mMOItem.setName(name);
        mMOItem.setLore(lore);
        mMOItem.setLoreFormat(loreFormat);
        mMOItem.setDisplayedType(displayedType);
        mMOItem.setEnchants(enchants);
        mMOItem.setHideEnchants(hideEnchants);
        mMOItem.setPermission(permission);
        mMOItem.setItemParticle(itemParticle);
        mMOItem.setDisableInteraction(disableInteraction);
        mMOItem.setDisableCrafting(disableCrafting);
        mMOItem.setDisableSmelting(disableSmelting);
        mMOItem.setDisableSmithing(disableSmithing);
        mMOItem.setDisableEnchanting(disableEnchanting);
        mMOItem.setDisableRepairing(disableRepairing);
        mMOItem.setDisableAttackPassive(disableAttackPassive);
        mMOItem.setRequiredClass(requiredClass);
        mMOItem.setSuccessRate(successRate);
        mMOItem.setAttackDamage(attackDamage);
        mMOItem.setAttackSpeed(attackSpeed);
        mMOItem.setCriticalStrikeChance(criticalStrikeChance);
        mMOItem.setCriticalStrikePower(criticalStrikePower);
        mMOItem.setBlockPower(blockPower);
        mMOItem.setBlockRating(blockRating);
        mMOItem.setBlockCooldownReduction(blockCooldownReduction);
        mMOItem.setDodgeRating(dodgeRating);
        mMOItem.setDodgeCooldownReduction(dodgeCooldownReduction);
        mMOItem.setParryRating(parryRating);
        mMOItem.setParryCooldownReduction(parryCooldownReduction);
        mMOItem.setCooldownReduction(cooldownReduction);
        mMOItem.setManaCost(manaCost);
        mMOItem.setStaminaCost(staminaCost);
        mMOItem.setPveDamage(pveDamage);
        mMOItem.setPvpDamage(pvpDamage);
        mMOItem.setWeaponDamage(weaponDamage);
        mMOItem.setSkillDamage(skillDamage);
        mMOItem.setProjectileDamage(projectileDamage);
        mMOItem.setMagicDamage(magicDamage);
        mMOItem.setPhysicalDamage(physicalDamage);
        mMOItem.setDefense(defense);
        mMOItem.setDamageReduction(damageReduction);
        mMOItem.setFallDamageReduction(fallDamageReduction);
        mMOItem.setProjectileDamageReduction(projectileDamageReduction);
        mMOItem.setPhysicalDamageReduction(physicalDamageReduction);
        mMOItem.setFireDamageReduction(fireDamageReduction);
        mMOItem.setMagicDamageReduction(magicDamageReduction);
        mMOItem.setPveDamageReduction(pveDamageReduction);
        mMOItem.setPvpDamageReduction(pvpDamageReduction);
        mMOItem.setUndeadDamage(undeadDamage);
        mMOItem.setUnbreakable(unbreakable);
        mMOItem.setTier(tier);
        mMOItem.setSet(set);
        mMOItem.setArmor(armor);
        mMOItem.setArmorToughness(armorToughness);
        mMOItem.setMaxHealth(maxHealth);
        mMOItem.setUnstackable(unstackable);
        mMOItem.setMaxMana(maxMana);
        mMOItem.setKnockbackResistance(knockbackResistance);
        mMOItem.setMovementSpeed(movementSpeed);
        mMOItem.setTwoHanded(twoHanded);
        mMOItem.setEquipPriority(equipPriority);
        mMOItem.setPermEffects(permEffects);
        mMOItem.setGrantedPermissions(grantedPermissions);
        mMOItem.setItemCooldown(itemCooldown);
        mMOItem.setCrafting(crafting);
        mMOItem.setCraftPermission(craftPermission);
        mMOItem.setCraftedAmount(craftedAmount);
        mMOItem.setSounds(sounds);
        mMOItem.setElement(element);
        mMOItem.setCommands(commands);
        mMOItem.setGemSockets(gemSockets);
        mMOItem.setRepairType(repairType);
        mMOItem.setAbility(ability);
        mMOItem.setUpgrade(upgrade);
        mMOItem.setHealthRegeneration(healthRegeneration);
        mMOItem.setManaRegeneration(manaRegeneration);
        mMOItem.setMaxStamina(maxStamina);
        mMOItem.setStaminaRegeneration(staminaRegeneration);
        mMOItem.setAdditionalExperience(additionalExperience);
        mMOItem.setFactionDamageEnemy(factionDamageEnemy);
        mMOItem.setRequiredLevel(requiredLevel);
        mMOItem.setRequiredDexterity(requiredDexterity);
        mMOItem.setRequiredStrength(requiredStrength);
        mMOItem.setProfessionEnchanting(professionEnchanting);
        mMOItem.setProfessionSmithing(professionSmithing);
        mMOItem.setProfessionMining(professionMining);
        mMOItem.setDisableRightClickConsume(disableRightClickConsume);
        mMOItem.setRestoreHealth(restoreHealth);
        mMOItem.setRestoreFood(restoreFood);
        mMOItem.setRestoreSaturation(restoreSaturation);
        mMOItem.setRestoreMana(restoreMana);
        mMOItem.setRestoreStamina(restoreStamina);
        mMOItem.setCanIdentify(canIdentify);
        mMOItem.setCanDeconstruct(canDeconstruct);
        mMOItem.setCanDeskin(canDeskin);
        mMOItem.setEffects(effects);
        mMOItem.setSoulbindingChance(soulbindingChance);
        mMOItem.setSouldboundBreakChance(souldboundBreakChance);
        mMOItem.setSoulboundLevel(soulboundLevel);
        mMOItem.setVanillaEating(vanillaEating);
        mMOItem.setInedible(inedible);
        mMOItem.setMaxConsume(maxConsume);
        mMOItem.setRepair(repair);
        mMOItem.setArrowParticles(arrowParticles);
        mMOItem.setArrowVelocity(arrowVelocity);
        mMOItem.setArrowPotionEffects(arrowPotionEffects);
        return mMOItem;
    }
}
