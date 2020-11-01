class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        if( n <= 1 ){
            return n;
        }
        int[] mat = new int[n];
        Arrays.fill(mat, 1);
        int[] len = new int[n];
        Arrays.fill(len, 1);
        
        for(int i = 1; i<n; i++){
            for(int j = 0; j<i; j++){
                if( nums[i] > nums[j] && mat[i] <= mat[j] ){
                    mat[i] = mat[j] + 1;
                    len[i] = len[j];
                }else if( mat[j] + 1 == mat[i] ){
                    len[i] += len[j];
                }
            }
        }
        int max = 0;
        for(int i = 0; i<n; i++){
            max = Math.max(max, mat[i]);
        }
        int count = 0;
        for(int i = 0; i<n; i++){
            if( mat[i] == max ){
                count += len[i];
            }
        }
        return count;
    }
}