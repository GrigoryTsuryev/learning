package Masa.ShellGame;

import javax.sound.sampled.Mixer;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Player player = new Player();

        game.startGame();
        finishGame(game, player);


    }

    public static void finishGame(Game game, Player player){
        if(game.mix()==player.pickUpShell()){
            player.addPoints();
            System.out.println("Player won");
        }else {
            System.out.println("Computer won");
        }
    }


}
