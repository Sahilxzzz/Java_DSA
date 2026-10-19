package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = sc.nextInt();

            int[][] arr = new int[rows][cols];
            System.out.println("Enter the elements of the 2D array: ");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            System.out.println("The 2D array is:");
            for (int[] row : arr) {
                System.out.println(Arrays.toString(row));
            }
        }
    }
}
