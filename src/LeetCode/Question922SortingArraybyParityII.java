package LeetCode;

import java.util.Arrays;

public class Question922SortingArraybyParityII {
    public static void main(String[] args) {
        //int[] nums = {5, 6, 3, 8, 9};
        int[] nums ={4, 2, 5, 7};
        Problem2 prob = new Problem2();
        int[] k = prob.sortArrayByParityII(nums);
        System.out.println("sorted the even and odd: " + Arrays.toString(k));
    }
}
class Problem2 {
    public int[] sortArrayByParityII(int[] nums) {
        int evenIndex = 0;
        int oddIndex = 1;

        while(evenIndex < nums.length && oddIndex < nums.length){
            while ( evenIndex < nums.length && nums[evenIndex] % 2 == 0){
                evenIndex += 2;
            }
            while(oddIndex < nums.length && nums[oddIndex] % 2 == 1){
                oddIndex += 2;
            }
            if (evenIndex < nums.length && oddIndex < nums.length){
                int temp = nums[evenIndex];
                nums[evenIndex] = nums[oddIndex];
                nums[oddIndex] = temp;
            }
        }
        return nums;
    }
}