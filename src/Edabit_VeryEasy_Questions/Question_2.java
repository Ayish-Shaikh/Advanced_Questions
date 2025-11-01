/**Return the Next Number from the Integer Passed
 Create a function that takes a number as an argument, increments the number by +1 and returns the result.

 Examples
 addition(0) ➞ 1

 addition(9) ➞ 10

 addition(-3) ➞ -2
 Notes
 Don't forget to return the result.*/

package Edabit_VeryEasy_Questions;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int a = sc.nextInt();
        for (int i = a; i <a+1 ; i++) {
            System.out.println( i + 1);
        }
    }
}
