import java.util.*;

public class longest_subarry_with_sum_zero {
    public static int longestSubarrayWithSumZero(int[]arr,int n){
        int maxLength = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            sum += arr[i];

            if(sum == 0){
                maxLength = i+1;
            }
            else{
                if(map.get(sum) != null){
                    maxLength = Math.max(maxLength, i - map.get(sum));
                }
                else{
                    map.put(sum, i);
                }
            }
        }
        return maxLength;   
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = {1,-1,3,2,-2,-8,1,7,10,23};
        int n = arr.length;
        int maxLength = longestSubarrayWithSumZero(arr, n);
        System.out.println(maxLength);
    }
}
