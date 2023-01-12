class Solution {
    public boolean isValid(String s) {
        // edge case
        if (s.length() % 2 != 0) {
            return false;
        }
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            Character bracket = s.charAt(i);
            switch(bracket) {
                case '(':
                    stack.push('(');
                    break;
                case '{':
                    stack.push('{');
                    break;
                case '[':
                    stack.push('[');
                    break;
                case ')':
                    if (stack.empty()){
                        return false;
                    }
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.empty()){
                        return false;
                    }
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.empty()){
                        return false;
                    }
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
            }
        }
        
        
        
        System.out.println(stack.toString());
        
        return stack.size() == 0;
    }
}