package Edabit_VeryEasy_Questions;
import java.util.Arrays;
import java.util.Scanner;

/**Pair Management
 Given two arguments, return an array which contains these two arguments.

 Examples
 makePair(1, 2) ➞ [1, 2]

 makePair(51, 21) ➞ [51, 21]

 makePair(512124, 215) ➞ [512124, 215]*/
public class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = {a,b};
        System.out.println(Arrays.toString(arr));
    }
}
