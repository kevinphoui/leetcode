class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longestPrefix = strs[0];
        if (strs.length == 0){
            return "";
        }
        
        // iterate through words/array
        for (int i = 1; i < strs.length; i++){
            String localPrefix = "";
            // while next word has same char as current char
            
            while (strs[i].indexOf(longestPrefix) != 0){
                longestPrefix = longestPrefix.substring(0, longestPrefix.length() -1);
                if (longestPrefix.isEmpty()){
                    return "";
                }
            }
           
        }
        
    
        return longestPrefix;
    }
}