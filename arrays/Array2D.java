package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array2d {
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int [][] arr = new int[3][3];
    System.out.println("Enter the elements of the 2D array: ");
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            arr[i][j] = sc.nextInt();
        }
    }

    for (int [] row : arr) {
        System.out.println(Arrays.toString(row));
        }System.out.println();
   } 
}
