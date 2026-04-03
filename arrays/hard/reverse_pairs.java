package arrays.hard;

import java.util.ArrayList;

public class reverse_pairs {
    private static void merge(int[] nums, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(nums[right]);
            right++;
        }

        // transfering all elements from temporary to nums //
        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }
    }

    private int countPairs(int [] nums,int low,int mid,int high){
        int cnt = 0;
        int right = mid+1;
        
        for(int i = low; i<=mid;i++){
            while(right<=high && (long)nums[i] > 2 * (long)nums[right]) right++;
            cnt += (right - (mid+1));

           
        }
        return cnt;
    }
    private int mergeSort(int[]nums, int low, int high){
        int cnt = 0;
        if(low>=high) return cnt ;

        int mid = (low + high)/2;
        cnt += mergeSort(nums,low,mid);
        cnt += mergeSort(nums,mid+1,high);
        cnt += countPairs(nums,low,mid,high);
        merge(nums,low,mid,high);

        return cnt;
    }

    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }

}
