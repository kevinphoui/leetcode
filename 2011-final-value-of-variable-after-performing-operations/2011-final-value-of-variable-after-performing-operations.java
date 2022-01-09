class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for (String e : operations){
            switch (e){
                case "++X":
                case "X++":
                    sum++;
                    break;
                case "--X":
                case "X--":
                    sum--;
                    break;
            }
        }
        return sum;
    }
}