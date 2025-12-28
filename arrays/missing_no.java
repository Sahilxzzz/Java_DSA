package arrays;

class missingNumber {
    public int missingNumber(int[] nums) {
        int i;
        int n = nums.length;
        int sum1 = n*(n+1)/2;
        int sum2 = 0;
        for(i=0;i<n;i++){
           sum2 += nums[i];
        }
        return (sum1-sum2);
    }
}