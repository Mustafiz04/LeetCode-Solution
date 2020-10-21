class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int r = mat.length;
        List<Integer> ans = new ArrayList<>();
        if( r == 0 ){
            return ans;
        }
        
        int c = mat[0].length;
        
        int top = 0, down = r-1, left = 0, right = c-1;
        int dir = 0;
        
        while( left <= right && top <= down ){
            if( dir == 0 ){
                for(int i = left; i<= right; i++){
                    ans.add(mat[top][i]);
                }
                top++;
            }else if( dir == 1 ){
                for(int i = top; i<= down; i++){
                    ans.add(mat[i][right]);
                }
                right--;
            }else if( dir == 2 ){
                for(int i = right; i>= left; i--){
                    ans.add(mat[down][i]);
                }
                down--;
            }else if( dir == 3 ){
                for(int i = down; i>= top; i--){
                    ans.add(mat[i][left]);
                }
                left++;
            }
            dir = (dir + 1 ) % 4;
        }
        return ans;
    }
}