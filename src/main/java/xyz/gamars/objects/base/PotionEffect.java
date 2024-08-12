package xyz.gamars.objects.base;

public class PotionEffect {

    private Double amplifier;
    private NumericStat duration;

    public PotionEffect(Double amplifier, NumericStat duration) {
        this.amplifier = amplifier;
        this.duration = duration;
    }

    public PotionEffect(Double amplifier) {
        this.amplifier = amplifier;
    }

    public PotionEffect() {
    }

    public NumericStat getDuration() {
        return duration;
    }

    public void setDuration(NumericStat duration) {
        this.duration = duration;
    }

    public Double getAmplifier() {
        return amplifier;
    }

    public void setAmplifier(Double amplifier) {
        this.amplifier = amplifier;
    }
}
