class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> s1Hash = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            s1Hash.put(ch, s1Hash.getOrDefault(ch, 0) + 1);
        }
        
        // sliding window
        // s1.length() is window length
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            HashMap<Character, Integer> temp = new HashMap<>();
            
            String sub = s2.substring(i, i + s1.length());
            // put sub into hash
            for (char ch : sub.toCharArray()) {
                temp.put(ch, temp.getOrDefault(ch, 0) + 1);
            }
            
            // check if hash is equal
            if (s1Hash.equals(temp)) {
                return true;
            }
        }
        
        return false;
    }
}