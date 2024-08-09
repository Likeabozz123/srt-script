package xyz.gamars.objects.base;

public class NumericStat {

    private Double base;
    private Double scale;
    private Double spread;
    private Double maxSpread;

    public NumericStat() {
    }

    public NumericStat(Double base) {
        this.base = base;
    }

    public NumericStat(Double base, Double scale, Double spread, Double maxSpread) {
        this.base = base;
        this.scale = scale;
        this.spread = spread;
        this.maxSpread = maxSpread;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getScale() {
        return scale;
    }

    public void setScale(Double scale) {
        this.scale = scale;
    }

    public Double getSpread() {
        return spread;
    }

    public void setSpread(Double spread) {
        this.spread = spread;
    }

    public Double getMaxSpread() {
        return maxSpread;
    }

    public void setMaxSpread(Double maxSpread) {
        this.maxSpread = maxSpread;
    }
}
