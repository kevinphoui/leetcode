class Solution {
    public boolean isValid(String s) {
        // if there is an odd number, return false;
        if (s.length() % 2 != 0){
            return false;
        }
        
        
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < s.length(); i++){
            switch (s.charAt(i)){
                case '[':
                    stack.push(s.charAt(i));
                    break;
                case '{':
                    stack.push(s.charAt(i));
                    break;
                case '(':
                    stack.push(s.charAt(i));
                    break;
                
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