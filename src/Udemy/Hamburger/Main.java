package Udemy.Hamburger;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausege", 3.58, "White");
        double price = hamburger.itemizerHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total Burger price is " + hamburger.itemizerHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg",5.43);
        healthyBurger.addHealthAddition1("Lentils",3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizerHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println("Total Deluxe Burger price is " + deluxeBurger.itemizerHamburger());

    }
}