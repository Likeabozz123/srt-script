package xyz.gamars.objects.base;

import xyz.gamars.crafting.CraftingRecipe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MMOItem {

    private String id;
    private String material;
    private Integer durability;
    private Integer customModelData;
    private Integer maxDurability;
    private Boolean willBreak;
    private String name;
    private ArrayList<String> lore;
    private String loreFormat;
    private String displayedType;
    private HashMap<String, Integer> enchants;
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
    private Double armor;
    private Double armorToughness;
    private Double maxHealth;
    private Boolean unstackable;
    private Double maxMana;
    private NumericStat knockbackResistance;
    private Double movementSpeed;
    private Boolean twoHanded;
    private Double equipPriority;
    private ArrayList<HashMap<String, Integer>> permEffects;
    private ArrayList<String> grantedPermissions;
    private Double itemCooldown;
    private CraftingRecipe crafting;
    private String craftPermission;
    private Double craftedAmount;
    private HashMap<String, SoundEffect> sounds;
    private HashMap<String, HashMap<String, HashMap<String, Double>>> element;
    private HashMap<String, HashMap<String, Command>> commands;
    private ArrayList<String> gemSockets;
    private String repairType;
    private HashMap<String, HashMap<String, Ability>> ability;
    private ArrayList<String> upgrade;
    private Double healthRegeneration;
    private Double manaRegeneration;
    private Double maxStamina;
    private Double staminaRegeneration;
    private Double additionalExperience;
    private NumericStat factionDamageEnemy;
    private Double requiredLevel;
    private Double requiredDexterity;
    private Double requiredStrength;
    private Double professionEnchanting;
    private Double professionSmithing;
    private Double professionMining;

    public MMOItem() {
    }

    @Override
    public String toString() {
        return "MMOItem{" +
                "id='" + id + '\'' +
                ", material='" + material + '\'' +
                ", durability=" + durability +
                ", customModelData=" + customModelData +
                ", maxDurability=" + maxDurability +
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
                ", successRate=" + successRate +
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
                ", element=" + element +
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
                ", requiredLevel=" + requiredLevel +
                ", requiredDexterity=" + requiredDexterity +
                ", requiredStrength=" + requiredStrength +
                ", professionEnchanting=" + professionEnchanting +
                ", professionSmithing=" + professionSmithing +
                ", professionMining=" + professionMining +
                '}';
    }

    public Double getRequiredLevel() {
        return requiredLevel;
    }

    public void setRequiredLevel(Double requiredLevel) {
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

    public HashMap<String, Integer>  getEnchants() {
        return enchants;
    }

    public void setEnchants(HashMap<String, Integer>  enchants) {
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

    public NumericStat getKnockbackResistance() {
        return knockbackResistance;
    }

    public void setKnockbackResistance(NumericStat knockbackResistance) {
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

    public ArrayList<HashMap<String, Integer>> getPermEffects() {
        return permEffects;
    }

    public void setPermEffects(ArrayList<HashMap<String, Integer>> permEffects) {
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

    public NumericStat getFactionDamageEnemy() {
        return factionDamageEnemy;
    }

    public void setFactionDamageEnemy(NumericStat factionDamageEnemy) {
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
}
