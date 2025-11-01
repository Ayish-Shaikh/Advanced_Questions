package Geeks_for_Geeks_Solutions;
import java.io.PrintStream;
import java.util.*;

/**Given two numbers a and b; you need to perform basic mathematical operation on them. You will be provided an integer named as operator.
 If operator equals to 1 add a and b, then print the result as a string.
 If operator equals to 2 subtract b from a, then print the result as a string.
 If operator equals to 3 multiply a and b, then print the result as a string.
 If operator equals to any another number, print "Invalid Input"(without quotes).
 Note: Do not add a new line at the end

 Examples:

 Input: a = 1, b = 2, opr = 3
 Output: 2
 Explanation: 1 * 2 = 2
 Input: a = 2, b = 2, opr = 2
 Output: 0
 Explanation: 2 - 2 = 0*/
public class Question_2 {
    public static void main(String[] args) {
        System.out.println(Calculator(1,2,3));
        System.out.println(Calculator(7,3,1));
        System.out.println(Calculator(9,13,2));
        System.out.println(Calculator(6,3,4));
    }

    public static String Calculator(int a, int b, int opr) {
        switch(opr){
            case 1:
                return String.valueOf(a + b );

            case 2:
                return String.valueOf(b - a);

            case 3:
                return String.valueOf(a * b);

            case 4:
                return String.valueOf(a/b);

            default:
                return "Invalid Input";
        }
    }
}
