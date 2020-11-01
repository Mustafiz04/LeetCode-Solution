class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> minEle = new Stack<>();
    Stack<Integer> st = new Stack<>();
    
    public void push(int x) {
        if( st.isEmpty() || x <= minEle.peek() ){
            minEle.push(x);
        }
        st.push(x);
    }
    
    public void pop() {
        if(st.peek().equals( minEle.peek() )){
            minEle.pop();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minEle.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */