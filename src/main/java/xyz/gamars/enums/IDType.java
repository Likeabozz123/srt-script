package xyz.gamars.enums;

public enum IDType {

    VANILLA,
    MMO_ITEMS;

    @Override
    public String toString() {
        return this.name().substring(0, 1).toLowerCase();
    }
}
