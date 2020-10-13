class Solution {
    public int numTrees(int n) {
        int[] mat = new int[n+1];
        
        mat[0] = 1;
        mat[1] = 1;
        
        for(int i = 2; i<=n; i++){
            for(int j = 1; j<=i; j++){
                mat[i] += mat[j-1]*mat[i-j];
            }
        }
        return mat[n];
    }
}