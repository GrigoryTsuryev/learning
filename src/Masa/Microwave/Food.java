package Masa.Microwave;

public class Food {
    private boolean isRaw = true;
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isRaw() {
        return isRaw;
    }

    public void setRaw(boolean raw) {
        isRaw = raw;
    }
}
