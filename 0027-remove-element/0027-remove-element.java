class Solution {
    public int removeElement(int[] nums, int val) {
        int arrPtr = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val) {
                nums[arrPtr] = nums[i];
                arrPtr++;
            }
        }
        return arrPtr;   
    }
}