package Masa.Exception;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter first number: ");
        Scanner scanner = new Scanner(System.in);
        int a = 0;
            try {
                String temp = scanner.next();
                a = Integer.valueOf(temp);
            } catch (NumberFormatException e) {
                System.out.println("Need to enter a number in a first field");
                System.exit(1);
            }

            System.out.println("Enter second number: ");
            int b = 0;
            try {
                String temp = scanner.next();
                b = Integer.valueOf(temp);
            } catch (NumberFormatException e) {
                System.out.println("Need to enter a number in a first field");
                System.exit(1);
            }
            try {
                int c = a / b;
            } catch (ArithmeticException e) {
                System.out.println("Cant divide by 0");
                System.exit(1);
            }

            int result = a / b;
            System.out.println("Result is " + result);
        }
    }
