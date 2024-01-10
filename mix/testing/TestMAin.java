package testing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class TestMAin {

    public static void main(String[] args) {
        String a = "John";
        String b = "John";
        b = "John dRaj";


        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1,"Bihar");
        states.put(2,"UP");
        states.forEach((k,v)->System.out.println(k+" "+v));
        System.out.println("Test to fail!");
        System.out.println('a'+'a');
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> da = new HashMap<>();
    }
}
