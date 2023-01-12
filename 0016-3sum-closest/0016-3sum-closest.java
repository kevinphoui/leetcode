class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // approach: two pointers
        // 1) initialize the minimum difference diff with a large value
        int diff = Integer.MAX_VALUE;
        
        // 2) sort the input array nums
        Arrays.sort(nums);
        
        // 3) iterate through the array:
        // if diff is zero, break from loop
        for (int i = 0; i < nums.length && diff != 0; i++) {
            // for the current position i, set lo to i + 1, and hi to the last index
            int low = i + 1;
            int high = nums.length - 1;
            
            // while the lo pointer is smaller than high:
            while (low < high) {    
                // set sum to nums[i] + nums[lo] + nums[hi]
                int sum = nums[i] + nums[low] + nums[high];
                // if the absolute difference between sum and target is smaller than the absolute value of diff
                if (Math.abs(target - sum) < Math.abs(diff)) {
                    diff = target - sum;
                    // set diff to target - sum
                }
                // if sum is less than target, increment lo
                if (sum < target) {
                   low++;
                } 
                // else decrement high
                else {
                   high--;
                }
            }
        }
        // 4) return the value of the closest triplet, which is target - diff
        return target - diff;
    }
}