class Solution {
    public int findJudge(int n, int[][] trust) {
        // everyone trusts judge
        // judge trusts nobody
        // if no judge, return -1;
        int judge = -1;
        
        // edge case, where the number of trusts is less than the number of people
        if (trust.length < n - 1) {
            return -1;
        }
        
        int[] out = new int[n + 1];
        int[] in = new int[n + 1];
        
        for (int[] t : trust) {
            out[t[0]]++;
            in[t[1]]++;
        }
        
        // reiterate through people, check if judge
        // if judge trusts no one, and has n - 1 trusts, than is judge
        for (int i = 1; i <= n; i++) {
            if (in[i] == n - 1 && out[i] == 0) {
                return i;
            }
        }
        
        return judge;
    }
}