class Solution {
    
    public int[] arrayRankTransform(int[] arr) {
        int[] rank = new int[arr.length];   // arr to return
        
        // arr to sort
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        HashMap<Integer, Integer> hashIndex = new HashMap<>();
        int index = 1;
        // input ranking index into a hashmap
        for (int i = 0; i < sortedArr.length; i++) {
            if (hashIndex.containsKey(sortedArr[i])) {
                continue;
            }
            hashIndex.put(sortedArr[i], index);
            index++;
        }
        
        // input ranking into rank arr
        for (int i = 0; i < arr.length; i++) {
            rank[i] = hashIndex.get(arr[i]);
        }
        
        return rank;
    }
}