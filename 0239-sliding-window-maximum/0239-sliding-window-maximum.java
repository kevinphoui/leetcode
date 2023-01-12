class Solution {
    // approach 2: deque (double-ended queue)
    // algorithm:
    //  - process the first k elements separately to initiate the deque
    //  - iterate over the array. at each step:
        // - clean the deque:
                // - keep only the indexes of elements from the current sliding window
                // - remove indexes of all elements smaller than the current one, since they will not be the maximum ones
        // - append the current element to the deque
        // - append deque[0] to the output
    // - return the output array
    
    ArrayDeque<Integer> deq = new ArrayDeque<Integer>();
    int[] nums;
    
    public void clean_deque(int i, int k) {
        // remove indexes of elements not from sliding window
        if (!deq.isEmpty() && deq.getFirst() == i - k)
            deq.removeFirst();
        
        // remove deq indexes of all elemetns
        // which are smaller than current element nums[i]
        while (!deq.isEmpty() && nums[i] > nums[deq.getLast()])
            deq.removeLast();
    }
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n * k == 0) {
            return new int[0];
        }
        if (k == 1) {
            return nums;
        }
        
        // init deque and output
        this.nums = nums;
        int max_idx = 0;
        for (int i = 0; i < k; i++) {
            clean_deque(i, k);
            deq.addLast(i);
            // compute max in num[:k]
            if (nums[i] > nums[max_idx]){
                max_idx = i;
            }
        }
        int[] output = new int[n - k + 1];
        output[0] = nums[max_idx];

        // build output
        for (int i = k; i < n; i++) {
            clean_deque(i, k);
            deq.addLast(i);
            output[i - k + 1] = nums[deq.getFirst()];
        }
    
        return output;
    }
}