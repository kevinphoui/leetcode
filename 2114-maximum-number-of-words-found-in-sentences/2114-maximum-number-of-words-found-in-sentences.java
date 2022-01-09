class Solution {
    public int mostWordsFound(String[] sentences) {
        // split and pick array with largest array size   
        int largest = 0;
        for (String sentence : sentences){
            largest = Math.max(largest, sentence.split(" ").length);
        }
        return largest;
    }
}