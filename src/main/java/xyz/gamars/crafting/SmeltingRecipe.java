package xyz.gamars.crafting;

import xyz.gamars.enums.SmeltingType;

public class SmeltingRecipe {

    private CraftingItem item;
    private Integer time;
    private Double experience;

    public SmeltingRecipe(CraftingItem item, Integer time, Double experience) {
        this.item = item;
        this.time = time;
        this.experience = experience;
    }

    public CraftingItem getItem() {
        return item;
    }

    public void setItem(CraftingItem item) {
        this.item = item;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Double getExperience() {
        return experience;
    }

    public void setExperience(Double experience) {
        this.experience = experience;
    }
}
