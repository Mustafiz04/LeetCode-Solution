class Solution {
    public int findDuplicate(int[] nums) {
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
    }
}