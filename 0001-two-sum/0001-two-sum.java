class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            
            if (hash.containsKey(remainder) && hash.get(remainder) != i) {
                return new int[] {i, (Integer)hash.get(remainder)};
            } else {
                hash.put(nums[i], i);  
            }
        }
        
        return null;
    }
}