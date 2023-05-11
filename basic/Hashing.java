package basic;

import java.util.Hashtable;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String args[]){
        Hashtable<Integer, String> hm = new Hashtable<Integer,String>();

        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(43);

        System.out.println(set);
        System.out.println(set.contains(3));

        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }


        hm.put(1,"Geeks");
        hm.put(12,"Of");
        hm.put(3,"Geeks");

        System.out.println(hm);
    }
}
