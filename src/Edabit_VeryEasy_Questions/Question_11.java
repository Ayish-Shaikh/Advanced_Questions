package Edabit_VeryEasy_Questions;

import java.util.Scanner;

/**Broken Bridge
 Create a function which validates whether a bridge is safe to walk on (i.e. has no gaps in it to fall through).

 Examples
 isSafeBridge("####") ➞ true

 isSafeBridge("## ####") ➞ false

 isSafeBridge("#") ➞ true

 isSafeBridge("### ####") ➞ false

 isSafeBridge("#####") ➞ true
 Notes
 You can expect the bridge's ends are connected to its surrounding.*/
public class Question_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bridge length :");

        String bridge = sc.nextLine();

        boolean isSafe = !bridge.contains(" ");

        System.out.println(isSafe);
     }
}

