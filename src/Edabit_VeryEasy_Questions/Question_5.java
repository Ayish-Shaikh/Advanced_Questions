package Edabit_VeryEasy_Questions;

import java.util.Scanner;

/**The Farm Problem
 In this challenge, a farmer is asking you to tell him how many legs can be counted among all his animals. The farmer breeds three species:

 chickens = 2 legs
 cows = 4 legs
 pigs = 4 legs
 The farmer has counted his animals and he gives you a subtotal for each species. You have to implement a function that returns the total number of legs of all the animals.

 Examples
 animals(2, 3, 5) ➞ 36

 animals(1, 2, 3) ➞ 22

 animals(5, 2, 8) ➞ 50
 Notes
 Don't forget to return the result.
 The order of animals passed is animals(chickens, cows, pigs).
 Remember that the farmer wants to know the total number of legs and not the total number of animals.*/

public class Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Total numbers of the Chicken :");
        int Chicken = sc.nextInt();

        System.out.println("Enter the Total numbers of the Cows :");
        int Cows = sc.nextInt();

        System.out.println("Enter the Total numbers of the Pigs :");
        int Pigs = sc.nextInt();

        int getAnimal = Chicken * 2 +Cows * 4 +Pigs * 4;
        System.out.println(getAnimal);
    }
}
