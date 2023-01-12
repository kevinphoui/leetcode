class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        // algorithm
        // 1) initialize a result array that we will eventually return
        // 2) We would have an outer loop that will go over each of the diagonals one by one. As mentioned before,
        //      the elements in the first row and alst column would actually be the heads of their corresponding diagonaals
        // 3) We then have an innter while-loop that iterates over all the elements in the diagonal.
        //      We can calculate the number of elements in the curresponding diagonal by doing some math but we can
        //      simply iterate until one of the indices goes out of bounds
        // 4) For each diagonal we will need a new list or dynamic array-like data structure since we don't know what size 
        //      to allocate. Again, we can do some math and calcualte the size of that particular diagonal and allocate memory; 
        //      but it's not necessary for this explaination.
        // 5) For odd numbered diagonals, we simply need to add the elements in our intermediary array, in reverse order
        //      to the final result array
        
        
        
        // Check for empty matrices
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        
        // Variables to track the size of the matrix
        int N = matrix.length;
        int M = matrix[0].length;
        
        // The two arrays as explained in the algorithm
        int[] result = new int[N*M];
        int k = 0;
        ArrayList<Integer> intermediate = new ArrayList<Integer>();
        
        // We have to go over all the elements in the first row
        // and the last column to cover all possible diagonals
        for (int d = 0; d < N + M - 1; d++){
            
            // clear the intermediate array every time we start to process another diagonal
            intermediate.clear();
            
            // we need to figure out the "head" of this diagonal
            // The elements in the first row and the last column are the respective heads
            // if d < M, then r = 0, else r = d - M + 1
            int r = d < M ?  0 : d - M  + 1;
            // if d < M, then c = d, else c = M - 1
            int c = d < M ? d : M - 1;
            
            // iterate until one of the indices goes out of scope
            // take note of the index math to go down the diagonal
            while (r < N && c > -1) {
                intermediate.add(matrix[r][c]);
                ++r;
                --c;
            }
            
            // Reverse even numbered diagonals. The article says we have to reverse odd numbered articles but here,
            // the numbering is starting from 0
            if (d % 2 == 0) {
                Collections.reverse(intermediate);
            }
            
            for (int i = 0; i < intermediate.size(); i++) {
                result[k++] = intermediate.get(i);
            }
        }
        return result;
    }
}