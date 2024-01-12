package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class AList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Aayush", "Raj", "Honey","Aayush Raj", "Raj"));
        removeDuplicate(list);


    }

    private static ArrayList<String> removeDuplicate(ArrayList<String> list) {
        Set<String> set = new LinkedHashSet<>();

        // Add the elements to set
        set.addAll(list);

        // Clear the list
        list.clear();

        // add the elements of set
        // with no duplicates to the list
        list.addAll(set);

        // return the list
        return list;
    }

}
