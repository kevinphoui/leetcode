class Solution {
    public int[] getConcatenation(int[] nums) {
        int newNums[] = new int[2*nums.length];
        // create an array of 2n
        for (int i = 0; i < newNums.length; i++){
            newNums[i] = nums[(i % nums.length)];
        }
        return newNums;
    }
}