class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int totalSum = 0;
        int singleSum = 0;
        
        for(int i = 0; i<nums.length; i++){
            if( !hs.contains(nums[i]) ){
                singleSum += nums[i];
                hs.add(nums[i]);
            }
            totalSum += nums[i];
            
        }
        return (singleSum * 2) - totalSum ;
    }
}