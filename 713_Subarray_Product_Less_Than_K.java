class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if( k <= 1 ){
            return 0;
        }
        int len = nums.length;
        int total = 0;
        int prod = 1;
        int left = 0;
        
        for(int i = 0; i<len; i++){
            prod *= nums[i];
            while( prod >= k ){
                prod /= nums[left++];
            }
            total += i - left + 1;
        }
        
        return total;
    }
    
}