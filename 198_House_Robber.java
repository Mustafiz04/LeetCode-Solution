class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if( n == 0 ){
            return 0;
        }
        if( n == 1 ){
            return nums[0];
        }
        
        int[] res = new int[n];
        res[0] = nums[0];
        res[1] = Math.max(nums[0], nums[1]);
        
        for(int i = 2; i<n; i++){
            res[i] = Math.max( nums[i] + res[i-2], res[i-1] );
        }
        
        return res[n-1];
    }
}