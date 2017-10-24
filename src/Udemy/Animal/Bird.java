package Udemy.Animal;

public abstract class  Bird extends Animal implements CanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating");

    }

    @Override
    public void breathe() {
        System.out.println("Breath in, breath out, repeat");
    }

    @Override
    public void fly() {
        System.out.println("flapping with wings");
    }
}