package stack;

import java.util.Stack;

public class reverse_character {
    public static void main(String[] args) {
        String str = " I Love Java";

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}