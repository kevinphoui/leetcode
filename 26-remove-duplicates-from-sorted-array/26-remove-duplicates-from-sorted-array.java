class Solution {
    
    public int removeDuplicates(int[] nums) {
        // have the result be placed in the first part of the array nums.
        // if there are k elements after removing the duplicates, then the first k element of nums
        // should hold the final result. it does not matter what you leave beyond the first k
        // reutnr k after placing the final result in the first k slots of nums.
        
        // for loop
        // if next is unique, add to new spot
        int count = 1;
        for (int i = 0; i < nums.length-1; i++){
            if (nums[i+1] != nums[i]){
                //count++;
                nums[count] = nums[i+1];
                count++;
            }
        }
        
        return count;
    }
}