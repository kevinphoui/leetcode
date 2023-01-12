class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        
        // edge case
        if (n == 0){
            return ans;
        }
        
        int rowBegin = 0;   // starting position for going vertical
        int rowEnd = n-1;   // ending point for row
        int colBegin = 0;   // starting position for going horizontal
        int colEnd = n-1;   // ending point for col
        int val = 1; // start at 1, value to be entered into matrix
        
        // while row & col does not go out of bounds
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // traverse right
            for (int i = colBegin; i <= colEnd; i++){
                System.out.println(val);
                ans[rowBegin][i] = val++; // change
            }
            
            // traverse down
            rowBegin++; // increment row down
            for (int i = rowBegin; i <= rowEnd; i++) {
                System.out.println(val);
                ans[i][colEnd] = val++; // change
            }
            
            // traverse left
            colEnd--;   // move col left one, decrement col position
            for (int i = colEnd; i >= colBegin; i--) {
                if (rowBegin <= rowEnd) {
                    System.out.println(val);
                    ans[rowEnd][i] = val++; // change
                }
            }
            
            
            // traverse up
            rowEnd--;   // reduce row stopping point by 1
            for (int i = rowEnd; i >= rowBegin; i--) {
                if (colBegin <= colEnd) {
                    System.out.println(val);
                    ans[i][colBegin] = val++; // change
                }
            }
            
            colBegin++; // move col starting point right 1
            
        }
        return ans;
    }
}