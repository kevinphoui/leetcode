class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> hash = new LinkedHashMap<>();

        // create key-value pair
        // key - character
        // value - number of repeats
        for (int i = 0; i < s.length(); i++){
            if (hash.containsKey(s.charAt(i))){
              // append key  
              hash.put(s.charAt(i), hash.get(s.charAt(i)) + 1);
            } else {
                hash.put(s.charAt(i), 1);
            }
        }

        // re-iterates through string
        for (int i = 0; i < s.length(); i++){
            // if char's key == 1, then return the index
            if (hash.get(s.charAt(i)) == 1){
                return i;
            }
        }
        
        return -1;
    }
}

