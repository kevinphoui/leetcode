class Solution {
    public boolean isPalindrome(String s) {
        
        String regex = s.toLowerCase().replaceAll("[^a-z0-9]","");    // keep only alphabet & number characters
        regex = regex.replaceAll("\\s+","");    // remove space
        StringBuilder str = new StringBuilder(regex);
        StringBuilder reverse = new StringBuilder(regex);
        reverse = reverse.reverse();
        
        
        return str.toString().equals(reverse.toString());
    }
}