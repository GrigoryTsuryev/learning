package Masa.Exeptions;

public class Exeptions {
    static class Exeption1 extends Exception {
        void throwRandomExeption() {
            System.out.println("Exeption0");
        }
    }

    static class Exeption2 extends Exception {
        void throwRandomExeption() {
            System.out.println("Exeption1");
        }
    }

    static class Exeption3 extends Exception {
        void throwRandomExeption() {
            System.out.println("Exeption3");
        }
    }
}
