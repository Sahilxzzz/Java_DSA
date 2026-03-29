package arrays;

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int [] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int count = 0;
        int totalPrice = 0;
        int avg = 0;
        
        for(int i=0;i<n;i++){
         if(arr[i]%2 != 0){
             totalPrice += arr[i];
             count++;
        }
    }
    
    avg = totalPrice/count;
    
    System.out.println(totalPrice + " " + count + " " + avg);
}
}