package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class Question1TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        Problem sol = new Problem();
        int[] k = sol.twoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(k));
    }
}

//Brute Force approach
class Problem {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = target - nums[i];
            if (map.containsKey(current)) {
                res[0] = map.get(current);
                res[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}