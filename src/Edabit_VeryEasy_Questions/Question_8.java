package Edabit_VeryEasy_Questions;
import java.util.Scanner;
/**Number of Stickers
 Given a Rubik's Cube with a side length of n, return the number of individual stickers that are needed to cover the whole cube.
 Pictures of Rubik's Cubes
 The Rubik's cube of side length 1 has 6 stickers.
 The Rubik's cube of side length 2 has 24 stickers.
 The Rubik's cube of side length 3 has 54 stickers.
 Examples
 howManyStickers(1) ➞ 6
 howManyStickers(2) ➞ 24
 howManyStickers(3) ➞ 54
 Notes
 Keep in mind there are 6 faces to keep track of.
 Expect only positive whole numbers.*/
public class Question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of the rubiks cube");

        int a = sc.nextInt();
        System.out.println(a*a*6);
    }
}
