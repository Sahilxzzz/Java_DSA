package arrays;

class maximumConsOnes{
     public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int cout = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cout++;
                max = Math.max(max, cout);
            }
            else {
                cout = 0;
            }
        }
        return max;
    }
}