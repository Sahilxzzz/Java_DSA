package arrays.hard;
import java.util.*;

public class maximum_product_subarray {
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        
        
        int maxProd = nums[0];
        int pref = 1, suff = 1;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
           if(pref==0)pref = 1;
           if(suff == 0)suff = 1;
           pref *= nums[i];
           suff *= nums[n - i - 1];

           max = Math.max(max,Math.max(pref,suff));
           
        }

        
        maxProd = Math.max(maxProd,max);
        return maxProd;
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

            int nums[] = {1,2,-3,0,-4,-5};
            
            int maxProd = maxProduct(nums);

            System.out.println(maxProd);
    }
}
