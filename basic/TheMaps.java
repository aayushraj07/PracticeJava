package basic;

import java.util.HashMap;
import java.util.Map;

public class TheMaps {

    public static void main(String[] args){

        Map<Integer,Person> personMap = new HashMap<>();
        personMap.put(1,new Person("Rupert"));
        personMap.put(2,new Person("Alex"));
        personMap.put(3,new Person("Son"));
        personMap.put(4,new Person("Ronald"));
        personMap.put(2,new Person("Alexa"));
        System.out.println(personMap);
        System.out.println(personMap.get(3));
        System.out.println(personMap.keySet());
        personMap.entrySet().forEach(x-> System.out.println(x.getKey()+" " +x.getValue()));
        System.out.println(personMap.get(2));
    }

    record Person(String name){}
}
