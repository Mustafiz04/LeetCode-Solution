class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums){
            hs.add(i);
        }
        
        for(int j = 1; j<Integer.MAX_VALUE; j++ ){
            if( !hs.contains(j) ){
                return j;
            }
        }
        return -1;
    }
}