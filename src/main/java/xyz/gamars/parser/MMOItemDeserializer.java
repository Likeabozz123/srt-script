package xyz.gamars.parser;

import com.google.gson.*;
import xyz.gamars.crafting.*;
import xyz.gamars.enums.IDType;
import xyz.gamars.enums.SmeltingType;
import xyz.gamars.objects.base.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

public class MMOItemDeserializer implements JsonDeserializer<MMOItem> {

    @Override
    public MMOItem deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        JsonObject root = json.getAsJsonObject();

        String id = root.keySet().toArray()[0].toString();
        JsonObject base = root.getAsJsonObject(id).getAsJsonObject("base");
        // System.out.println(base);

        return MMOItemBuilder.MMOItem()
                .id(id)
                .material(getString(base, "material"))
                .durability(getInteger(base, "durability"))
                .customModelData(getInteger(base, "custom-model-data"))
                .maxDurability(getInteger(base, "max-durability"))
                .willBreak(getBoolean(base, "will-break"))
                .name(getString(base, "name"))
                .lore(getListString(base, "lore"))
                .loreFormat(getString(base, "lore-format"))
                .displayedType(getString(base, "displayed-type"))
                .enchants(getListMapStringDouble(base, "enchants"))
                .hideEnchants(getBoolean(base, "hide-enchants"))
                .permission(getString(base, "permission"))
                .itemParticle(getItemParticle(base))
                .disableInteraction(getBoolean(base, "disable-interaction"))
                .disableCrafting(getBoolean(base, "disable-crafting"))
                .disableSmelting(getBoolean(base, "disable-smelting"))
                .disableSmithing(getBoolean(base, "disable-smithing"))
                .disableEnchanting(getBoolean(base, "disable-enchanting"))
                .disableRepairing(getBoolean(base, "disable-repairing"))
                .disableAttackPassive(getBoolean(base, "disable-attack-passive"))
                .requiredClass(getListString(base, "required-class"))
                .attackDamage(getDouble(base, "attack-damage"))
                .criticalStrikeChance(getDouble(base, "critical-strike-chance"))
                .criticalStrikePower(getDouble(base, "critical-strike-power"))
                .blockPower(getDouble(base, "block-power"))
                .blockRating(getDouble(base, "block-power"))
                .blockCooldownReduction(getDouble(base, "block-cooldown-reduction"))
                .dodgeRating(getDouble(base, "dodge-rating"))
                .dodgeCooldownReduction(getDouble(base, "dodge-cooldown-reduction"))
                .parryRating(getDouble(base, "parry-rating"))
                .parryCooldownReduction(getDouble(base, "parry-cooldown-reduction"))
                .cooldownReduction(getDouble(base, "cooldown-reduction"))
                .manaCost(getDouble(base, "mana-cost"))
                .staminaCost(getDouble(base, "stamina-cost"))
                .pveDamage(getDouble(base, "pve-damage"))
                .pvpDamage(getDouble(base, "pvp-damage"))
                .weaponDamage(getDouble(base, "weapon-damage"))
                .skillDamage(getDouble(base, "skill-damage"))
                .projectileDamage(getDouble(base, "projectile-damage"))
                .magicDamage(getDouble(base, "magic-damage"))
                .physicalDamage(getDouble(base, "physical-damage"))
                .defense(getDouble(base, "defense"))
                .damageReduction(getDouble(base, "damage-reduction"))
                .fallDamageReduction(getDouble(base, "fall-damage-reduction"))
                .projectileDamageReduction(getDouble(base, "projectile-damage-reduction"))
                .physicalDamageReduction(getDouble(base, "physical-damage-reduction"))
                .fireDamageReduction(getDouble(base, "fire-damage-reduction"))
                .magicDamageReduction(getDouble(base, "magic-damage-reduction"))
                .pveDamageReduction(getDouble(base, "pve-damage-reduction"))
                .pvpDamageReduction(getDouble(base, "pvp-damage-reduction"))
                .undeadDamage(getDouble(base, "undead-damage"))
                .unbreakable(getBoolean(base, "unbreakable"))
                .tier(getString(base,"tier"))
                .set(getString(base, "set"))
                .armor(getDouble(base, "armor"))
                .armorToughness(getDouble(base, "armor-toughness"))
                .maxHealth(getDouble(base, "max-health"))
                .unstackable(getBoolean(base, "unstackable"))
                .maxMana(getDouble(base, "max-mana"))
                .knockbackResistance(getDouble(base, "knockback-resistance"))
                .movementSpeed(getDouble(base, "movement-speed"))
                .twoHanded(getBoolean(base, "two-handed"))
                .equipPriority(getDouble(base, "equip-priority"))
                .permEffects(getListMapStringDouble(base, "perm-effects"))
                .grantedPermissions(getListString(base, "granted-permissions"))
                .itemCooldown(getDouble(base, "item-cooldown"))
                .crafting(getCraftingRecipe(base))
                .craftPermission(getString(base, "crafting-permission"))
                .craftedAmount(getDouble(base, "crafted-amount"))
                .sounds(getSoundEffects(base))
                //.elements()
                .commands(getCommands(base))
                .gemSockets(getListString(base, "gem-sockets"))
                .repairType(getString(base, "repair-type"))
                //.upgrade() // should be ArrayList<Map<String, Boolean>
                .healthRegeneration(getDouble(base, "health-regeneration"))
                .manaRegeneration(getDouble(base, "mana-regeneration"))
                .maxStamina(getDouble(base, "max-stamina"))
                .staminaRegeneration(getDouble(base, "stamina-regeneration"))
                .additionalExperience(getDouble(base, "additional-experience"))
                .factionDamageEnemy(getDouble(base, "faction-damage-enemy"))
                .requiredDexterity(getDouble(base, "required-dexterity"))
                .requiredStrength(getDouble(base, "required-strength"))
                .professionEnchanting(getDouble(base, "profession-enchanting"))
                .professionSmithing(getDouble(base, "profession-smithing"))
                .professionMining(getDouble(base, "profession-mining"))
                .build();
    }

    private String getString(JsonObject jsonObject, String memberName) {
        return jsonObject.get(memberName) != null ? jsonObject.get(memberName).getAsString() : null;
    }

    private Double getDouble(JsonObject jsonObject, String memberName) {
        return jsonObject.get(memberName) != null ? jsonObject.get(memberName).getAsDouble() : null;
    }

    private Integer getInteger(JsonObject jsonObject, String memberName) {
        return jsonObject.get(memberName) != null ? jsonObject.get(memberName).getAsInt() : null;
    }

    private Boolean getBoolean(JsonObject jsonObject, String memberName) {
        return jsonObject.get(memberName) != null ? jsonObject.get(memberName).getAsBoolean() : null;
    }

    private Boolean getBoolean(Map<String, JsonElement> map, String memberName) {
        return map.get(memberName) != null ? map.get(memberName).getAsBoolean() : null;
    }

    private String getString(Map<String, JsonElement> map, String memberName) {
        return map.get(memberName) != null ? map.get(memberName).getAsString() : null;
    }

    private Double getDouble(Map<String, JsonElement> map, String memberName) {
        return map.get(memberName) != null ? map.get(memberName).getAsDouble() : null;
    }

    private Integer getInteger(Map<String, JsonElement> map, String memberName) {
        return map.get(memberName) != null ? map.get(memberName).getAsInt() : null;
    }

    private ArrayList<String> getListString(JsonObject jsonObject, String memberName) {
        JsonArray jsonArray = jsonObject.getAsJsonArray(memberName);
        if (jsonArray == null) return null;

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < jsonArray.size(); i++) {
            list.add(jsonArray.get(i).getAsString());
        }

        return list;
    }

    private ArrayList<Map<String, Integer>> getListMapStringDouble(JsonObject jsonObject, String memberName) {
        JsonObject memberObject = jsonObject.getAsJsonObject(memberName);
        if (memberObject == null) return null;

        ArrayList<Map<String, Integer>> list = new ArrayList<>();

        for (int i = 0; i < memberObject.asMap().size(); i++) {
            String key = memberObject.asMap().keySet().toArray()[i].toString();
            list.add(Map.of(key, memberObject.asMap().get(key).getAsInt()));
        }

        return list;
    }

    private ItemParticle getItemParticle(JsonObject base) {
        JsonObject itemParticleJSON = base.getAsJsonObject("item-particles");
        if (itemParticleJSON == null) return null;

        String type = getString(itemParticleJSON, "type");
        String particle = getString(itemParticleJSON, "particle");
        Double amount = getDouble(itemParticleJSON, "amount");
        Double radius = getDouble(itemParticleJSON, "radius");
        Double speed = getDouble(itemParticleJSON, "speed");
        Double rotationSpeed = getDouble(itemParticleJSON, "rotation-speed");
        Double height = getDouble(itemParticleJSON, "height");
        return new ItemParticle(type, particle, amount, radius, speed, rotationSpeed, height);
    }

    private CraftingRecipe getCraftingRecipe(JsonObject base) {
        JsonObject crafting = base.getAsJsonObject("crafting");
        if (crafting == null) return null;

        CraftingRecipeBuilder craftingRecipeBuilder = CraftingRecipeBuilder.craftingRecipe();

        craftingRecipeBuilder
                .shapelessRecipe(readShapelessRecipes(crafting))
                .shapedRecipe(readShapedRecipes(crafting))
                .furnaceRecipes(readSmeltingRecipe(crafting, SmeltingType.FURNACE))
                .blastRecipes(readSmeltingRecipe(crafting, SmeltingType.BLAST))
                .smokerRecipes(readSmeltingRecipe(crafting, SmeltingType.SMOKER))
                .campfireRecipes(readSmeltingRecipe(crafting, SmeltingType.CAMPFIRE))
        ;


        return craftingRecipeBuilder.build();
    }

    private ArrayList<SoundEffect> getSoundEffects(JsonObject base) {
        JsonObject sounds = base.getAsJsonObject("sounds");
        if (sounds == null) return null;

        ArrayList<SoundEffect> soundEffects = new ArrayList<>();
        sounds.asMap().forEach((key, jsonElement) -> {
            Map<String, JsonElement> soundDefinition = jsonElement.getAsJsonObject().asMap();
            String sound = getString(soundDefinition, "sound");
            Integer volume = getInteger(soundDefinition, "volume");
            Integer pitch = getInteger(soundDefinition, "pitch");

            soundEffects.add(new SoundEffect(key, sound, volume, pitch));
        });

        return soundEffects;
    }

    private ArrayList<Command> getCommands(JsonObject base) {
        JsonObject commands = base.getAsJsonObject("commands");
        if (commands == null) return null;

        ArrayList<Command> commandsList = new ArrayList<>();

        commands.asMap().forEach((name, jsonElement) -> {
            Map<String, JsonElement> commandDefinition = jsonElement.getAsJsonObject().asMap();
            String format = getString(commandDefinition, "format");
            Integer delay = getInteger(commandDefinition, "delay");
            Boolean op = getBoolean(commandDefinition, "op");
            Boolean console = getBoolean(commandDefinition, "console");

            commandsList.add(new Command(name, format, delay, op, console));

        });

        return commandsList;
    }

    private ArrayList<SmeltingRecipe> readSmeltingRecipe(JsonObject crafting, SmeltingType smeltingType) {
        JsonObject smelting = crafting.getAsJsonObject(smeltingType.toString().toLowerCase());
        if (smelting == null) return null;

        ArrayList<SmeltingRecipe> smeltingRecipes = new ArrayList<>();

        smelting.asMap().forEach((key, jsonElement) -> {
            Map<String, JsonElement> smeltingRecipe = jsonElement.getAsJsonObject().asMap();
            String itemString = getString(smelting, "item");
            Integer time = getInteger(smelting, "time");
            Double experience = getDouble(smelting, "experience");

            smeltingRecipes.add(new SmeltingRecipe(smeltingType, readItemString(itemString), time, experience));
        });

        return smeltingRecipes;
    }

    private ArrayList<ShapelessRecipe> readShapelessRecipes(JsonObject crafting) {
        JsonObject shapeless = crafting.getAsJsonObject("shapeless");
        if (shapeless == null) return null;

        ArrayList<ShapelessRecipe> shapelessRecipes = new ArrayList<>();

        shapeless.asMap().forEach((key, jsonElement) -> {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            JsonArray recipeStrings = jsonObject.getAsJsonArray("input");
            ArrayList<CraftingItem> craftingItems = new ArrayList<>();

            for (int i = 0; i < recipeStrings.size(); i++) {
                String itemString = recipeStrings.get(i).getAsString();
                craftingItems.add(readItemString(itemString));
            }

            shapelessRecipes.add(new ShapelessRecipe(craftingItems));
        });

        return shapelessRecipes;

    }

    private ArrayList<ShapedRecipe> readShapedRecipes(JsonObject crafting) {
        JsonObject shaped = crafting.getAsJsonObject("shaped");
        if (shaped == null) return null;

        ArrayList<ShapedRecipe> shapedRecipes = new ArrayList<>();

        shaped.asMap().forEach((key, jsonElement) -> {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            JsonArray recipeStrings = jsonObject.getAsJsonArray("input");
            ArrayList<CraftingItem> craftingItems = new ArrayList<>();

            for (int i = 0; i < recipeStrings.size(); i++) {
                String recipeString = recipeStrings.get(i).getAsString();
                String firstItemString = recipeString.substring(0, recipeString.indexOf('|'));
                recipeString = recipeString.substring(recipeString.indexOf('|') + 1);
                String secondItemString = recipeString.substring(0, recipeString.indexOf('|'));
                recipeString = recipeString.substring(recipeString.indexOf('|') + 1);
                String thirdItemString = recipeString;

                craftingItems.add(readItemString(firstItemString));
                craftingItems.add(readItemString(secondItemString));
                craftingItems.add(readItemString(thirdItemString));
            }

            shapedRecipes.add(new ShapedRecipe(craftingItems));

        });

        return shapedRecipes;
    }

    private CraftingItem readItemString(String itemString) {
        itemString = itemString.substring(0, itemString.indexOf('.'));

        if (itemString.charAt(0) == 'v') {
            IDType idType = IDType.VANILLA;
            itemString = itemString.substring(2);
            int dashIndex = itemString.indexOf(" - ");

            if (dashIndex == -1) {
                return new CraftingItem(IDType.VANILLA, "air", 0);
            }
            String id = itemString.substring(0, dashIndex);

            itemString = itemString.substring(itemString.indexOf(" - ") + 3);
            int amount = Integer.parseInt(itemString);

            return new CraftingItem(idType, id, amount);
        } else if (itemString.charAt(0) == 'm') {
            IDType idType = null;
            if (itemString.contains(IDType.MMO_MATERIAL.toString())) {
                idType = IDType.MMO_MATERIAL;
                itemString = itemString.substring(IDType.MMO_MATERIAL.toString().length() + 1);
            } else if (itemString.contains(IDType.MMO_CONSUMABLE.toString())) {
                idType = IDType.MMO_CONSUMABLE;
                itemString = itemString.substring(IDType.MMO_CONSUMABLE.toString().length() + 1);
            } else if (itemString.contains(IDType.MMO_GEM_STONE.toString())) {
                idType = IDType.MMO_GEM_STONE;
                itemString = itemString.substring(IDType.MMO_GEM_STONE.toString().length() + 1);
            }
            Integer amount = Integer.valueOf("" + itemString.charAt(itemString.length() - 1));
            String id = itemString.substring(0, itemString.length() - 2);
            return new CraftingItem(idType, id, amount);
        }
        return null;
    }




}
