class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        char[] arr = s.toCharArray();
        int n = arr.length;
        
        if( n % 2 == 1 ){
            return false;
        }
        
        for(int i = 0; i<n; i++){
            char a = arr[i];
            if( a == '(' || a == '{' || a == '[' ){
                st.push(a);
            }
            if( st.isEmpty() ){
                return false;
            }
            
            
            switch(a){
                case ')':
                    a = st.pop();
                    if( a == '{' || a == '[' ){
                        return false;
                    }
                    break;
                case ']':
                    a = st.pop();
                    if( a == '{' || a == '(' ){
                        return false;
                    }
                    break;
                case '}':
                    a = st.pop();
                    if( a == '(' || a == '[' ){
                        return false;
                    }
                    break;
            }
        }
        return st.isEmpty();
        
    }
}