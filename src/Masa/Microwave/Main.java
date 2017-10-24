package Masa.Microwave;

public class Main {
    public static void main(String[] args)throws Exception {
        Food food = new Food("Patato");
        Microwave microwave = new Microwave();
        microwave.openDoor();
        microwave.putFood(food);
        microwave.closeDoor();
        microwave.cook();
    }
}
