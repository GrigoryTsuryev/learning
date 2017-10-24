package Masa.RockPaperScissors;

import java.util.Scanner;

public class Human implements Player{

    int points =0;

    private Scanner scanner;
    public Human(Scanner scanner){
        this.scanner = scanner;
    }

    @Override
    public String getName() {
        System.out.println("Please enter your Name");
        return scanner.next();
    }

    @Override
    public int getPoint() {
        return points;
    }

    @Override
    public void addPoint() {
        points+=1;
    }

    @Override
    public String getMove() {
        System.out.println("What are you placing?");
        return scanner.next();
    }
}
