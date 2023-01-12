class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // key - sorted word
        // list - common words
        HashMap<String, List> hash = new HashMap<>();
        
        // iterate through strings
        for (String str : strs) {
            char[] charArr = str.toCharArray();
            // sort word
            Arrays.sort(charArr);
            // convert char array back to a string
            String key = String.valueOf(charArr);
            
            // if hash does not contain key, create a new pair with an empty list
            if (!hash.containsKey(key)) {
                hash.put(key, new ArrayList());
            }
            // add key to list
            hash.get(key).add(str);
        }
        
        return new ArrayList(hash.values());
    }
}