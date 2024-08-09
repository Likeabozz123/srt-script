package xyz.gamars.objects.base;

public class SoundEffect {

    private String id;
    private String sound;
    private Integer volume;
    private Integer pitch;

    public SoundEffect(String id, String sound, Integer volume, Integer pitch) {
        this.id = id;
        this.sound = sound;
        this.volume = volume;
        this.pitch = pitch;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getPitch() {
        return pitch;
    }

    public void setPitch(Integer pitch) {
        this.pitch = pitch;
    }
}
