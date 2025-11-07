package LeetCode;

import java.util.Arrays;

public class Question905SortArraybyParity {
    public static void main(String[] args) {
//    Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
//
//    Return any array that satisfies this condition.
//    Example 1:
//    Input: nums = [3,1,2,4]
//    Output: [2,4,3,1]
//    Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
        int[] nums = {3, 1, 2, 4};
        Problem1 sol  = new Problem1();
        int[] k = sol.sortArrayByParity(nums);
        System.out.println("sorted the even numbers in the beginning of the array:" + Arrays.toString(k));
    }
}
class Problem1 {
        public int[] sortArrayByParity(int[] nums) {
            int i = 0;
            int  j = nums.length - 1;
            while (i < j){
                if(nums[i] % 2 == 0){
                    i++;
                }else{
                    //swaping the odd numbers
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j--;
                }
            }
            return nums;
        }
    }