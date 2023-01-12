class Solution {
    public int findMin(int[] nums) {
        // edge case
        if (nums.length == 1) {
            return nums[0];
        }
        
        int left = 0;
        int right = nums.length - 1;
        
        // check if there is no rotation at all
        if (nums[0] < nums[right]) {
            return nums[0];
        }
        
        while (left <= right) {
            int pivot = (left + right) / 2;
            
            // base case
            if (nums[pivot] > nums[pivot + 1]) {
                return nums[pivot + 1];
            }
            if (nums[pivot - 1 ] > nums[pivot]) {
                return nums[pivot];
            }
            
            // if left is greater than right, than is rotated
            if (nums[left] > nums[right]){
            }
        
            if (nums[pivot] > nums[left]) {
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
            
            
        }
        
        return -1;
    }
}