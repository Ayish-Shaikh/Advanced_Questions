package Edabit_VeryEasy_Questions;
import java.util.Scanner;

/**I'd Like A New Shade Of Blue, Please
 I have a bucket containing an amount of navy blue paint and I'd like to paint as many walls as possible. Create a function that returns the number of complete walls that I can paint, before I need to head to the shops to buy more.

 n is the number of square meters I can paint.
 w and h are the widths and heights of a single wall in meters.
 Examples
 howManyWalls(54, 1, 43) ➞ 1

 howManyWalls(46, 5, 4) ➞ 2

 howManyWalls(100, 4, 5) ➞ 5

 howManyWalls(10, 15, 12) ➞ 0

 howManyWalls(41, 3, 6) ➞ 2
 Notes
 Don't count a wall if I don't manage to finish painting all of it before I run out of paint.
 All walls will have the same dimensions.
 All numbers will be positive integers.*/
public class Question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of the square meters , width and height :");

        int n = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int WallArea = w * h ;
        int LeftOverPaint = n/WallArea;
        System.out.println("The leftover walls " + LeftOverPaint );
    }
}
