package Masa.ShellGame;

public class Game {
    private boolean areClean;
    private boolean ballInside;
    private int first;
    private int second;
    private int third;

    public Game() {
        this.areClean = areClean;
        this.ballInside = ballInside;
        this.first = first;
        this.second =  second;
        this.third = third;
    }


    public void startGame(){
        System.out.println("You have started the game.");
        ballInside = true;
        areClean = false;
    }

    public int mix(){
        int random = 1 + (int) (Math.random() * 3);
        switch (random){
            case 0:
                return first;
            case 1:
                return second;
            case 2:
                return third;
        }return random;
    }

}

