package Edabit_VeryEasy_Questions;

import java.util.Scanner;

/**A Day at the Market
Backpack Bill and Wallet Will set off for the annual festival. As they approach the stalls, Bill retorts that he'll be able to bring home more stuff than Will. Taking this as a challenge, Will refutes and a competition spurs into action.

Backpack Bill has an infinite inventory space, but a limited number of coins.
Wallet Will has an infinite number of coins, but a limited inventory space.
Create a function that returns the name of the man who can bring home the most items. The parameters are given as follows:

Bill's amount of money.
Will's amount of inventory space.
The item's price.
The item's size.
Examples
whoWinsTonight(40, 95, 5, 10) ➞ "Will"
// The item costs 5 coins and takes up 10 inventory spaces.
// Bill can only buy a maximum of 8 items (40 coins DIV 5 = 8).
// Will can only bring home a maximum of 9 items. (95 inventory spaces DIV 10 = 9).
// Will is the winner.

whoWinsTonight(20, 20, 5, 10) ➞ "Bill"

whoWinsTonight(10, 2, 20, 1) ➞ "Will"

whoWinsTonight(3, 7, 2, 5) ➞ "Tie"
Notes
DIV means a floored division. That means you round down after dividing.
        Return "Tie" if both men can afford the same amount of stuff.
All numbers will be positive integers.*/
public class Question_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Amount of Bill : ");
        int Bill = sc.nextInt();

        System.out.println("Enter the Inventory Space of Will : ");
        int Will = sc.nextInt();

        System.out.println("Enter the Price of the item : ");
        int Price = sc.nextInt();

        System.out.println("Enter the Size of the item : ");
        int Size = sc.nextInt();

        int CalculateBill = Bill / Price;
        int CalculateWill = Will / Size;

        if (CalculateBill == CalculateWill){
            System.out.println("it is a tie");
        }
        System.out.println("The Bill calculated is : " + CalculateBill);
        System.out.println("The Will measured is  : " + CalculateWill);
    }
}
