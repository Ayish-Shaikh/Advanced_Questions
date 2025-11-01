package Recursion_Github;
/*
Given is the code to print the sum of numbers from 1 to n in increasing order recursively.
Input Format :
Integer n
Output Format :
Numbers from 1 to n (separated by space)

Constraints :
1 <= n <= 10000

Sample Input 1 :
 6
Sample Output 1 :
1+2+3+4+5+6 = 21

Sample Input 2 :
 4
Sample Output 2 :
1+2+3+4= 10
*/

public class Question_2 {
    public static void main(String[] args) {
        System.out.println(SumOfNNaturalNumbers(4));
    }
    public static int SumOfNNaturalNumbers(int n) {
        if (n == 1){
            return 1;
        }
        return n+SumOfNNaturalNumbers(n-1);
    }
}
