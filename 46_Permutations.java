class Solution {
    public List<List<Integer>> permute(int[] nums) {
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
            for(int i = 0; i < nums.length; i++){
                rec.add(nums[i]);
            }
            ans.add(rec);
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