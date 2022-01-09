class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        // split x and y
        // then add x and y
        
        // or 
        // for first half, place in correct spot
        // x
        for (int i = 1; i < nums.length/2; i++){
            arr[i + 1*i] = nums[i];
        }
        
        // for second half, goes back and place in correct spot
        // y
        for (int j = nums.length/2; j < nums.length; j++){
            arr[j - (nums.length-j)+1] = nums[j];
        }
        return arr;
    }
}