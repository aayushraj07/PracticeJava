package basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class TheQueue {
    public static void main(String[] args){



        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.addFirst(new Person("Stuart", 19));
        linkedList.addFirst(new Person("Rupert", 22));
        linkedList.addLast(new Person("Lampard", 19));
        System.out.println(linkedList);

    }

    private static void queues() {
        Queue<Person> queueList = new LinkedList<>();
        queueList.add(new Person("Aayush", 25));
        queueList.add(new Person("Clark", 29));
        queueList.add(new Person("Bruce", 37));
        queueList.add(new Person("Robert Junior", 41));
    }

    static record Person(String name, int age){}
}
