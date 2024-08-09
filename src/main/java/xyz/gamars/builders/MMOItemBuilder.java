package xyz.gamars.builders;

import xyz.gamars.crafting.CraftingRecipe;
import xyz.gamars.objects.base.*;

import java.util.ArrayList;
import java.util.Map;

public final class MMOItemBuilder {


    private String id;
    private String material;
    private Integer durability;
    private Integer maxDurability;
    private Integer customModelData;
    private Boolean willBreak;
    private String name;
    private ArrayList<String> lore;
    private String loreFormat;
    private String displayedType;
    private ArrayList<Map<String, Integer>> enchants;
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
    private Double attackDamage;
    private Double attackSpeed;
    private Double criticalStrikeChance;
    private Double criticalStrikePower;
    private Double blockPower;
    private Double blockRating;
    private Double blockCooldownReduction;
    private Double dodgeRating;
    private Double dodgeCooldownReduction;
    private Double parryRating;
    private Double parryCooldownReduction;
    private Double cooldownReduction;
    private Double manaCost;
    private Double staminaCost;
    private Double pveDamage;
    private Double pvpDamage;
    private Double weaponDamage;
    private Double skillDamage;
    private Double projectileDamage;
    private Double magicDamage;
    private Double physicalDamage;
    private Double defense;
    private Double damageReduction;
    private Double fallDamageReduction;
    private Double projectileDamageReduction;
    private Double physicalDamageReduction;
    private Double fireDamageReduction;
    private Double magicDamageReduction;
    private Double pveDamageReduction;
    private Double pvpDamageReduction;
    private Double undeadDamage;
    private Boolean unbreakable;
    private String tier;
    private String set;
    private Double armor;
    private Double armorToughness;
    private Double maxHealth;
    private Boolean unstackable;
    private Double maxMana;
    private Double knockbackResistance;
    private Double movementSpeed;
    private Boolean twoHanded;
    private Double equipPriority;
    private ArrayList<Map<String, Integer>> permEffects;
    private ArrayList<String> grantedPermissions;
    private Double itemCooldown;
    private CraftingRecipe crafting;
    private String craftPermission;
    private Double craftedAmount;
    private ArrayList<SoundEffect> sounds;
    private ArrayList<Map<String, Map<String, Double>>> elements;
    private ArrayList<Command> commands;
    private ArrayList<String> gemSockets;
    private String repairType;
    private ArrayList<Ability> ability;
    private ArrayList<String> upgrade;
    private Double healthRegeneration;
    private Double manaRegeneration;
    private Double maxStamina;
    private Double staminaRegeneration;
    private Double additionalExperience;
    private Double factionDamageEnemy;
    private Double requiredDexterity;
    private Double requiredStrength;
    private Double professionEnchanting;
    private Double professionSmithing;
    private Double professionMining;

    private MMOItemBuilder() {
    }

    public static MMOItemBuilder MMOItem() {
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

    public MMOItemBuilder durability(Integer durability) {
        this.durability = durability;
        return this;
    }

    public MMOItemBuilder maxDurability(Integer maxDurability) {
        this.maxDurability = maxDurability;
        return this;
    }

    public MMOItemBuilder customModelData(Integer customModelData) {
        this.customModelData = customModelData;
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

    public MMOItemBuilder enchants(ArrayList<Map<String, Integer>> enchants) {
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

    public MMOItemBuilder attackDamage(Double attackDamage) {
        this.attackDamage = attackDamage;
        return this;
    }

    public MMOItemBuilder attackSpeed(Double attackSpeed) {
        this.attackSpeed = attackSpeed;
        return this;
    }

    public MMOItemBuilder criticalStrikeChance(Double criticalStrikeChance) {
        this.criticalStrikeChance = criticalStrikeChance;
        return this;
    }

    public MMOItemBuilder criticalStrikePower(Double criticalStrikePower) {
        this.criticalStrikePower = criticalStrikePower;
        return this;
    }

    public MMOItemBuilder blockPower(Double blockPower) {
        this.blockPower = blockPower;
        return this;
    }

    public MMOItemBuilder blockRating(Double blockRating) {
        this.blockRating = blockRating;
        return this;
    }

    public MMOItemBuilder blockCooldownReduction(Double blockCooldownReduction) {
        this.blockCooldownReduction = blockCooldownReduction;
        return this;
    }

    public MMOItemBuilder dodgeRating(Double dodgeRating) {
        this.dodgeRating = dodgeRating;
        return this;
    }

    public MMOItemBuilder dodgeCooldownReduction(Double dodgeCooldownReduction) {
        this.dodgeCooldownReduction = dodgeCooldownReduction;
        return this;
    }

    public MMOItemBuilder parryRating(Double parryRating) {
        this.parryRating = parryRating;
        return this;
    }

    public MMOItemBuilder parryCooldownReduction(Double parryCooldownReduction) {
        this.parryCooldownReduction = parryCooldownReduction;
        return this;
    }

    public MMOItemBuilder cooldownReduction(Double cooldownReduction) {
        this.cooldownReduction = cooldownReduction;
        return this;
    }

    public MMOItemBuilder manaCost(Double manaCost) {
        this.manaCost = manaCost;
        return this;
    }

    public MMOItemBuilder staminaCost(Double staminaCost) {
        this.staminaCost = staminaCost;
        return this;
    }

    public MMOItemBuilder pveDamage(Double pveDamage) {
        this.pveDamage = pveDamage;
        return this;
    }

    public MMOItemBuilder pvpDamage(Double pvpDamage) {
        this.pvpDamage = pvpDamage;
        return this;
    }

    public MMOItemBuilder weaponDamage(Double weaponDamage) {
        this.weaponDamage = weaponDamage;
        return this;
    }

    public MMOItemBuilder skillDamage(Double skillDamage) {
        this.skillDamage = skillDamage;
        return this;
    }

    public MMOItemBuilder projectileDamage(Double projectileDamage) {
        this.projectileDamage = projectileDamage;
        return this;
    }

    public MMOItemBuilder magicDamage(Double magicDamage) {
        this.magicDamage = magicDamage;
        return this;
    }

    public MMOItemBuilder physicalDamage(Double physicalDamage) {
        this.physicalDamage = physicalDamage;
        return this;
    }

    public MMOItemBuilder defense(Double defense) {
        this.defense = defense;
        return this;
    }

    public MMOItemBuilder damageReduction(Double damageReduction) {
        this.damageReduction = damageReduction;
        return this;
    }

    public MMOItemBuilder fallDamageReduction(Double fallDamageReduction) {
        this.fallDamageReduction = fallDamageReduction;
        return this;
    }

    public MMOItemBuilder projectileDamageReduction(Double projectileDamageReduction) {
        this.projectileDamageReduction = projectileDamageReduction;
        return this;
    }

    public MMOItemBuilder physicalDamageReduction(Double physicalDamageReduction) {
        this.physicalDamageReduction = physicalDamageReduction;
        return this;
    }

    public MMOItemBuilder fireDamageReduction(Double fireDamageReduction) {
        this.fireDamageReduction = fireDamageReduction;
        return this;
    }

    public MMOItemBuilder magicDamageReduction(Double magicDamageReduction) {
        this.magicDamageReduction = magicDamageReduction;
        return this;
    }

    public MMOItemBuilder pveDamageReduction(Double pveDamageReduction) {
        this.pveDamageReduction = pveDamageReduction;
        return this;
    }

    public MMOItemBuilder pvpDamageReduction(Double pvpDamageReduction) {
        this.pvpDamageReduction = pvpDamageReduction;
        return this;
    }

    public MMOItemBuilder undeadDamage(Double undeadDamage) {
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

    public MMOItemBuilder armor(Double armor) {
        this.armor = armor;
        return this;
    }

    public MMOItemBuilder armorToughness(Double armorToughness) {
        this.armorToughness = armorToughness;
        return this;
    }

    public MMOItemBuilder maxHealth(Double maxHealth) {
        this.maxHealth = maxHealth;
        return this;
    }

    public MMOItemBuilder unstackable(Boolean unstackable) {
        this.unstackable = unstackable;
        return this;
    }

    public MMOItemBuilder maxMana(Double maxMana) {
        this.maxMana = maxMana;
        return this;
    }

    public MMOItemBuilder knockbackResistance(Double knockbackResistance) {
        this.knockbackResistance = knockbackResistance;
        return this;
    }

    public MMOItemBuilder movementSpeed(Double movementSpeed) {
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

    public MMOItemBuilder permEffects(ArrayList<Map<String, Integer>> permEffects) {
        this.permEffects = permEffects;
        return this;
    }

    public MMOItemBuilder grantedPermissions(ArrayList<String> grantedPermissions) {
        this.grantedPermissions = grantedPermissions;
        return this;
    }

    public MMOItemBuilder itemCooldown(Double itemCooldown) {
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

    public MMOItemBuilder sounds(ArrayList<SoundEffect> sounds) {
        this.sounds = sounds;
        return this;
    }

    public MMOItemBuilder elements(ArrayList<Map<String, Map<String, Double>>> elements) {
        this.elements = elements;
        return this;
    }

    public MMOItemBuilder commands(ArrayList<Command> commands) {
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

    public MMOItemBuilder ability(ArrayList<Ability> ability) {
        this.ability = ability;
        return this;
    }

    public MMOItemBuilder upgrade(ArrayList<String> upgrade) {
        this.upgrade = upgrade;
        return this;
    }

    public MMOItemBuilder healthRegeneration(Double healthRegeneration) {
        this.healthRegeneration = healthRegeneration;
        return this;
    }

    public MMOItemBuilder manaRegeneration(Double manaRegeneration) {
        this.manaRegeneration = manaRegeneration;
        return this;
    }

    public MMOItemBuilder maxStamina(Double maxStamina) {
        this.maxStamina = maxStamina;
        return this;
    }

    public MMOItemBuilder staminaRegeneration(Double staminaRegeneration) {
        this.staminaRegeneration = staminaRegeneration;
        return this;
    }

    public MMOItemBuilder additionalExperience(Double additionalExperience) {
        this.additionalExperience = additionalExperience;
        return this;
    }

    public MMOItemBuilder factionDamageEnemy(Double factionDamageEnemy) {
        this.factionDamageEnemy = factionDamageEnemy;
        return this;
    }

    public MMOItemBuilder requiredDexterity(Double requiredDexterity) {
        this.requiredDexterity = requiredDexterity;
        return this;
    }

    public MMOItemBuilder requiredStrength(Double requiredStrength) {
        this.requiredStrength = requiredStrength;
        return this;
    }

    public MMOItemBuilder professionEnchanting(Double professionEnchanting) {
        this.professionEnchanting = professionEnchanting;
        return this;
    }

    public MMOItemBuilder professionSmithing(Double professionSmithing) {
        this.professionSmithing = professionSmithing;
        return this;
    }

    public MMOItemBuilder professionMining(Double professionMining) {
        this.professionMining = professionMining;
        return this;
    }

    public MMOItem build() {
        MMOItem mMOItem = new MMOItem();
        mMOItem.setId(id);
        mMOItem.setMaterial(material);
        mMOItem.setDurability(durability);
        mMOItem.setMaxDurability(maxDurability);
        mMOItem.setCustomModelData(customModelData);
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
        mMOItem.setElements(elements);
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
        mMOItem.setRequiredDexterity(requiredDexterity);
        mMOItem.setRequiredStrength(requiredStrength);
        mMOItem.setProfessionEnchanting(professionEnchanting);
        mMOItem.setProfessionSmithing(professionSmithing);
        mMOItem.setProfessionMining(professionMining);
        return mMOItem;
    }
}
