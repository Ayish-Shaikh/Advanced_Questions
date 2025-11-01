package Geeks_for_Geeks_Solutions;

import java.util.Scanner;

/**Given an array arr[] containing the prices of items, your task is to calculate the average of all prices, rounded to two decimal places.
Note:  Return the average of all the items as a String.

Examples:

Input: arr[] = [1, 2, 3, 4, 5]
Output: 3.00
Explanation: Sum of the array is 15, hence average is 15/5=3.00.
Input: arr[] = [2, 55, 85, 656, 52, 554, 545, 5, 2]
Output: 217.33
Explanation: Sum of the array is 1956, hence average is 1956/9= 217.33.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
        1<=arr.size()<=100
        1<=arr[i]<=1000*/
public class Question_4 {
    public static void main(String[] args) {
        int[] n = {32,434,34,53,1};
        System.out.println(Average(n));
    }

    public static String Average(int arr[]) {
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }

        double avg = (double) sum/n;
        return String.format("%.2f",avg);
    }
}
