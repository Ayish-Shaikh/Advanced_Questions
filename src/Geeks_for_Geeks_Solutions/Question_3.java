package Geeks_for_Geeks_Solutions;

import java.util.Scanner;

/**You are given a number  and you have to print your answer according to the following:
 If the number is divisible by 3, you print "Fizz" (without quotes)
 If the number is divisible by 5, you print "Buzz" (without quotes)
 If the number is divisible by both 3 and 5, you print "FizzBuzz" (without quotes)
 In any other case, you print the number itself

 Note: You should add a newline character after print() statement.

 Examples:
 Input: number = 3
 Output: Fizz
 Explanation: Here, the number is divisible by 3, so Fizz is printed.
 Input: number = 5
 Output: Buzz
 Explanation: Here the number is divisible by 5, so Buzz is printed.
 Input: number = 15
 Output: FizzBuzz
 Explanation: Here, the number 15 is divisible by both 3 and 5, so FizzBuzz is printed.
 Constraints:

 1 <= number <= 100
 Expected Complexities
 Time Complexity: O(1)
 Auxiliary Space: O(1)*/
public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  : ");
        int n = sc.nextInt();

        if (n%3==0 && n%5==0){
            System.out.println("no. is divisible by both ");
        }
        else if (n%3 == 0 ){
            System.out.println("no. divisible by 3 ");
        } else if (n%5==0) {
            System.out.println("no. divisible by 5 ");
        }else{
            System.out.println("invalid no. ");
        }
    }
}

