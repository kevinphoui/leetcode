class Solution {
    
    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    
    private static final String[] symbols = {
        "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };
    
    public String intToRoman(int num) {
        // approach: greedy algorithm
        // a greedy algorithm is an algorithm that makes the best possible decisions at the CURRENT time
        
        // given an integer, we look for the largest symbol that fits into it, subtract that, and then look for the next largest symbol that fits, and so on.
        
        StringBuilder sb = new StringBuilder();
        
        // loop through each symbol, stopping if num becomes 0
        for (int i = 0; i < values.length && num > 0; i++) {
            // repeat while the current symbol still fits into num
            while (values[i] <= num) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }
        
        return sb.toString();
    }
}