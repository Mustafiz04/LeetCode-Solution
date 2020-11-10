class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int[][] ans = new int[row][col];
        
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if( A[i][j] == 0 ){
                    ans[i][col - j - 1] = 1;
                }else{
                    ans[i][col - j - 1] = 0;
                }
            }
        }
        return ans;
    }
}