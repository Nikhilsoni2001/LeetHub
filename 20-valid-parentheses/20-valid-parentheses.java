class Solution {
    public boolean isValid(String ss) {
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < ss.length(); i++) {
            char c = ss.charAt(i);
            if(c == '(' || c == '{' || c == '[') s.push(c);
            else if(c == ')' && !s.isEmpty() && s.peek() == '(') s.pop();
            else if(c == ']' && !s.isEmpty() && s.peek() == '[') s.pop();
            else if(c == '}' && !s.isEmpty() && s.peek() == '{') s.pop();
            else return false;
        }
        if(!s.isEmpty()) return false;
        return true;
    }
}