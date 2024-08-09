package xyz.gamars;

import xyz.gamars.crafting.OldCraftingRecipe;
import xyz.gamars.enums.ClickMode;
import xyz.gamars.enums.ClickType;

public class AbilityStone {

    private String className;
    private String classAcronym;
    private int displayColor;
    private String abilityName;
    private OldCraftingRecipe oldCraftingRecipe;

    private String exportText;

    public AbilityStone() {
        this.className = "";
        this.classAcronym = "";
        this.displayColor = -1;
        this.abilityName = "";
        this.exportText = "";
        this.oldCraftingRecipe = new OldCraftingRecipe(null, "", "", "");
    }

    public AbilityStone(String className, String classAcronym, int displayColor, String abilityName, OldCraftingRecipe oldCraftingRecipe) {
        this.className = className.toUpperCase();
        this.classAcronym = classAcronym.toUpperCase();
        this.displayColor = displayColor;
        this.abilityName = abilityName.toUpperCase();
        this.oldCraftingRecipe = oldCraftingRecipe;
        this.exportText = abilityStone(ClickType.R, ClickType.SR, ClickMode.RIGHT_CLICK) + shapedCrafting(oldCraftingRecipe) +
                abilityStone(ClickType.SR, ClickType.SL, ClickMode.SHIFT_RIGHT_CLICK) +
                abilityStone(ClickType.SL, ClickType.R, ClickMode.SHIFT_LEFT_CLICK);
    }

    private String prettyFormat(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1, string.indexOf("_")).toLowerCase() + " " +
                string.substring(string.indexOf("_") + 1, string.indexOf("_") + 2).toUpperCase() + string.substring(string.indexOf("_") + 2).toLowerCase();
    }

    private String beginCapital(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    private String abilityStone(ClickType clickType, ClickType nextClickType, ClickMode clickMode) {
        return "SRT_" + className + "_" + abilityName +"_" + clickType + ":\n" +
                "  base:\n" +
                "    material: IRON_INGOT\n" +
                "    name: §" + displayColor + "[" + classAcronym +"] " + prettyFormat(abilityName) + "\n" +
                "    gem-color: " + beginCapital(className) +" " + clickType + "\n" +
                "    ability:\n" +
                "      ability1:\n" +
                "        type: " + abilityName + "\n" +
                "        mode: " + clickMode + "\n" +
                "    crafting:\n" +
                "      shapeless:\n" +
                "        '1':\n" +
                "          input:\n" +
                "          - m gem_stone SRT_" + className + "_" + abilityName + "_" + nextClickType + " 1.0..\n" +
                "          - v AIR - 1.0..\n" +
                "          - v AIR - 1.0..\n" +
                "          - v AIR - 1.0..\n" +
                "          - v AIR - 1.0..\n" +
                "          - v AIR - 1.0..\n" +
                "          - v AIR - 1.0..\n" +
                "          - v AIR - 1.0..\n" +
                "          - v AIR - 1.0..\n";
    }

    private String shapedCrafting(OldCraftingRecipe oldCraftingRecipe) {
        return "\t  shaped:\n" +
                "        '1':\n" +
                "          input:\n" + oldCraftingRecipe;
    }

    @Override
    public String toString() {
        return exportText;
    }

}
