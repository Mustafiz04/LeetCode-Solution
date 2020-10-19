class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        
        if( n == 0 ){
            return 0;
        }
        
        int[] mat = new int[n];
        
        for(int i = 0; i<n; i++){
            mat[i] = 1;
        }
        
        int max = 1;
        
        for(int i = 1; i<n; i++){
            for(int j = 0; j<i; j++){
                if( nums[i] > nums[j] && mat[i] <= mat[j] ){
                    mat[i] = mat[j] + 1;
                }
            }
        }
        
        for(int i = 0; i<n; i++){
            if( max < mat[i] ){
                max = mat[i];
            }
        }
        
        return max;
    }  
}
