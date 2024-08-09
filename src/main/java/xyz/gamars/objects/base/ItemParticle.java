package xyz.gamars.objects.base;

public class ItemParticle {

    private String type;
    private String particle;
    private Double amount;
    private Double radius;
    private Double speed;
    private Double rotationSpeed;
    private Double height;

    public ItemParticle(String type, String particle, Double amount, Double radius, Double speed, Double rotationSpeed, Double height) {
        this.type = type;
        this.particle = particle;
        this.amount = amount;
        this.radius = radius;
        this.speed = speed;
        this.rotationSpeed = rotationSpeed;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParticle() {
        return particle;
    }

    public void setParticle(String particle) {
        this.particle = particle;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getRotationSpeed() {
        return rotationSpeed;
    }

    public void setRotationSpeed(Double rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
