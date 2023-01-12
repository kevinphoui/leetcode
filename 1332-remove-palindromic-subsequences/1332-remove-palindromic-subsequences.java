class Solution {
    public int removePalindromeSub(String s) {        
        // edge case
        if (s.length() == 0){
            return 0;
        }
        
        StringBuilder str = new StringBuilder(s).reverse();
        
        // whole string is a palindrome, can remove all at once
        if (s.equals(str.toString())) {
            return 1;
        }
        return 2;
    }
}