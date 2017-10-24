package Udemy.Animal;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Huy");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australin Bird");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        Puingun puingun = new Puingun("White");
        puingun.fly();
    }


}
