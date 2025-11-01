package LeetCode;

public class Question26RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4}; // sample input
        Solution sol = new Solution();
        int k = sol.removeDuplicates(nums); // call method

        System.out.println("Unique element count: " + k);
        System.out.print("Array after removing duplicates: ");

        // print only first k elements (unique ones)
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
class Solution {
    public static int removeDuplicates(int[] nums) {

        if(nums.length == 0){ return 0 ; }

        int k = 1;

        for (int i =1; i< nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}