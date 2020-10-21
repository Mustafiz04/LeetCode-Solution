class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        
        int top = 0, down = n-1, left = 0, right = n-1;
        int dir = 0;
        int num = 1;
        
        while( left <= right && top <= down ){
            if( dir == 0 ){
                for(int i = left; i<= right; i++){
                    mat[top][i] = num++;
                }
                top++;
            }else if( dir == 1 ){
                for(int i = top; i<= down; i++){
                    mat[i][right] = num++;
                }
                right--;
            }else if( dir == 2 ){
                for(int i = right; i>= left; i--){
                    mat[down][i] = num++;
                }
                down--;
            }else if( dir == 3 ){
                for(int i = down; i>= top; i--){
                    mat[i][left] = num++;
                }
                left++;
            }
            dir = (dir + 1 ) % 4;
        }
        return mat;
    }
}