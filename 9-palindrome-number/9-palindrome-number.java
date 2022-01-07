class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        String stringX = "" + x;
        StringBuilder reverseX = new StringBuilder("" + x);
        reverseX = reverseX.reverse();
        for (int i = 0; i < stringX.length(); i++){
            if (stringX.charAt(i) != reverseX.charAt(i)){
                return false;
            }
        }
        return true;
    }
}