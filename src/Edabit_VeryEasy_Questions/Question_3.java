/**Are the Numbers Equal?
 Create a function that returns true when x is equal to y; otherwise return false.

 Examples
 isSameNum(4, 8) ➞ false

 isSameNum(2, 2) ➞  true

 isSameNum(42, 32) ➞  false
 Notes
 Don't forget to return the result.*/

package Edabit_VeryEasy_Questions;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
