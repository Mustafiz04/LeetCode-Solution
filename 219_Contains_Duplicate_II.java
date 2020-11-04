class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;
        
        for(int i = 0; i<n; i++){
            if( !hm.containsKey(nums[i]) ){
                hm.put(nums[i], i);
            }else{
                int index = hm.get(nums[i]);
                int diff = i - index;
                if( diff <= k ){
                    return true;
                }else{
                    hm.put(nums[i], i);
                }
            }
        }
        return false;
    }
}