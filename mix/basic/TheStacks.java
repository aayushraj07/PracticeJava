package basic;

import java.util.Stack;

public class TheStacks {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(22);
        stack.push(33);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

    }
}
