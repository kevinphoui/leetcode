class Solution {
    public int romanToInt(String s) {
        int total = 0;
       
        // iterate through String
        for (int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case 'I':             
                    // 1 | if I, check if is prefix, then subtract 1
                    // if next char exists, checks
                    if (i+1 != s.length()){
                        if (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X'){
                            total-= 1;
                        }
                        else {total += 1;}
                    }
                    else {total += 1;}
                    break;
                    
                case 'V':
                    total += 5;
                    break;
                    
                case 'X':
                    if (i+1 != s.length()){
                        if (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C'){
                            total-= 10;
                        }
                        else {total += 10;}
                    }
                    else {total += 10;}   
                    break;
                    
                case 'L':
                    total += 50;
                    break;
                    
                case 'C':
                    // if next char exists, checks
                    if (i+1 != s.length()){
                        if (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M'){
                            total-= 100;
                        }
                        else {total += 100;}
                    }
                    else {total += 100;} 
                    break;
                
                case 'D':
                    total += 500;
                    break;
                
                case 'M':
                    total += 1000;
                    break;
            }
        }
        return total;
    }
}