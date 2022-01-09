class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (int e : nums){
            if (hashSet.contains(e)){
                return true;
            } else {
                hashSet.add(e);
            }
        }
        return false;
    }
}