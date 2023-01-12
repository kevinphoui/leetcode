class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rowHeight = matrix.length - 1;
        int colWidth = matrix[0].length - 1;
        
        for (int row = 0; row <= rowHeight; row++){
            for (int col = 0; col <= colWidth; col++){
                // checks if current cell matches with top left cell
                if (row > 0 && col > 0 && matrix[row][col] != matrix[row-1][col-1]){
                    return false;
                }
            }
        }

        return true;
    }
}