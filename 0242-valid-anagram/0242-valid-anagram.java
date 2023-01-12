import java.util.HashMap; // import the ArrayList class

class Solution {
  
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        
        // count the number of times a character is repeated for each string
        HashMap<Character, Integer> hashMapS = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hashMapT = new HashMap<Character, Integer>();
        
        for (int i = 0; i < s.length(); i++){
            // String S
            // if key does not already exist in hashmap, add it to hashmap
            if (!hashMapS.containsKey(s.charAt(i))){
                hashMapS.put(s.charAt(i), 1);
            }
            // else, char is a repeat, appends value by 1
            else {
                hashMapS.put(s.charAt(i), hashMapS.get(s.charAt(i)) + 1);
            }
            
            // String T
            // if key does not already exist in hashmap, add it to hashmap
            if (!hashMapT.containsKey(t.charAt(i))){
                hashMapT.put(t.charAt(i), 1);
            }
            // else, char is a repeat, appends value by 1
            else {
                hashMapT.put(t.charAt(i), hashMapT.get(t.charAt(i)) + 1);
            }
        }
        

        
        
        return hashMapT.equals(hashMapS);
    }
    
}