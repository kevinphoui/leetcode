class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder ans = new StringBuilder(); 
        String newString = "";
        
        // remove any dashes
        s = s.replace("-", "");
        int counter = 1;
        
        // adds string backwards
        for (int i = s.length() - 1; i >= 0; i--){
            ans.append(s.charAt(i));
            
            // adds dash
            if (counter % k == 0 && counter != 0 && counter != s.length()){
                ans.append("-");
            }
            counter += 1;
        }
        
        ans = ans.reverse();    // reverse string
        newString = ans.toString();     // convert stringbuilder to string
        newString = newString.toUpperCase();    // capitalize
        return newString;
    }
}