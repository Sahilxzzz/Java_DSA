package strings ;

import java.util.Scanner;

public class string_1{
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String arr[] = new String[size];
        int totLength = 0;

        for (int i = 0; i<size;i++){
            arr[i] = sc.next();
            totLength += arr[i].length();
        }

        System.out.println(totLength);
    }
}