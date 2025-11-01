package Geeks_for_Geeks_Solutions;

import java.util.Scanner;

/**A prime number is a number that is divisible by 1 and itself only.

 Examples:
 Input: n = 17
 Output: True
 Explanation: 17 is  divisible by only 1 and 17. So it's a prime number.
 Input: n = 56
 Output: False
 Explanation: 56 is divisible by 2, 4, 7.....etc. So its not a prime number.

 Contraints:
 1 <= n <= 104*/
public class Question_1 {
    public static void main(String[] args) {
        System.out.println(Prime(17));
        System.out.println(Prime(56));
        System.out.println(Prime(2));

    }

    public static boolean Prime(int n) {
        if (n<=1){
            return false;
        }
        for (int i = 2; i < n ; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
