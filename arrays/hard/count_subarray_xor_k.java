package arrays.hard;
import java.util.*;

import arrays.hard.four_sum.Solution;

public class count_subarray_xor_k {
    public int countSubarraysXOR(int []arr,int B){        
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
             int xorVal = 0;
            for(int j=i;j<n;j++){
               
                    xorVal ^= arr[j]; 
                   
                }
                 if(xorVal == B){
                    count ++ ;
                }
                
            }
        

        return count;

    }
    public static void main(String[] args) {
        // Input array
        int[] arr = {4, 2, 2, 6, 4};
        // Target xor
        int B = 6;
        count_subarray_xor_k sol = new count_subarray_xor_k();
       // Solution sol = new Solution();
        System.out.println(sol.countSubarraysXOR(arr, B));
    }
}