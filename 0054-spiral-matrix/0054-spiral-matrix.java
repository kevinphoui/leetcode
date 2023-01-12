class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        int up = 0;
        int left = 0;
        int right = columns - 1;
        int down = rows - 1;
        
        while (ans.size() < rows * columns) {
            // traverse right
            for (int col = left; col <= right; col++){
                ans.add(matrix[up][col]);
            }
            
            // traverse down
            for (int row = up + 1; row <= down; row++){
                ans.add(matrix[row][right]);
            }
            
            // make sure we are on different rows
            if (up != down){
                // traverse left
                for (int col = right - 1; col >= left; col--){
                    ans.add(matrix[down][col]);
                }
            }
            
            // make sure we are on differnt col
            if (left != right){
                // traverse up
                for (int row = down - 1; row > up; row--){
                    ans.add(matrix[row][left]);
                }
            }
            
            left++;
            right--;
            up++;
            down--;
        }
        
        return ans;
    }
}