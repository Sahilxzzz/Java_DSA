package arrays;

public class set_Zero_Matrix {
    
    public void setZeroes(int[][] matrix) {
        int i = 0;
        int j = 0;
        int n = matrix.length;
        int m = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        //Checking for zeros in firstRow
            for(j=0;j<m;j++){
                if(matrix[0][j]==0){
                   firstRowZero = true;
                   break;
                }
            }
        //Checking for zeros in firstCol
            for(i=0;i<n;i++){
                if(matrix[i][0]==0){
                   firstColZero = true;
                   break;
                }
            }

        // Marking in First row and col from checking the zeros in the matrix
        for(i=1;i<n;i++){
            for(j=1;j<m;j++){
                if (matrix[i][j]==0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        //making the rows and col zero according to the marker
         for ( i = 1; i < n; i++) {
            for (j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstRowZero){
            for(j=0;j<m;j++){
                matrix[0][j] = 0;
            }
        }
        if(firstColZero){
            for(i=0;i<n;i++){
                matrix[i][0] = 0;
            }
        }
    }

}
    
