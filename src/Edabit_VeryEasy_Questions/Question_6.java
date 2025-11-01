package Edabit_VeryEasy_Questions;
import java.util.Scanner;

/**Integer in Range?
 Write a function that validates whether a number n is within the lower and upper bounds. Return true if so, false otherwise.

 Examples
 intWithinBounds(3, 1, 9) ➞ true

 intWithinBounds(6, 1, 6) ➞ false

 intWithinBounds(3, 3, 8) ➞ true
 Notes
 The term "within bounds" means, that, a number is considered greater than or equal to the lower bound but lesser than the upper bound, (see example #2).
 Bounds will always be given as integers.*/

public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Get the Bounds :");

        int UpperBound = sc.nextInt();
        int LowerBound = sc.nextInt();
        int n = sc.nextInt();

        if(n < UpperBound){
            System.out.println(true);
        }if ( n >= LowerBound){
            System.out.println(false);
        }
        System.out.println(n+"is the upper bound");
    }
}
