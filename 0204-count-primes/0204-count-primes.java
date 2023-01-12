class Solution {
    public int countPrimes(int n) {
        // edge case
        if (n <= 2) {
            return 0;
        }
        
        boolean[] numbers = new boolean[n]; // array full of false - true means that it is prime
        
        // sieve of erathosthenes
        for (int p = 2; p <= (int)Math.sqrt(n); p++) {
            if (numbers[p] == false) {
                for (int j = p * p; j < n; j+= p) {
                    numbers[j] = true;
                }
            }
        }
        
        // count number of prime
        int numberOfPrimes = 0;
        for (int i = 2; i < n; i++) {
            if (numbers[i] == false) {
                numberOfPrimes++;
            }
        }
        
        return numberOfPrimes;
    }
}