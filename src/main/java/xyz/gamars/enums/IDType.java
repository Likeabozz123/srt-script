package xyz.gamars.enums;

public enum IDType {

    VANILLA("v"),
    MMO_MATERIAL("m material"),
    MMO_CONSUMABLE("m consumable"),
    MMO_GEM_STONE("m gem_stone")
    ;

    private String text;

    IDType(String text) {
        this.text = text;
    }
    @Override
    public String toString() {
        return text;
    }
}
