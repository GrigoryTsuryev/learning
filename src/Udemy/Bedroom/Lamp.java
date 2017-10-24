package Udemy.Bedroom;

public class Lamp {
    private String style;
    private boolean battery;
    private  int globRating;

    public void turnOn(){
        System.out.println("Lamp-->Turning ON");
    }
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattary() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
