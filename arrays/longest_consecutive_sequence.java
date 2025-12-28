package arrays;

import java.util.*;
class longest_consecutive_sequence {
    private boolean linearSearch(int[]arr, int num){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
    public int longestConsecSeq(int []arr){
        int n = arr.length;
        int longest = 1;
        for(int i=0;i<n;i++){
            int x = arr[i];
            int cnt = 1;
            while(linearSearch(arr,x+1) == true){
                x += 1;
                cnt +=1;
            }
           longest = Math.max(longest,cnt); 
        }
        return longest;
    };   


    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
     
        int [] arr = {100,4,102,101,2,3,1};

        longest_consecutive_sequence solution = new longest_consecutive_sequence();
        int ans = solution.longestConsecSeq(arr);
        
        System.out.println(ans);
    }
}
