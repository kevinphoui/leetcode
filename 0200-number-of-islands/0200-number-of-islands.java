class Solution {
    
    void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;
        
        // if no islands, end
        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
            return;
        }
        
        // set island to zero so we don't double count it
        grid[r][c] = '0';
        // check for nearby islands
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
        
    }
    

    
    public int numIslands(char[][] grid) {
        // edge case
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;
        
        // iterate through each element
        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                if (grid[r][c] == '1') {
                    ++num_islands;
                    dfs(grid, r, c);
                }
            }
        }      
        
        return num_islands;
    }
}