package Geeks_for_Geeks_Solutions;

import java.util.Scanner;

/*Given a number, represents number of apples in a bag. You and your friend are playing a game. Both of you are picking one apple turn wise from the bag. It is given that first attempt is always by you. The person picking the last apple will be the winner. Find out the winner if the quantity of apples is given to you as a number.
If you will win: return "You" (without quotes)
If your friend will win: return "Friend" (without quotes)

Examples:

Input: n = 9
Output: You
Input: n = 4
Output: Friend
Constraints:
 1 <= n <= 100*/
public class Question_6 {
    public static void main(String[] args) {
        System.out.println("Enter the number of apples : " + utility(9));

    }

    public static String utility(int n) {
        if(n%2==0){
            return "Friend";
        }
        else {
            return "You";
        }
    }
}
