class Solution {
    public void rotate(int[][] matrix) {
    //     int row=matrix.length;
    //     int col=matrix[0].length;
    //      int r=0;
    //    int c=0;                                
                                                //THIS WORK IF COPIED INTO OTHER
                                                 //2D ARRAY BUT HERE WE NEED TO DO INPLACE CHANGE
    //     for(int j=0;j<col;j++){
    //         c=0;
    //         for(int i=row-1;i>=0;i--){
    //            matrix[r][c]=matrix[i][j];
    //            c++;
    //         }
    //         r++;
    //     }

        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }

        
    }
}