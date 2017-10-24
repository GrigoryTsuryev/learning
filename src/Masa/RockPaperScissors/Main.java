package Masa.RockPaperScissors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(new Scanner(System.in));
        String humanName = human.getName();
        Computer computer = new Computer();
        String computerName = computer.getName();
        Human humPoints = new Human(new Scanner(System.in));
        Computer compPoints = new Computer();

        String loop ="no";
        while (loop.equals("no")){
            String humanMove = human.getMove();
            String computerMove = computer.getMove();

            if (("Rock").equals(humanMove) && computerMove.equals("Rock")) {
                System.out.println("Equality");
                System.out.println(" Totals are " + humPoints.getPoint() + " points for " + humanName + " and  "
                        + compPoints.getPoint() + " points for " + computerName);
            }
            if (humanMove.equals("Paper") && computerMove.equals("Rock")) {
                humPoints.addPoint();
                System.out.println(humanName + " Wins!");
                System.out.println(" Totals are " + humPoints.getPoint() + " points for " + humanName + " and  "
                        + compPoints.getPoint() + " points for " + computerName);
            }
            if (humanMove.equals("Scissors") && computerMove.equals("Rock")) {
                compPoints.addPoint();
                System.out.println(computerName + " Wins!");
                System.out.println(" Totals are " + humPoints.getPoint() + " points for " + humanName + " and  "
                        + compPoints.getPoint() + " points for " + computerName);
            }

            if (humanMove.equals("Rock") && computerMove.equals("Paper")) {
                compPoints.addPoint();
                System.out.println(computerName + " Wins!");
                System.out.println(" Totals are " + humPoints.getPoint() + " points for " + humanName + " and  "
                        + compPoints.getPoint() + " points for " + computerName);
            }

            if (humanMove.equals("Rock") && computerMove.equals("Scissors")) {
                humPoints.addPoint();
                System.out.println(humanName + " Wins!");
                System.out.println(" Totals are " + humPoints.getPoint() + " points for " + humanName + " and  "
                        + compPoints.getPoint() + " points for " + computerName);
            }
            if (humanMove.equals("Scissors") && computerMove.equals("Paper")) {
                humPoints.addPoint();
                System.out.println(humanName + " Wins!");
                System.out.println(" Totals are " + humPoints.getPoint() + " points for " + humanName + " and  "
                        + compPoints.getPoint() + " points for " + computerName);
            }
            if (humanMove.equals("Scissors") && computerMove.equals("Scissors")) {
                System.out.println("Equality");
                System.out.println(" Totals are " + humPoints.getPoint() + " points for " + humanName + " and "
                        + compPoints.getPoint() + " points for " + computerName);
            }
            if (humanMove.equals("Paper") && computerMove.equals("Scissors")) {
                compPoints.addPoint();
                System.out.println(computer.getName() + " Wins!");
                System.out.println(" Totals are " + humPoints.getPoint() + " points for " + humanName + " and  "
                        + compPoints.getPoint() + " points for " + computerName);
            }
            if (humanMove.equals("Paper") && computerMove.equals("Paper")) {
                System.out.println("Equality");
                System.out.println(" Totals are " + humPoints.getPoint() + " points for " + humanName + " and  "
                        + compPoints.getPoint() + " points for " + computerName);
            }

            System.out.println("Do you want to continue? Please Enter /no/ for Exit");
            Scanner scanner = new Scanner(System.in);
            if(scanner.next().equals(loop)){
                break;
            }
        }
    }
}

