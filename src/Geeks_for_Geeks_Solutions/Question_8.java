package Geeks_for_Geeks_Solutions;

import java.util.ArrayList;
import java.util.Collections;

/*Array Leaders
You are given an array arr of positive integers. Your task is to find all the leaders in the array. An element is considered a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader.
Examples:
Input: arr = [16, 17, 4, 3, 5, 2]
Output: [17, 5, 2]
Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.
Input: arr = [10, 4, 2, 4, 1]
Output: [10, 4, 4, 1]
Explanation: Note that both of the 4s are in output, as to be a leader an equal element is also allowed on the right. side
Input: arr = [5, 10, 20, 40]
Output: [40]
Explanation: When an array is sorted in increasing order, only the rightmost element is leader.
Input: arr = [30, 10, 10, 5]
Output: [30, 10, 10, 5]
Explanation: When an array is sorted in non-increasing order, all elements are leaders.
Constraints:
1 <= arr.size() <= 106
0 <= arr[i] <= 106

Expected Complexities
Time Complexity: O(n)
Auxiliary Space: O(1)
Company Tags
PayuAdobe*/

//        NAIVE APPROACH            TC= O(n^2)      SC= O(1)
//public class Question_8 {
//    public static void main(String[] args) {
//        int arr[] = {16, 17, 4, 3, 5, 2};
//        ArrayList<Integer> result = leaders(arr);
//        System.out.println(result);
//    }
//
//    public static ArrayList<Integer> leaders(int arr[]) {
//        ArrayList<Integer> list = new ArrayList<>();
//
//        int n = arr.length;
//
//        for (int i = 0; i < n; i++) {
//            int j;
//            for (j = i+1; j <n ; j++) {
//                if(arr[i]<arr[j])
//                    break;
//            }
//            // If no larger element was found
//            if (j == n)
//                list.add(arr[i]);
//        }return list;
//    }
//}

//       EXPECTED APPROACH      TC= O(n)   SC=O(1)

public class Question_8 {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> result = leaders(arr);
        System.out.println(result);
    }
    public static ArrayList<Integer> leaders(int arr[]){
        ArrayList<Integer> list = new ArrayList<>();

        int n = arr.length;

        /*arr[n-1] use korar karon holo je amr initial array ta 0th index theke
        * start hocchilo so eita just array r pointer ta -1 theke start korbe ebar
        * and question a bole right index ta leader so eita r ekta karon*/
        int maxRight = arr[n-1];

        /*add function ta maxright take execute korbe as a leader */
        list.add(maxRight);

        /*ebar n-2 mane holo array ta start hobe -2 index theke karon n-1 is fixed as leader
        * and 0 obdhi cholbe */
        for (int i = n-2; i >=0; i--) {
            if(arr[i]>=maxRight){
                maxRight = arr[i];
                list.add(maxRight);
            }
        }
        /*ei je Collections.reverse ache seta amr output ta just reverse korbe
        * for example:
        * [1,2,3,4]
        * [4,3,2,1] hobe*/
        Collections.reverse(list);
        return list;
    }
}
