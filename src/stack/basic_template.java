package stack;

import java.util.Stack;

public class basic_template {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        System.out.println("Is empty : " + stack.isEmpty());

        System.out.println("size: " + stack.size());

        System.out.println(stack);

        for (int num: stack){
            System.out.println(num);
        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
