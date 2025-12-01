package arrays;

public class sort_0s1s2s {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int cout0 = 0, cout1=0,cout2=0;
        int i;
        for(i=0;i<n;i++){
            if(nums[i]==0)cout0++;
            else if (nums[i]==1)cout1++;
            else cout2++;
        }
        for(i=0;i<cout0;i++) nums[i]=0;
        for(i=cout0;i<cout0+cout1;i++) nums[i]=1;
        for(i=cout0+cout1;i<n;i++) nums[i]=2;
    }
}
