package Udemy.Animal;

public class Puingun extends Bird {
    public Puingun(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I am not good at flying, better to go swimming");
    }
}
