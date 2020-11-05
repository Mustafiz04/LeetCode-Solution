class Solution {
    public int findDuplicate(int[] nums) {
        // Hashing
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if( !hm.containsKey(nums[i]) ){
                hm.put( nums[i], 1 );
            }else{
                Integer val = hm.get( nums[i] );
                if( val >= 1 ){
                    return nums[i];
                }
                hm.put( nums[i], val+1 );
            }
        }
        return -1;

        //         Slow and fast pointer
        // int n = nums.length;
        // if( n <= 1 ){
        //     return -1;
        // }
        // int slow = nums[0];
        // int fast = nums[nums[0]];
        
        // while( slow != fast ){
        //     slow = nums[slow];
        //     fast = nums[nums[fast]];
        // }
        // fast = 0;
        // while( slow != fast ){
        //     slow = nums[slow];
        //     fast = nums[fast];
        // }
        // return slow;

    }
}