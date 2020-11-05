class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int start = 0;
        int mid = 0;
        int last = n - 1;
        
        while( mid <= last ){
            switch( nums[mid] ){
                case 0:
                    swap(nums, start++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, last--);
                    break;
            }
        }
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}