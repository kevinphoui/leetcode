class Solution {
    public void rotate(int[][] matrix) {
        int[][] temp = new int[matrix.length][matrix.length];
        
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                temp[i][matrix.length- j - 1] = matrix[j][i];
            }
        }
        
        // deep copy new image to current image
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                matrix[i][j] = temp[i][j];
            }
        }
    }
}