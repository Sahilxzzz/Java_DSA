package arrays;

import java.util.HashMap;

public class two_sum {
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap <Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            int current = nums[i];
            int complement = target-nums[i];

            if(map.containsKey(complement)){
                return new int[]{i, map.get(complement)};     
            }
            map.put(nums[i], i);
        }     
        return new int[]{}; 
    }
}

}
