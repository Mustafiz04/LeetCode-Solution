class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        if( n <= 1 ){
            return n;
        }
        int[] mat = new int[n];
        Arrays.fill(mat, 1);
        
        for(int i = 0; i<n-1; i++){
            if( nums[i+1] > nums[i] ){
                mat[i+1] = mat[i] + 1;
            }
        }
        int max = 0;
        for(int i : mat){
            max = Math.max(max, i);
        }
        return max;
    }
}