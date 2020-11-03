class Solution {
    HashSet<String> hs = new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        if( n == 1 ){
            ans.add(Arrays.asList(nums[0]));
            return ans;
        }
        int start = 0, end = n-1;
        permute(nums, start, end, ans);
        return ans;
    }
    public void permute(int[] nums, int s, int e, List<List<Integer>> ans){
        if( s == e ){
            List<Integer> rec = new ArrayList<>();
            String str = "";
            for(int i = 0; i < nums.length; i++){
                rec.add(nums[i]);
                str += String.valueOf(nums[i]);
            }
            if( !hs.contains(str) ){
                hs.add(str);
                ans.add(rec);
            }
            
        }else{
            for(int i = s; i<=e; i++){
                nums = swap(nums, s, i);
                permute(nums, s+1, e, ans);
                nums = swap(nums, s, i);
            }
        }
    }
    public int[] swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        
        return nums;
    }
}