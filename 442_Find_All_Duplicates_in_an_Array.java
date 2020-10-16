class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        
        for(int i : nums){
            if( hs.contains(i) ){
                ans.add(i);
            }
            hs.add(i);
        }
        
        return ans;
    }
}