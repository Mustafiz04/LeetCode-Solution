class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        int first = binary(nums, n, target);
        int last = binary(nums, n, target+1) - 1;
        
        if( first <= last ){
            ans[0] = first;
            ans[1] = last;
        }else{
            ans[0] = -1;
            ans[1] = -1;
        }
        return ans;
    }
    
    public int binary(int[] nums, int n, int val){
        int l = 0; 
        int r = n-1;
        int p = n;
        
        while( l <= r ){
            int mid = (l + r)/2;
            if( nums[mid] >= val ){
                p = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return p;
    }
}