class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length];
        
        HashSet<Integer> set = new HashSet<>();
        // nested for loop
        int index = 0;
        int last = ans.length - 1;
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    ans[index++] = arr2[i];
                }
            }
        }
        
        Arrays.sort(arr1);
        for (Integer num : arr1) {
            if (!set.contains(num)) {
                ans[index++] = num;
            }
        }
        
        return ans;
    }
}