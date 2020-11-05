class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        
        int i = len - 2;
        
        while( i >= 0 && nums[i+1] <= nums[i] ){
            i--;
        }
        if( i >= 0 ){
            int j = len - 1;
            while( j >= 0 && nums[j] <= nums[i] ){
                j--;
            }
            swap( nums, i, j );
        }
        reverse(nums, i+1);
    }
    
    public void reverse(int[] nums, int start){
        int i = start;
        int end = nums.length - 1;
        while( i < end ){
            swap( nums, i, end );
            i++;
            end--;
        }
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
}