package arrays;

import java.util.*;
class longestSubarray {

    static int longestSubarray(int[]a,int n,int k){
        int maxLen = 0;
        int sum = 0;
        
        Map<Integer, Integer> presumMap = new HashMap<>();
        
        for(int i = 0; i<n;i++){
            sum += a[i];
            
            if(sum == k){
                maxLen = i+1;
            }
            
            int rem = sum - k ; 
            if(presumMap.containsKey(rem)){
                int len = i - presumMap.get(rem);
                maxLen = Math.max(maxLen,len);
            }
            if(!presumMap.containsKey(sum)){
                presumMap.put(sum,i);
            }
            
        }
        return maxLen;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
    int [] a = {1,2,3,1,1,1,4,2,3};
    int n = a.length;
    int k = 3;
    
    int len = longestSubarray(a,n,k);
        
        System.out.println(len);
    }
}
