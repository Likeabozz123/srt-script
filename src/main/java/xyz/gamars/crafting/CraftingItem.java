package xyz.gamars.crafting;

import xyz.gamars.enums.IDType;

public record CraftingItem(IDType idType, String id, int amount) {

    public CraftingItem(IDType idType, String id) {
        this(idType, id, 1);
    }

    @Override
    public String toString() {
        if (idType == IDType.MMO_MATERIAL || idType == IDType.MMO_CONSUMABLE || idType == IDType.MMO_GEM_STONE) {
            return idType + " " + id + " " + amount + ".0..";
        }

        if (id.equals("air")) {
            return "v AIR 0 1..";
        }

        return idType + " " + id + " - " + amount + ".0..";
    }
}
