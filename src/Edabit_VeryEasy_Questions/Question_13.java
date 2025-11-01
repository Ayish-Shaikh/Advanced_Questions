package Edabit_VeryEasy_Questions;

import java.util.Scanner;
import java.lang.String;
/**Compare Strings by Count of Characters
 Create a function that takes two strings as arguments and return either true or false depending on whether the total number of characters in the first string is equal to the total number of characters in the second string.

 Examples
 comp("AB", "CD") ➞ true

 comp("ABC", "DE") ➞ false

 comp("hello", "edabit") ➞ false
 Notes
 Don't forget to return the result.
 If you get stuck on a challenge, find help in the Resources tab.
 If you're really stuck, unlock solutions in the Solutions tab.*/
public class Question_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string a :");
        String a = sc.nextLine();
        System.out.println("Enter the string b :");
        String b = sc.nextLine();

        if (a.length() == b.length()) {
            System.out.println("This is correct hence "+ true);
        }else {
            System.out.println(false);
        }
    }
}
