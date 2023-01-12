class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int longestDuration = releaseTimes[0];
        char longestChar = keysPressed.charAt(0);
        for (int i = 1; i < releaseTimes.length; i++) {
            int currentDuration = releaseTimes[i] - releaseTimes[i - 1];
            if ((currentDuration > longestDuration)
               || (currentDuration == longestDuration && keysPressed.charAt(i) > longestChar)) {
                
                
                longestDuration = releaseTimes[i] - releaseTimes[i - 1];
                longestChar = keysPressed.charAt(i);
            }
        }
        
        return longestChar;
    }
}