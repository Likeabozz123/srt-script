package xyz.gamars.crafting;

import xyz.gamars.enums.IDType;

public record CraftingItem(IDType idType, String id, int amount) {

    public CraftingItem(IDType idType, String id) {
        this(idType, id, 1);
    }

    @Override
    public String toString() {
        if (idType == IDType.MMO_ITEMS) {
            return idType + " material " + id + " " + amount + ".0..";
        }

        return idType + " " + id + " - " + amount + ".0..";
    }
}
