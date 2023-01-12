class Solution {
    public int[] productExceptSelf(int[] nums) {
        // must run in O(n)
        // cannot use the division / operator
        
        // answer[i] is equal to the product of all the elements of nums except nums[i]
        
        int[] ans = new int[nums.length];
        ans[0] = 1; // start at one
        
        // iterate right
        for (int i = 1; i < ans.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        
        // iterate left
        int[] left = new int[nums.length];
        left[nums.length - 1] = 1;
        for (int i = ans.length - 1; i > 0; i--) {
            left[i - 1] = left[i] * nums[i];
            ans[i] = left[i] * ans[i];
        }
        ans[0] = left[0] * ans[0];

        
        return ans;
    }
}