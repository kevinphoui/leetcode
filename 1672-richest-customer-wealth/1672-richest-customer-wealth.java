class Solution {
    public int maximumWealth(int[][] accounts) {
        int largest = 0;
        for (int[] account : accounts){
            int accountTotal = 0;
            for (int money : account){
                accountTotal += money;
            }
            largest = Math.max(largest, accountTotal);
        }
        return largest;
    }
}