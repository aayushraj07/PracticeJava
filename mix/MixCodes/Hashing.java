import java.util.*;
public class Hashing {
    
    public static void main(String args[]){
        HashMap<String,Integer> countryMap = new HashMap<>();


        // Insertion
        countryMap.put("India",120);
        countryMap.put("China", 170);
        countryMap.put("USA", 70);
        System.out.println(countryMap);
        countryMap.put("China", 220);
        System.out.println(countryMap);

        // Search
        if(countryMap.containsKey("India")){
            System.out.println("Present in the map");
        }else{
            System.out.println("not present");
        }

        if(countryMap.containsValue(220)){
            System.out.println("Population is getting high");
        }else{
            System.out.println("Population is fine");
        }

        System.out.println(countryMap.get("China"));
        System.out.println(countryMap.get(120));


        int arr[] = {1,3,5,6};
        for(int i = 0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();

        for(int val : arr){
            System.out.println(val + " ");
        }

        for(Map.Entry<String, Integer> e: countryMap.entrySet()){
            System.out.println(e);
        }
    }
}
