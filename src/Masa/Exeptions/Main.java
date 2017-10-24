package Masa.Exeptions;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            exceptionSource();
        } catch (Exeptions.Exeption1 exeption1) {
            exeption1.printStackTrace();
        } catch (Exeptions.Exeption2 exeption2) {
            exeption2.printStackTrace();
        } catch (Exeptions.Exeption3 exeption3) {
            exeption3.printStackTrace();
        }

    }

    static void exceptionSource() throws Exeptions.Exeption1, Exeptions.Exeption2,Exeptions.Exeption3{
        int random = 0 + (int) (Math.random() * 2);
        switch (random){
            case 0:
                throw new Exeptions.Exeption1();
            case 1:
                throw new Exeptions.Exeption2();
            case 2:
                throw new Exeptions.Exeption3();
        }
    }
}
