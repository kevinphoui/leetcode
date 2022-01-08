class Solution {
    public boolean isValid(String s) {
        // if there is an odd number, return false;
        if (s.length() % 2 != 0){
            return false;
        }
        // Creates stack
        Stack<Character> stack = new Stack<Character>();
        
        // iterates through string
        for (int i = 0; i < s.length(); i++){
            switch (s.charAt(i)){
                // pushes onto stack
                case '[':
                    stack.push(s.charAt(i));
                    break;
                case '{':
                    stack.push(s.charAt(i));
                    break;
                case '(':
                    stack.push(s.charAt(i));
                    break;
                
                // removes from stack
                case ']':
                    if (stack.size() == 0 || stack.pop() != '['){
                        return false;
                    }
                    break;
                case '}':
                    if (stack.size() == 0 || stack.pop() != '{'){
                        return false;
                    }
                    break;
                case ')':
                    if (stack.size() == 0 || stack.pop() != '('){
                        return false;
                    }
                    break;
            }
        }
        if (stack.size() != 0){
                return false;
            }
        return true;
    }
}