package arrays;
import java.util.*;

public class missing_no{
    static int missingno(int n , int arr[]){
        int i , j;
        
        for(i=1;i<=n;i++){
            int flag = 0;
            for(j=0;j<n-1;j++){
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
            return i;
        }
        return i;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
    
        int n  = sc.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int ans = missingno(n,arr);
        System.out.println(ans);
    }
}