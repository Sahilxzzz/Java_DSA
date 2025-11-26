package arrays;
import java.util.*;

public class missing_no{
    static int missingno(int n , int arr[]){
        int hash [] = new int[n+1];
        for (int i = 0;i<n-1;i++){
            hash[arr[i]] =1;
        }
        for (int i=1;i<=n;i++){
            if(hash[i] == 0)
            return i;
        }
        return -1 ;
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