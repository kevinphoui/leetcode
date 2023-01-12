class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[] lowestIndex = new int[points.length];
        int[][] ans = new int[k][2];
        
        // iterate through points to calculate the origin distance
        for (int i = 0; i < points.length; i++) {
            lowestIndex[i] = origin(points[i]);
        }
        Arrays.sort(lowestIndex);   // sort array so we can get k lowest arrays
        //System.out.println(Arrays.toString(lowestIndex));
        
        // re-iterate through points, and find the matching arrays to return
        int numReq = lowestIndex[k - 1]; // if any number is equal or smaller than this, than it is something we want to return
        int ansIndex = 0;
        for (int i = 0; i < points.length && ansIndex < k; i++) {
            if (origin(points[i]) <= numReq) {
                ans[ansIndex++] = points[i];
            }
        }
        
        return ans;
    }
    
    public int origin(int[] points){
        return points[0] * points[0] + points[1] * points[1];
    }
}