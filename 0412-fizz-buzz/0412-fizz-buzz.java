class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            StringBuilder toAdd = new StringBuilder();
            // if % 3
            if (i % 3 == 0 ) {
                toAdd.append("Fizz");
            }
            
            // if % 5
            if (i % 5 == 0) {
                toAdd.append("Buzz");
            }
            
            // else if not, append i
            else if (toAdd.length() == 0){
                toAdd.append(i);
            }
            
            ans.add(toAdd.toString());
        }
        
        return ans;
    }
}