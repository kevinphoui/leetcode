class Solution {
    public int mostWordsFound(String[] sentences) {
        // split and pick array with largest array size   
        int largest = 0;
        for (int i = 0; i < sentences.length; i++){
            String[] temp = sentences[i].split(" ");
            if (temp.length > largest){
                largest = temp.length;
            }
        }
        return largest;
    }
}