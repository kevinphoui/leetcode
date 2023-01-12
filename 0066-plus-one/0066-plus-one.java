class Solution {
    public int[] plusOne(int[] digits) {
        int end = digits.length - 1;
        
        // move backwards
        for (int i = end; i >= 0; --i) {
            // if last index is a 9, set to zero, and keep looping until digits[i] is not a 9
            if (digits[i] == 9) {
                digits[i] = 0;
            }
            
            // end loop and increments current index by 1 and returns it
             else {
                 digits[i]++;
                 return digits;
             }
        }

        
        digits = new int[digits.length + 1];  // increase size by 1
        digits[0] = 1;  // sets last element in array to 1
        return digits;
    }
    
}