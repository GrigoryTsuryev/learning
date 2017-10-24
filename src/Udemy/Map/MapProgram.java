package Udemy.Map;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java")){
            System.out.println("Java is already exist");
        } else {
            languages.put("Java", " a compiled high leve, object-oriented, platform indepentant lenguage");
            System.out.println("Java added succsessfully");
        }

        languages.put("Python","an intereted, orbject-oriented, high-level programming lenguage with dynemic synaptics");
        languages.put("Algol", "an anlgorithmic lenguage");
        System.out.println(languages.put("Basic", "Begginers all puurpes sympolic instraction code" ));
        System.out.println(languages.put("Lisp","There lies madness"));
        if(languages.containsKey("Java")){
            System.out.println("Java is already is the list");
        } else {
            languages.put("Java", "this course is about Java");
        }
        System.out.println("+++++++++++++++++++++++++++++++++");

//        languages.remove("Lisp");

        if(languages.remove("Algol", "a family of algorithmic")){
            System.out.println("Algol removed");
        }else{
            System.out.println("Algol not removed, keyValue not found");
        }
        for (String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }



    }
}
