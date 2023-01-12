class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> hash = new HashMap<>();
        paragraph = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase();
        String[] para = paragraph.split("\\s+");
        
        // add words to hash
        for (String word : para) {
            String temp = word;
            temp = temp.toLowerCase();
            hash.put(temp, hash.getOrDefault(temp, 0) + 1);
        }
        
        // remove banned words
        for (String ban : banned) {
            hash.remove(ban);
        }
        
        String max = "";
        int maxNum = 0;
        
        return Collections.max(hash.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}