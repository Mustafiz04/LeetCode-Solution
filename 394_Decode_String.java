class Solution {
    public String decodeString(String s) {
        
        Stack<Node> stack = new Stack<>();
        stack.push(new Node());
        for(char ch : s.toCharArray()) {
            if(Character.isDigit(ch)) {
                int tmp = stack.peek().times;
                tmp *= 10;
                tmp += Character.digit(ch, 10);
                stack.peek().times = tmp;
                continue;
            }
            if(ch == '[') {
                stack.push(new Node());
                continue;
            } 
            if(ch == ']') {
                Node prev = stack.pop();
                stack.peek().update(prev);
                stack.peek().times = 0;
                continue;
            }
            stack.peek().sb.append(ch);
        }
        return stack.pop().sb.toString();
    }
    
    private static class Node {
        
        StringBuilder sb = new StringBuilder();
        int times;
        void update(Node prev) {
            while(times-- > 0) {
                this.sb.append(prev.sb);
            }
        }
    }
}