class Solution {
    public int[] getConcatenation(int[] nums) {
        int newNums[] = new int[2*nums.length];
        // create an array of 2n
        for (int i = 0; i < nums.length; i++){
            newNums[i] = nums[i];
            newNums[i+nums.length] = nums[i];
        }
        return newNums;
    }
}