/**Return the Sum of Two Numbers
Create a method that takes two integers as arguments and returns their sum.

        Examples
SumOfTwoNumbers(3, 2) ➞ 5

SumOfTwoNumbers(-3, -6) ➞ -9

SumOfTwoNumbers(7, 3) ➞ 10
Notes
Don't forget to return the result.*/

package Edabit_VeryEasy_Questions;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 Numbers: ");
        int a= sc.nextInt();
        int b=sc.nextInt();

        int sum = a+b;

        System.out.println("The Sum of Two Numbers : " + sum);
    }

}
