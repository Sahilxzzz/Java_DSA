package binary_search;

class Solution {
    public int[] searchRange(int[] arr, int target) {
        int n =arr.length;
       int l=0,h=n-1;
       int p1=-1,p2=-1;
       while(l<=h)
       {
        int mid = l+(h-l)/2;
        if(arr[mid] > target)
        h=mid-1;
        else if(arr[mid] < target)
        l=mid+1;
        else
        {
            p1=mid;
            h=mid-1;
        }
       }
       int x=0,y=n-1,mid1;
       while(x<=y)
       {
        mid1 = (x+y)/2;
        if(arr[mid1] > target)
        y = mid1-1;
        else if(arr[mid1] < target)
        x=mid1+1;
        else {
            p2=mid1;
            x=mid1+1;
        }
       }
       return new int[]{p1,p2};
    }
} 
