class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        // switch arrs
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        
        // key - number
        // value - count
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int n : nums1) {
            hash.put(n, hash.getOrDefault(n, 0) + 1);
        }
        
        int index = 0;  // index of ans
        int[] ans = new int[0]; // ans to be returned
        for (int i = 0; i < nums2.length; i++) {
            // count for each hash
            int count = hash.getOrDefault(nums2[i], 0);
            if (count > 0) {
                // add to array
                ans = Arrays.copyOf(ans, ans.length + 1);   
                ans[index] = nums2[i];
                index++;            
                // decrease count
                hash.put(nums2[i], count - 1);         
            }
        }
        
        return ans;
    }
}