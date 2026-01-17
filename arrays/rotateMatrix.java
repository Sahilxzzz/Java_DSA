 package arrays;

 public class rotateMatrix {
    
//     public void rotate(int[][] matrix) {
//         int n = matrix.length;

//         int[][] rotMatrix = new int[n][n];

//         // create rotated matrix
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 rotMatrix[j][n - i - 1] = matrix[i][j];
//             }
//         }

//         // copy back to original matrix
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 matrix[i][j] = rotMatrix[i][j];
//             }
//         }
//     }

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0; i<n-1;i++){
            for(int j = i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
       
       for(int i=0;i<n;i++){
        int left = 0, right = n-1;
        while(left<right){
            int temp = matrix[i][left];
            matrix[i][left] = matrix[i][right];
            matrix[i][right] = temp; 
            left++;
            right--;
        }
       }
    }
}

 