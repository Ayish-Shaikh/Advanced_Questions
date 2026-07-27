package stack;

import java.util.Stack;

public class reverse_string {
    public static void main(String[] args) {

        //    STACK BASED APPROACH(LIFO USED ) TC- O(n)

        String str = "Hello";

        Stack<Character> stack = new Stack<>();

        for (char ch: str.toCharArray()){
            stack.push(ch);
        }

        stack.pop();
        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()){
            reversed.append(stack.pop());
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}
