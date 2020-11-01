class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        
        int l = 0;
        int r = n-1;
        
        return findMin(nums, l, r);
    }
    
    public int findMin(int[] nums, int l, int r){
        while( l < r ){
            int mid = (l + r)/2;
            
            if( nums[mid] == nums[r] ){
                r--;
            }else if( nums[mid] > nums[r] ){
                l = mid + 1;
            }else{
                r = mid;
            }
        }
        return nums[r];
    }
}