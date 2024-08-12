package xyz.gamars.snakeyaml;

import com.sun.jdi.Field;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.introspector.BeanAccess;
import org.yaml.snakeyaml.introspector.FieldProperty;
import org.yaml.snakeyaml.introspector.Property;
import org.yaml.snakeyaml.introspector.PropertyUtils;
import org.yaml.snakeyaml.nodes.*;
import org.yaml.snakeyaml.representer.Represent;
import org.yaml.snakeyaml.representer.Representer;
import xyz.gamars.crafting.CraftingRecipe;
import xyz.gamars.objects.MMOItem;
import xyz.gamars.objects.base.ItemParticle;
import xyz.gamars.objects.base.NumericStat;
import xyz.gamars.objects.base.PotionEffect;
import xyz.gamars.parser.MMOItemDeserializer;

import java.util.*;
import java.util.stream.Collectors;

public class CleanRepresenter extends Representer {

    private MMOItemDeserializer mmoItemDeserializer;

    public static List<String> order = new ArrayList<>(Arrays.asList(
            "material",
            "durability",
            "customModelData",
            "maxDurability",
            "willBreak",
            "name",
            "skullTexture",
            "gemColor",
            "gemUpgradeScaling",
            "itemTypeRestriction",
            "lore",
            "loreFormat",
            "displayedType",
            "enchants",
            "hideEnchants",
            "permission",
            "itemParticles",
            "disableInteraction",
            "disableCrafting",
            "disableSmelting",
            "disableSmithing",
            "disableEnchanting",
            "disableAdvancedEnchants",
            "disableRepairing",
            "disableAttackPassive",
            "disableDeathDrop",
            "disableDropping",
            "durabilityBar",
            "customScrap",
            "dyeColor",
            "hideDye",
            "hideArmorTrim",
            "trimMaterial",
            "trimPattern",
            "requiredClass",
            "successRate",
            "attackDamage",
            "attackSpeed",
            "criticalStrikeChance",
            "criticalStrikePower",
            "blockPower",
            "blockRating",
            "breakDowngrade",
            "deathDowngrade",
            "deathDowngradeChance",
            "blockCooldownReduction",
            "dodgeRating",
            "dodgeCooldownReduction",
            "parryRating",
            "parryCooldownReduction",
            "cooldownReduction",
            "manaCost",
            "staminaCost",
            "pveDamage",
            "pvpDamage",
            "weaponDamage",
            "skillDamage",
            "projectileDamage",
            "magicDamage",
            "physicalDamage",
            "defense",
            "lifesteal",
            "damageReduction",
            "fallDamageReduction",
            "projectileDamageReduction",
            "physicalDamageReduction",
            "fireDamageReduction",
            "magicDamageReduction",
            "pveDamageReduction",
            "pvpDamageReduction",
            "undeadDamage",
            "unbreakable",
            "tier",
            "set",
            "armor",
            "armorToughness",
            "maxHealth",
            "unstackable",
            "maxMana",
            "knockbackResistance",
            "movementSpeed",
            "twoHanded",
            "equipPriority",
            "permEffects",
            "grantedPermissions",
            "itemCooldown",
            "crafting",
            "craftPermission",
            "craftedAmount",
            "sounds",
            "element",
            "commands",
            "gemSockets",
            "repairType",
            "ability",
            "upgrade",
            "healthRegeneration",
            "manaRegeneration",
            "maxStamina",
            "staminaRegeneration",
            "additionalExperience",
            "factionDamageEnemy",
            "requiredLevel",
            "requiredDexterity",
            "requiredStrength",
            "professionEnchanting",
            "professionSmithing",
            "professionMining",
            // consumables
            "disableRightClickConsume",
            "restoreHealth",
            "restoreFood",
            "restoreSaturation",
            "restoreMana",
            "restoreStamina",
            "canIdentify",
            "canDeconstruct",
            "canDeskin",
            "effects",
            "soulbindingChance",
            "souldboundBreakChance",
            "soulboundLevel",
            "vanillaEating",
            "inedible",
            "maxConsume",
            "repair",
            // bows
            "arrowParticles",
            "arrowVelocity",
            "arrowPotionEffects",
            // numeric stat
            "base",
            "scale",
            "spread",
            "maxSpread",
            // item particles
            "type",
            "particle",
            "amount",
            "radius",
            "offset",
            "speed",
            "rotationSpeed",
            "height",

            "additionalInfo"
    ));

    public CleanRepresenter(DumperOptions options, MMOItemDeserializer mmoItemDeserializer) {
        super(options);
        this.addClassTag(MMOItem.class, Tag.MAP);
        this.representers.put(CraftingRecipe.class, new CraftingRecipeRepresenter());
        this.representers.put(NumericStat.class, new NumericStatRepresenter());
        this.representers.put(ItemParticle.class, new ItemParticleRepresenter());
        this.representers.put(PotionEffect.class, new PotionEffectRepresenter(this.objectToRepresent));
        this.mmoItemDeserializer = mmoItemDeserializer;

    }

    @Override
    protected MappingNode representJavaBean(Set<Property> properties, Object javaBean) {
        List<NodeTuple> value = new ArrayList<NodeTuple>(properties.size());
        Tag tag;
        Tag customTag = classTags.get(javaBean.getClass());
        tag = customTag != null ? customTag : new Tag(javaBean.getClass());
        // flow style will be chosen by BaseRepresenter
        MappingNode node = new MappingNode(tag, value, DumperOptions.FlowStyle.AUTO);
        representedObjects.put(javaBean, node);
        DumperOptions.FlowStyle bestStyle = DumperOptions.FlowStyle.FLOW;
        for (Property property : properties) {
            Object memberValue = property.get(javaBean);
            Tag customPropertyTag = memberValue == null ? null : classTags.get(memberValue.getClass());
            NodeTuple tuple =
                    representJavaBeanProperty(javaBean, property, memberValue, customPropertyTag);
            if (!property.getName().equals("additionalInfo")) {
                if (tuple == null) {
                    continue;
                }
                if (!((ScalarNode) tuple.getKeyNode()).isPlain()) {
                    bestStyle = DumperOptions.FlowStyle.BLOCK;
                }
                Node nodeValue = tuple.getValueNode();
                if (!(nodeValue instanceof ScalarNode && ((ScalarNode) nodeValue).isPlain())) {
                    bestStyle = DumperOptions.FlowStyle.BLOCK;
                }
                value.add(tuple);
            } else {
                MMOItem mmoItem = (MMOItem) javaBean;
                if (!mmoItem.getAdditionalInfo().isEmpty()) {
                    mmoItem.getAdditionalInfo().forEach((key, object) -> {
                        value.add(new NodeTuple(
                                representData(key), represent(object)));
                    });

                }
            }
        }
        if (defaultFlowStyle != DumperOptions.FlowStyle.AUTO) {
            node.setFlowStyle(defaultFlowStyle);
        } else {
            node.setFlowStyle(bestStyle);
        }
        return node;
    }

    @Override
    protected NodeTuple representJavaBeanProperty(Object javaBean, Property property, Object propertyValue, Tag customTag) {
        if (propertyValue == null) return null;

        if (propertyValue instanceof CraftingRecipe) {
            CraftingRecipe craftingRecipe = (CraftingRecipe) propertyValue;
            boolean isEmpty = craftingRecipe.isEmpty();
            if (isEmpty) return null;
        }

        if (mmoItemDeserializer.getBaseTypeDescription().getProperties().contains(property)) {
            NodeTuple tuple = super.representJavaBeanProperty(javaBean, property, propertyValue, customTag);
            return new NodeTuple(
                    representData(convertCamelToDashed(property.getName())),
                    tuple.getValueNode()
            );
        }

        return super.representJavaBeanProperty(javaBean, property, propertyValue, customTag);
    }

    @Override
    protected Set<Property> getProperties(Class<?> type) {
        final Set<Property> result = new TreeSet<>(Comparator.comparingInt(a -> order.indexOf(a.getName())));
        result.addAll(super.getProperties(type)
                .stream()
                .filter(property -> order.contains(property.getName()))
                .collect(Collectors.toSet()));
        return result;
    }

    private String convertCamelToDashed(String string) {
        return string.replaceAll("([a-z])([A-Z]+)", "$1-$2").toLowerCase();
    }

    private class CraftingRecipeRepresenter implements Represent {

        @Override
        public Node representData(Object data) {
            CraftingRecipe craftingRecipe = (CraftingRecipe) data;
            HashMap<String, HashMap<String, HashMap<String, Object>>> baseMap = new HashMap<>();

            HashMap<String, HashMap<String, Object>> shapedMap = craftingRecipe.getShapedRecipeMap();
            HashMap<String, HashMap<String, Object>> shapelessMap = craftingRecipe.getShapelessRecipeMap();
            HashMap<String, HashMap<String, Object>> furnaceMap = craftingRecipe.getFurnaceRecipeMap();
            HashMap<String, HashMap<String, Object>> blastMap = craftingRecipe.getBlastRecipeMap();
            HashMap<String, HashMap<String, Object>> smokerMap = craftingRecipe.getSmokerRecipeMap();
            HashMap<String, HashMap<String, Object>> campfireMap = craftingRecipe.getCampfireRecipeMap();

            if (!shapedMap.isEmpty())  baseMap.put("shaped", shapedMap);
            if (!shapelessMap.isEmpty())  baseMap.put("shapeless", shapelessMap);
            if (!furnaceMap.isEmpty())  baseMap.put("furnace", furnaceMap);
            if (!blastMap.isEmpty())  baseMap.put("blast", blastMap);
            if (!smokerMap.isEmpty())  baseMap.put("smoker", smokerMap);
            if (!campfireMap.isEmpty())  baseMap.put("campfire", campfireMap);

            return representMapping(getTag(data.getClass(), Tag.MAP), baseMap, DumperOptions.FlowStyle.AUTO);
        }
    }

    private class NumericStatRepresenter implements Represent {

        @Override
        public Node representData(Object data) {
            NumericStat numericStat = (NumericStat) data;
            if (numericStat.getScale() == null && numericStat.getSpread() == null && numericStat.getMaxSpread() == null) {
                return representScalar(Tag.FLOAT, numericStat.getBase().toString());
            }

            HashMap<String, Double> map = new HashMap<>();
            if (numericStat.getBase() != null) map.put("base", numericStat.getBase());
            if (numericStat.getScale() != null) map.put("scale", numericStat.getScale());
            if (numericStat.getSpread() != null) map.put("spread", numericStat.getSpread());
            if (numericStat.getMaxSpread() != null) map.put("max-spread", numericStat.getMaxSpread());

            return representMapping(getTag(data.getClass(), Tag.MAP), map, DumperOptions.FlowStyle.AUTO);
        }
    }

    private class ItemParticleRepresenter implements Represent {

        @Override
        public Node representData(Object data) {
            ItemParticle itemParticle = (ItemParticle) data;

            HashMap<String, Object> map = new HashMap<>();
            if (itemParticle.getType() != null) map.put("type", itemParticle.getType());
            if (itemParticle.getParticle() != null) map.put("particle", itemParticle.getParticle());
            if (itemParticle.getAmount() != null) map.put("amount", itemParticle.getAmount());
            if (itemParticle.getRadius() != null) map.put("radius", itemParticle.getRadius());
            if (itemParticle.getOffset() != null) map.put("offset", itemParticle.getOffset());
            if (itemParticle.getSpeed() != null) map.put("speed", itemParticle.getSpeed());
            if (itemParticle.getRotationSpeed() != null) map.put("rotation-speed", itemParticle.getRotationSpeed());
            if (itemParticle.getRotationSpeed() != null) map.put("height", itemParticle.getRotationSpeed());
            if (itemParticle.getColor() != null) map.put("color", itemParticle.getColor());


            return representMapping(getTag(data.getClass(), Tag.MAP), map, DumperOptions.FlowStyle.AUTO);
        }
    }

    private class PotionEffectRepresenter implements Represent {

        private MMOItem mmoItem;
        public PotionEffectRepresenter(Object mmoItem) {
            this.mmoItem = (MMOItem) mmoItem;
        }

        @Override
        public Node representData(Object data) {
            return representMapping(getTag(data.getClass(), Tag.MAP), mmoItem.getPermEffects(), DumperOptions.FlowStyle.AUTO);
        }
    }

}
