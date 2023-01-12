class Solution {
    public void reverseString(char[] s) {
        char temp;
        
        for (int i = 0; i < (s.length / 2); i++) {
            int end = s.length - i - 1;
            temp = s[end];
            s[end] = s[i];
            s[i] = temp;
            
        }
    }
}