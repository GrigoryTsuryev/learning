package Masa.Enum;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Answers[] answers = Answers.values();
        while (true) {
            double randomNumber = 1 + Math.random() * 100;
            if (randomNumber>0)
                System.out.println(Answers.Never);
            System.out.println("Do you want to continue?");
            Scanner scanner = new Scanner(System.in);
            if (scanner.next().toLowerCase().equals("no")){
                break;
            }
        }

    }
}
