class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += nums[i];
        }
        int lsum = 0;
        int rsum = sum;
        
        for(int i = 0; i<n; i++){
            rsum -= nums[i];
            if( lsum == rsum ){
                return i;
            }
            lsum += nums[i];
        }
        return -1;
    }
}