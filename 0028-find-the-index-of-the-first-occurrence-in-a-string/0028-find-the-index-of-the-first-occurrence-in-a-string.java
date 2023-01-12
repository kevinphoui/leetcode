class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0){
            return 0;
        }
        
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            String sub = haystack.substring(i, needle.length() + i);
            if (sub.equals(needle)) {
                return i;
            }
        }
        
        return -1;
    }
}