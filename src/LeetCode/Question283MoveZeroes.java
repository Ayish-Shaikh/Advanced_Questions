package LeetCode;

public class Question283MoveZeroes {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        int[] nums = {0, 1, 0, 3, 12};
//        int[] nums = {0};

        solution.moveZeroes(nums);

        System.out.print("Array after moving zeroes: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
class Solution1 {
    public void moveZeroes(int[] nums) {

        int k = 0;

        for(int i =0; i< nums.length;i++){
            if( nums[i] !=0){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
        }
    }
}