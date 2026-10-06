class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int r = 0; r < rows; r++) {
            int minCol = 0;

            // Find the minimum value in this row.
            for (int c = 1; c < cols; c++) {
                if (matrix[r][c] < matrix[r][minCol]) {
                    minCol = c;
                }
            }

            // Check whether it is the maximum in its column.
            boolean isColumnMaximum = true;
            for (int i = 0; i < rows; i++) {
                if (matrix[i][minCol] > matrix[r][minCol]) {
                    isColumnMaximum = false;
                    break;
                }
            }

            if (isColumnMaximum) {
                result.add(matrix[r][minCol]);
            }
        }

        return result;
    }
}
