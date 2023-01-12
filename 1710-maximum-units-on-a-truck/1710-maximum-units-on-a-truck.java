class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int ans = 0;
        
        int truckSpace = 0;
        // sort array based on the highest number of units
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        
        
        // add the box with the highest number of units first
        for (int i = 0; i < boxTypes.length; i++) {
            int boxesToAdd = Math.min(boxTypes[i][0], truckSize);
            ans += boxTypes[i][1] * boxesToAdd;
            truckSize -= boxesToAdd;
            
            if (truckSize == 0) {
                break;
            }
        }
        
        return ans;
    }
}