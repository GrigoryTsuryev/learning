package Masa.ShellGame;

import java.util.Scanner;

public class Player {
    private String name;
    private int points = 0;

    public Player() {
        this.name = name;
        this.points = points;
    }

    public int pickUpShell(){
        System.out.println("Pick up the shell from 1 to 3");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }

    public int addPoints() {
        return points++;
    }
}
