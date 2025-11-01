package Geeks_for_Geeks_Solutions;

import java.util.ArrayList;
import java.util.Arrays;

/*Given an array arr[] of size n, containing elements from the range 1 to n, and each element appears at most twice, return an array of all the integers that appears twice.
Note: You can return the elements in any order but the driver code will print them in sorted order.

Examples:
Input: arr[] = [2, 3, 1, 2, 3]
Output: [2, 3]
Explanation: 2 and 3 occur more than once in the given array.
Input: arr[] = [3, 1, 2]
Output: []
Explanation: There is no repeating element in the array, so the output is empty.
Constraints:
1 ≤ n ≤ 106
1 ≤ arr[i] ≤ n*/
public class Question_9 {
    public static void main(String[] args) {
        int arr[] = {2,3,1,2,3};
        ArrayList<Integer> result = findDuplicates(arr);
        System.out.println(result);
    }
    public static ArrayList<Integer> findDuplicates(int arr[]){
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i-1]){
                list.add(arr[i]);
            }

        }return list;
    }
}
