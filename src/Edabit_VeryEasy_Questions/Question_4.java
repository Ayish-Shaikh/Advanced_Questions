/**Upvotes vs Downvotes
 Given an object containing counts of both upvotes and downvotes, return what vote count should be displayed. This is calculated by subtracting the number of downvotes from upvotes.

 Examples
 getVoteCount({ upvotes: 13, downvotes: 0 }) ➞ 13

 getVoteCount({ upvotes: 2, downvotes: 33 }) ➞ -31

 getVoteCount({ upvotes: 132, downvotes: 132 }) ➞ 0
 Notes
 You can expect only positive integers for vote counts.*/

package Edabit_VeryEasy_Questions;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Upvotes : ");
        int a = sc.nextInt();

        System.out.println("Enter the Downvotes : ");
        int b = sc.nextInt();

        if (a>b){
            System.out.println("This person is doing great and having upvote");
        }
        else{
            System.out.println("This person is not that great and not having potential");
        }int getCount = a-b;
        System.out.println(getCount);
    }
}
