class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        allValid(ans, "", 0, 0, n);
        return ans;
    }
    
    public void allValid(List<String> ans, String curr, int open, int close, int max){
        if( curr.length() == max * 2 ){
            ans.add(curr);
            return;
        }
        
        if( open < max ){
            allValid(ans, curr+"(", open+1, close, max);
        }
        if( close < open ){
            allValid(ans, curr+")", open, close + 1, max);
        }
    }
    
}