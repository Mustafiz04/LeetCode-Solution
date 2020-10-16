class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        
        if( len == 0 ){
            return ans;
        }
        
        Stack<Integer> s = new Stack<>();
        
        for(int i = 2*len - 1; i>=0; i-- ){
            while( !s.isEmpty() && nums[s.peek()] <= nums[i % len] ){
                s.pop();
            }
            ans[i % len] = s.empty() ? -1 : nums[s.peek()];
            s.push( i % len );
            
        }
        return ans;
    }
}