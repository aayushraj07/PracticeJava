package prepDay.ArrayList;

import java.util.ArrayList;

public class Intro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + "->" + list.size());

        list.add(10);
        list.add(20);
        System.out.println(list + "->" + list.size());


        list.add(1,12);
        System.out.println(list + "->" + list.size());

        int val = list.get(1);
        System.out.println(val);

        System.out.println(list.get(1));

        list.set(1,2000);
        System.out.println(list + "->" + list.size());


        list.remove(2);
        System.out.println(list + "->" + list.size());

        ArrayList<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("cello");
        strings.add("trello");

        System.out.println(strings);
        System.out.println(strings + "->" + strings.size());

        for(String str : strings){
            System.out.println(str);
        }

        for(int i = 0; i<strings.size();i++){
            System.out.println(strings.get(i));
        }

    }
}
