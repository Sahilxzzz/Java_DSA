package arrays;

public class maxi_subarray_sum {
    
    public int maxSubArray(int[] nums) {
        /* Kadanes algo TC = On2 , Runtime = 1ms
        int n = nums.length;
        long sum = 0;
        long maxi = Long.MIN_VALUE;

        for(int i=0;i<n;i++){
           sum += nums[i];

           if(sum > maxi) maxi = sum;
           if(sum < 0) sum = 0;
        }
        return (int) maxi; */   

        int sum = 0;
        int maxi = nums[0];
        if(nums.length== 0) return 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            maxi = sum > maxi ? sum : maxi ;

            if(sum < 0 ) sum = 0;
        }
        return maxi ; 
        
        }
}

