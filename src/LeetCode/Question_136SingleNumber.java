package LeetCode;

import java.util.Arrays;

public class Question_136SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        Problem3 prob = new Problem3();
        int a = prob.singleNumber(nums);
        System.out.println("The Duplicates present in the array: " + a);
    }
}
class Problem3 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i = 0; i<nums.length; i++){
            res = res ^ nums[i];
        }
        return res;
    }
}