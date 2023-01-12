class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        // count the number of repeats for each char
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        
        //System.out.println(Arrays.toString(count));
        
        // each character must be paired, except for one, which can be in the middle
        
        int ans = 0;
        // iterate through char count list
        for (int i = 0; i < count.length; i++) {
            ans += count[i] / 2 * 2;    // check if paired
            //System.out.println(count[i] / 2 * 2);
            if (ans % 2 == 0 && count[i] % 2 == 1) {
                ans++;
            }
        }
        return ans;
    }
}