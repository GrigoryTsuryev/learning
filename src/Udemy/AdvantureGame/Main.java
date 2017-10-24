package Udemy.AdvantureGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempExist = new HashMap<>();
        locations.put(0, new Location(0,"You are sitting in front of a computer learning Java", tempExist));

        tempExist = new HashMap<>();
        tempExist.put("W",2);
        tempExist.put("E",3);
        tempExist.put("S",4);
        tempExist.put("N",5);
        locations.put(1, new Location(0,"You are standing at the end of a road before a small brick building", tempExist));

        tempExist = new HashMap<>();
        tempExist.put("N",5);
        locations.put(2, new Location(0,"You are at the top of a hill", tempExist));

        tempExist = new HashMap<>();
        tempExist.put("W",1);
        locations.put(3, new Location(0,"You are inside a building, a well house for a small spring", tempExist));

        tempExist = new HashMap<>();
        tempExist.put("N",1);
        tempExist.put("W",2);
        locations.put(4, new Location(0,"You are in a valley beside a stream", tempExist));

        tempExist.put("S",1);
        tempExist.put("W",2);
        locations.put(5, new Location(0,"You are in the forest", tempExist));

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "E");
        vocabulary.put("EAST", "E");


        int loc = 1;
        while (true){
            System.out.println(locations.get(loc).getDescription());
            if(loc==0){
                break;
            }

            Map<String, Integer>exits=locations.get(loc).getExits();
            System.out.print("Available exits are: ");
            for (String exit: exits.keySet()){
                System.out.print(exit +", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if(direction.length()>1){
                String[] words = direction.split(" ");
                for(String word: words){
                    if(vocabulary.containsKey(word)){
                        direction=vocabulary.get(word);
                        break;
                    }
                }
            }
            if(exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("Cant go in that direction");
            }
            if(!locations.containsKey(loc)){
                System.out.println("You cant go in that direction");
            }
        }
    }
}
