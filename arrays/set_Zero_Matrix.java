package arrays;

public class set_Zero_Matrix {
    
    public void setZeroes(int[][] matrix) {
        int i = 0;
        int j = 0;
        int n = matrix.length;
        int m = matrix[0].length;

        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(matrix[i][j]==0){
                    markRow(matrix,i,n,m);
                    markCol(matrix,j,n,m);
                }
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(matrix[i][j]==-1){
                   matrix[i][j] = 0;
                }
            }
        }

    }
    private void markRow(int[][]matrix,int i,int n, int m){
        for(int j =0;j<m;j++){
            if(matrix[i][j]!=0){
                matrix[i][j] = -1;
            }
        }
    }
    private void markCol(int [][]matrix ,int j,int n, int m){
        for(int i=0;i<n;i++){
            if(matrix[i][j]!=0){
                matrix[i][j] = -1;
            }
        }
    }

}
