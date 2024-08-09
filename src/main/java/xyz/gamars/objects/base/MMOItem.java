package xyz.gamars.objects.base;

import xyz.gamars.crafting.CraftingRecipe;
import xyz.gamars.crafting.OldCraftingRecipe;

import java.util.ArrayList;
import java.util.Map;

public class MMOItem {

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

    public Integer getDurability() {
        return durability;
    }

    public void setDurability(Integer durability) {
        this.durability = durability;
    }

    public Integer getMaxDurability() {
        return maxDurability;
    }

    public void setMaxDurability(Integer maxDurability) {
        this.maxDurability = maxDurability;
    }

    public Integer getCustomModelData() {
        return customModelData;
    }

    public void setCustomModelData(Integer customModelData) {
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

    public ArrayList<Map<String, Integer>> getEnchants() {
        return enchants;
    }

    public void setEnchants(ArrayList<Map<String, Integer>> enchants) {
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

    public ItemParticle getItemParticle() {
        return itemParticle;
    }

    public void setItemParticle(ItemParticle itemParticle) {
        this.itemParticle = itemParticle;
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

    public Double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(Double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public Double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(Double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public Double getCriticalStrikeChance() {
        return criticalStrikeChance;
    }

    public void setCriticalStrikeChance(Double criticalStrikeChance) {
        this.criticalStrikeChance = criticalStrikeChance;
    }

    public Double getCriticalStrikePower() {
        return criticalStrikePower;
    }

    public void setCriticalStrikePower(Double criticalStrikePower) {
        this.criticalStrikePower = criticalStrikePower;
    }

    public Double getBlockPower() {
        return blockPower;
    }

    public void setBlockPower(Double blockPower) {
        this.blockPower = blockPower;
    }

    public Double getBlockRating() {
        return blockRating;
    }

    public void setBlockRating(Double blockRating) {
        this.blockRating = blockRating;
    }

    public Double getBlockCooldownReduction() {
        return blockCooldownReduction;
    }

    public void setBlockCooldownReduction(Double blockCooldownReduction) {
        this.blockCooldownReduction = blockCooldownReduction;
    }

    public Double getDodgeRating() {
        return dodgeRating;
    }

    public void setDodgeRating(Double dodgeRating) {
        this.dodgeRating = dodgeRating;
    }

    public Double getDodgeCooldownReduction() {
        return dodgeCooldownReduction;
    }

    public void setDodgeCooldownReduction(Double dodgeCooldownReduction) {
        this.dodgeCooldownReduction = dodgeCooldownReduction;
    }

    public Double getParryRating() {
        return parryRating;
    }

    public void setParryRating(Double parryRating) {
        this.parryRating = parryRating;
    }

    public Double getParryCooldownReduction() {
        return parryCooldownReduction;
    }

    public void setParryCooldownReduction(Double parryCooldownReduction) {
        this.parryCooldownReduction = parryCooldownReduction;
    }

    public Double getCooldownReduction() {
        return cooldownReduction;
    }

    public void setCooldownReduction(Double cooldownReduction) {
        this.cooldownReduction = cooldownReduction;
    }

    public Double getManaCost() {
        return manaCost;
    }

    public void setManaCost(Double manaCost) {
        this.manaCost = manaCost;
    }

    public Double getStaminaCost() {
        return staminaCost;
    }

    public void setStaminaCost(Double staminaCost) {
        this.staminaCost = staminaCost;
    }

    public Double getPveDamage() {
        return pveDamage;
    }

    public void setPveDamage(Double pveDamage) {
        this.pveDamage = pveDamage;
    }

    public Double getPvpDamage() {
        return pvpDamage;
    }

    public void setPvpDamage(Double pvpDamage) {
        this.pvpDamage = pvpDamage;
    }

    public Double getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(Double weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public Double getSkillDamage() {
        return skillDamage;
    }

    public void setSkillDamage(Double skillDamage) {
        this.skillDamage = skillDamage;
    }

    public Double getProjectileDamage() {
        return projectileDamage;
    }

    public void setProjectileDamage(Double projectileDamage) {
        this.projectileDamage = projectileDamage;
    }

    public Double getMagicDamage() {
        return magicDamage;
    }

    public void setMagicDamage(Double magicDamage) {
        this.magicDamage = magicDamage;
    }

    public Double getPhysicalDamage() {
        return physicalDamage;
    }

    public void setPhysicalDamage(Double physicalDamage) {
        this.physicalDamage = physicalDamage;
    }

    public Double getDefense() {
        return defense;
    }

    public void setDefense(Double defense) {
        this.defense = defense;
    }

    public Double getDamageReduction() {
        return damageReduction;
    }

    public void setDamageReduction(Double damageReduction) {
        this.damageReduction = damageReduction;
    }

    public Double getFallDamageReduction() {
        return fallDamageReduction;
    }

    public void setFallDamageReduction(Double fallDamageReduction) {
        this.fallDamageReduction = fallDamageReduction;
    }

    public Double getProjectileDamageReduction() {
        return projectileDamageReduction;
    }

    public void setProjectileDamageReduction(Double projectileDamageReduction) {
        this.projectileDamageReduction = projectileDamageReduction;
    }

    public Double getPhysicalDamageReduction() {
        return physicalDamageReduction;
    }

    public void setPhysicalDamageReduction(Double physicalDamageReduction) {
        this.physicalDamageReduction = physicalDamageReduction;
    }

    public Double getFireDamageReduction() {
        return fireDamageReduction;
    }

    public void setFireDamageReduction(Double fireDamageReduction) {
        this.fireDamageReduction = fireDamageReduction;
    }

    public Double getMagicDamageReduction() {
        return magicDamageReduction;
    }

    public void setMagicDamageReduction(Double magicDamageReduction) {
        this.magicDamageReduction = magicDamageReduction;
    }

    public Double getPveDamageReduction() {
        return pveDamageReduction;
    }

    public void setPveDamageReduction(Double pveDamageReduction) {
        this.pveDamageReduction = pveDamageReduction;
    }

    public Double getPvpDamageReduction() {
        return pvpDamageReduction;
    }

    public void setPvpDamageReduction(Double pvpDamageReduction) {
        this.pvpDamageReduction = pvpDamageReduction;
    }

    public Double getUndeadDamage() {
        return undeadDamage;
    }

    public void setUndeadDamage(Double undeadDamage) {
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

    public Double getArmor() {
        return armor;
    }

    public void setArmor(Double armor) {
        this.armor = armor;
    }

    public Double getArmorToughness() {
        return armorToughness;
    }

    public void setArmorToughness(Double armorToughness) {
        this.armorToughness = armorToughness;
    }

    public Double getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(Double maxHealth) {
        this.maxHealth = maxHealth;
    }

    public Boolean getUnstackable() {
        return unstackable;
    }

    public void setUnstackable(Boolean unstackable) {
        this.unstackable = unstackable;
    }

    public Double getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(Double maxMana) {
        this.maxMana = maxMana;
    }

    public Double getKnockbackResistance() {
        return knockbackResistance;
    }

    public void setKnockbackResistance(Double knockbackResistance) {
        this.knockbackResistance = knockbackResistance;
    }

    public Double getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(Double movementSpeed) {
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

    public ArrayList<Map<String, Integer>> getPermEffects() {
        return permEffects;
    }

    public void setPermEffects(ArrayList<Map<String, Integer>> permEffects) {
        this.permEffects = permEffects;
    }

    public ArrayList<String> getGrantedPermissions() {
        return grantedPermissions;
    }

    public void setGrantedPermissions(ArrayList<String> grantedPermissions) {
        this.grantedPermissions = grantedPermissions;
    }

    public Double getItemCooldown() {
        return itemCooldown;
    }

    public void setItemCooldown(Double itemCooldown) {
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

    public ArrayList<SoundEffect> getSounds() {
        return sounds;
    }

    public void setSounds(ArrayList<SoundEffect> sounds) {
        this.sounds = sounds;
    }

    public ArrayList<Map<String, Map<String, Double>>> getElements() {
        return elements;
    }

    public void setElements(ArrayList<Map<String, Map<String, Double>>> elements) {
        this.elements = elements;
    }

    public ArrayList<Command> getCommands() {
        return commands;
    }

    public void setCommands(ArrayList<Command> commands) {
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

    public ArrayList<Ability> getAbility() {
        return ability;
    }

    public void setAbility(ArrayList<Ability> ability) {
        this.ability = ability;
    }

    public ArrayList<String> getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(ArrayList<String> upgrade) {
        this.upgrade = upgrade;
    }

    public Double getHealthRegeneration() {
        return healthRegeneration;
    }

    public void setHealthRegeneration(Double healthRegeneration) {
        this.healthRegeneration = healthRegeneration;
    }

    public Double getManaRegeneration() {
        return manaRegeneration;
    }

    public void setManaRegeneration(Double manaRegeneration) {
        this.manaRegeneration = manaRegeneration;
    }

    public Double getMaxStamina() {
        return maxStamina;
    }

    public void setMaxStamina(Double maxStamina) {
        this.maxStamina = maxStamina;
    }

    public Double getStaminaRegeneration() {
        return staminaRegeneration;
    }

    public void setStaminaRegeneration(Double staminaRegeneration) {
        this.staminaRegeneration = staminaRegeneration;
    }

    public Double getAdditionalExperience() {
        return additionalExperience;
    }

    public void setAdditionalExperience(Double additionalExperience) {
        this.additionalExperience = additionalExperience;
    }

    public Double getFactionDamageEnemy() {
        return factionDamageEnemy;
    }

    public void setFactionDamageEnemy(Double factionDamageEnemy) {
        this.factionDamageEnemy = factionDamageEnemy;
    }

    public Double getRequiredDexterity() {
        return requiredDexterity;
    }

    public void setRequiredDexterity(Double requiredDexterity) {
        this.requiredDexterity = requiredDexterity;
    }

    public Double getRequiredStrength() {
        return requiredStrength;
    }

    public void setRequiredStrength(Double requiredStrength) {
        this.requiredStrength = requiredStrength;
    }

    public Double getProfessionEnchanting() {
        return professionEnchanting;
    }

    public void setProfessionEnchanting(Double professionEnchanting) {
        this.professionEnchanting = professionEnchanting;
    }

    public Double getProfessionSmithing() {
        return professionSmithing;
    }

    public void setProfessionSmithing(Double professionSmithing) {
        this.professionSmithing = professionSmithing;
    }

    public Double getProfessionMining() {
        return professionMining;
    }

    public void setProfessionMining(Double professionMining) {
        this.professionMining = professionMining;
    }

    @Override
    public String toString() {
        return "MMOItem{" +
                "id='" + id + '\'' +
                ", material='" + material + '\'' +
                ", durability=" + durability +
                ", customModelData=" + customModelData +
                ", willBreak=" + willBreak +
                ", name='" + name + '\'' +
                ", lore=" + lore +
                ", loreFormat='" + loreFormat + '\'' +
                ", displayedType='" + displayedType + '\'' +
                ", enchants=" + enchants +
                ", hideEnchants=" + hideEnchants +
                ", permission='" + permission + '\'' +
                ", itemParticle=" + itemParticle +
                ", disableInteraction=" + disableInteraction +
                ", disableCrafting=" + disableCrafting +
                ", disableSmelting=" + disableSmelting +
                ", disableSmithing=" + disableSmithing +
                ", disableEnchanting=" + disableEnchanting +
                ", disableRepairing=" + disableRepairing +
                ", disableAttackPassive=" + disableAttackPassive +
                ", requiredClass=" + requiredClass +
                ", attackDamage=" + attackDamage +
                ", attackSpeed=" + attackSpeed +
                ", criticalStrikeChance=" + criticalStrikeChance +
                ", criticalStrikePower=" + criticalStrikePower +
                ", blockPower=" + blockPower +
                ", blockRating=" + blockRating +
                ", blockCooldownReduction=" + blockCooldownReduction +
                ", dodgeRating=" + dodgeRating +
                ", dodgeCooldownReduction=" + dodgeCooldownReduction +
                ", parryRating=" + parryRating +
                ", parryCooldownReduction=" + parryCooldownReduction +
                ", cooldownReduction=" + cooldownReduction +
                ", manaCost=" + manaCost +
                ", staminaCost=" + staminaCost +
                ", pveDamage=" + pveDamage +
                ", pvpDamage=" + pvpDamage +
                ", weaponDamage=" + weaponDamage +
                ", skillDamage=" + skillDamage +
                ", projectileDamage=" + projectileDamage +
                ", magicDamage=" + magicDamage +
                ", physicalDamage=" + physicalDamage +
                ", defense=" + defense +
                ", damageReduction=" + damageReduction +
                ", fallDamageReduction=" + fallDamageReduction +
                ", projectileDamageReduction=" + projectileDamageReduction +
                ", physicalDamageReduction=" + physicalDamageReduction +
                ", fireDamageReduction=" + fireDamageReduction +
                ", magicDamageReduction=" + magicDamageReduction +
                ", pveDamageReduction=" + pveDamageReduction +
                ", pvpDamageReduction=" + pvpDamageReduction +
                ", undeadDamage=" + undeadDamage +
                ", unbreakable=" + unbreakable +
                ", tier='" + tier + '\'' +
                ", set='" + set + '\'' +
                ", armor=" + armor +
                ", armorToughness=" + armorToughness +
                ", maxHealth=" + maxHealth +
                ", unstackable=" + unstackable +
                ", maxMana=" + maxMana +
                ", knockbackResistance=" + knockbackResistance +
                ", movementSpeed=" + movementSpeed +
                ", twoHanded=" + twoHanded +
                ", equipPriority=" + equipPriority +
                ", permEffects=" + permEffects +
                ", grantedPermissions=" + grantedPermissions +
                ", itemCooldown=" + itemCooldown +
                ", crafting=" + crafting +
                ", craftPermission='" + craftPermission + '\'' +
                ", craftedAmount=" + craftedAmount +
                ", sounds=" + sounds +
                ", elements=" + elements +
                ", commands=" + commands +
                ", gemSockets=" + gemSockets +
                ", repairType='" + repairType + '\'' +
                ", ability=" + ability +
                ", upgrade=" + upgrade +
                ", healthRegeneration=" + healthRegeneration +
                ", manaRegeneration=" + manaRegeneration +
                ", maxStamina=" + maxStamina +
                ", staminaRegeneration=" + staminaRegeneration +
                ", additionalExperience=" + additionalExperience +
                ", factionDamageEnemy=" + factionDamageEnemy +
                ", requiredDexterity=" + requiredDexterity +
                ", requiredStrength=" + requiredStrength +
                ", professionEnchanting=" + professionEnchanting +
                ", professionSmithing=" + professionSmithing +
                ", professionMining=" + professionMining +
                '}';
    }
}
