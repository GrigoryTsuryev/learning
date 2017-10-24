package Udemy.Vehicle;

public class Outlander extends Car {
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelociry = getCurrentDirection() + rate;
        if (newVelociry == 0) {
            stop();
            changeGear(0);
        } else if (newVelociry > 0 && newVelociry <= 10) {
            changeGear(1);
        } else if (newVelociry > 10 && newVelociry <= 20) {
            changeGear(2);
        } else if(newVelociry>20&&newVelociry<=30) {
            changeGear(3);
        }else {
            changeGear(4);
        }
        if(newVelociry>0){
            changeVelocity(newVelociry, getCurrentDirection());
        }
    }
}