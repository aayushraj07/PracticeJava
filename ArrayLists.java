import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    // Integer | Float | String | Boolean
    public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();

    list.add(0);
    list.add(1);
    list.add(2);

    System.out.println(list);

    System.out.println(list.get(2));

    list.add(2,3);
    System.out.println(list);

    list.set(2,2);
    list.set(3,3);
    System.out.println(list);


    list.remove(0);
    System.out.println(list);

    System.out.println(list.size());


    for(int i =0; i< list.size() ; i++){
        System.out.print(list.get(i));
    }
    System.out.println();

    list.add(0,4);
    Collections.sort(list);
    System.out.println(list);

}    

}
