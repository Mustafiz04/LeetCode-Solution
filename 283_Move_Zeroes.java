class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        
        for(int i = 0; i<nums.length; i++){
            if( nums[right] != 0 ){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }
    }
}