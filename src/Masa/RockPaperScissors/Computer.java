package Masa.RockPaperScissors;

public class Computer implements Player {
    int points;

    @Override
    public String getName() {
        String name = "Computer";
        System.out.println(name);
        return name;
    }

    @Override
    public int getPoint() {
        return points;
    }


    @Override
    public void addPoint() {
        points++;
    }

    @Override
    public String getMove() {
        String result ="";
            int num = 1 + (int) (Math.random() * 3);
            if (num == 1) {
                result = "Rock";
            }
            if (num == 2) {
                result = "Paper";
            }
            if (num == 3) {
                result = "Scissors";
            }
        System.out.println("Computer is placing " + result);
        return result;
    }
}
