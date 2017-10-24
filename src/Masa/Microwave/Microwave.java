package Masa.Microwave;

public class Microwave {
    private boolean isDoorOpen = false;
    private Food food;
    private boolean isEmpty = true;

    void putFood(Food food) {
        if (isEmpty == true) {
            System.out.println("You have place " +food.getName() + " into Microwave");
            this.food = food;
            isEmpty=false;
        } else {
            System.out.println("The Microwave is full");
        }
    }

    public void closeDoor() {
        System.out.println("You have closed the door");
        this.isDoorOpen = false;
    }

    public void openDoor() {
        if (isDoorOpen == true) {
            System.out.println("The door is already open. Cant procced.");
        } else {
            System.out.println("You have open the door");
            this.isDoorOpen = true;
        }
    }

    public void cook() throws TheDoorIsOpenException, NoFoodInTheWaveException{
        if (isDoorOpen == true) {
                throw new TheDoorIsOpenException();
        } else if (isEmpty == true){
                throw new NoFoodInTheWaveException();
        } else{
            food.setRaw(true);
            System.out.println("Food is cooked");
        }
    }
}

class NoFoodInTheWaveException extends Exception{
    public NoFoodInTheWaveException() {
        super("No food is the Wave");
    }
}
class TheDoorIsOpenException extends Exception{
    public TheDoorIsOpenException() {
        super("The Door is Open");
    }
}


