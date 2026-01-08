package arrays;

import java.util.HashMap;
import java.util.Map;

public class majority_element {
    //This is brute force approach
   /*  public int majorityElement(int[] nums) {
        int n = nums.length;

        for(int i = 0;i<n;i++){
            int cnt = 0;
            for(int j=0; j<n; j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
            if(cnt > n/2) return nums[i];
        }
        return -1; */

    //This is better approach using HashMap    
    /* public int majorityElement(int[] nums) {
        int n = nums.length;

        HashMap <Integer,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++){
            int num = nums[i];
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > n/2){
                return entry.getKey() ;
            }
        }
        return -1;
    } */
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int el = 0;

        for(int i = 0; i<n;i++){
            if(cnt==0){
                cnt = 1 ;
                el = nums[i];
            }
            else if (nums[i] == el)
            cnt++;
            else{
                cnt--;
            }
        }
        int cnt1 = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == el) cnt1++;
        }
        if(cnt1 > n/2) return el; 
        return -1;
    }
}
