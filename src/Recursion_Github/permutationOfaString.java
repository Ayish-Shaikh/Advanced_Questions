package Recursion_Github;

import java.util.ArrayList;

public class permutationOfaString {
    public static void permutation(int[] nums, ArrayList<Integer> dabba, boolean[] track){
        if (dabba.size() == nums.length){
            System.out.println(dabba);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(!track[i]){
                dabba.add(nums[i]);
                track[i] = true;
                permutation(nums, dabba, track);
                dabba.remove(dabba.size()-1);
                track[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3};
        boolean [] track = new boolean[3];
        ArrayList<Integer> dabba = new ArrayList<>();
        permutation(nums, dabba, track);
    }
}
