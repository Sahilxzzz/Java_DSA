package arrays;

public class sort_0s1s2s {
/*    public void sortColors(int[] nums) {
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
    } */

    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0, mid=0, high = n-1;

        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid]= nums[low];
                nums[low] = temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else {
                int temp = nums[mid];
                nums[mid]= nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}

