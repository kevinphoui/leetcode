class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        // use hashmap to count nubmer of word repeats
        HashMap<String, Integer> count = new HashMap<>();
        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        
        // list of word objects
        List<Word> candidates = new ArrayList<>();
        for (var entry : count.entrySet()) {
            candidates.add(new Word(entry.getKey(), entry.getValue()));
        }
        
        PriorityQueue<Word> pq = new PriorityQueue<>(candidates);
        ArrayList<String> topK = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            topK.add(pq.poll().word);
        }
        
        return topK;
    }
    
    class Word implements Comparable<Word> {
        String word;
        int count;
        
        public Word(String word, int count) {
            this.word = word;
            this.count = count;
        }
        
        @Override
        public int compareTo(Word otherWord) {
            if (this.count == otherWord.count) {
                return this.word.compareTo(otherWord.word);
            }
            return otherWord.count - this.count;
        }
    }
}