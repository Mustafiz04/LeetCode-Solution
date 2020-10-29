class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        
        int[][] temp = new int[r][c];
        
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                temp[i][j] = matrix[i][j];
            }
        }
        
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                matrix[i][j] = temp[c-j-1][i];
            }
        }
            
    }
}
