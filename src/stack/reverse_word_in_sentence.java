package stack;

import java.util.Stack;

public class reverse_word_in_sentence {
    public static void main(String[] args){
        String str = "I Love Java";
        Stack<String> stack = new Stack<>();

        String[] words = str.trim().split(" ");

        for ( int i = 0; i < words.length; i++){
            stack.push(words[i]);
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop( )).append(" ");
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + result);
    }
}
