package binary_search;

public class upper_bound {
    int upperBound(int[] arr, int target) {
        // code here
        // code here
        int n  = arr.length;
        int ans = n;
        
        int low = 0, high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            
            if(arr[mid]>target){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}
