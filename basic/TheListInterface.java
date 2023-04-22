package basic;

import java.util.*;

public class TheListInterface {
    public static void main(String[] args){
        List<String> tools = new ArrayList<>();
        Vector<String> tt = new Stack<>();
        List<String> books = List.of("Game of Thrones, Ice and Fire", "Shining", "Misery", "dance of the dragon");
        tools.add("ChainSaw");
        System.out.println(books);
        List.of("GoT", 2);
        tools.add("screw");
        tools.add("axe");
        tools.add("wrench");
        ArrayList<String> requirments = new ArrayList<>();
        requirments.add("SQL");
        requirments.add("C#");
        System.out.println(requirments.size());
        System.out.println(requirments);

        for(String requirement : requirments){
            System.out.println(requirement);
        }

        requirments.forEach(System.out::println);

    }
}
