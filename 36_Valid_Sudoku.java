class Solution {
    public boolean isValidSudoku(char[][] board) {
        return isValidSudoku(board, 9);
//         Set s = new HashSet();
        
//         for(int i=0;i <9; ++i)
//         {
//             for(int j=0;j<9;++j)
//             {
//                 char c = board[i][j];
                
//                 if(c != '.')
//                 {
//                     if(!s.add(c+" in row "+i) || 
//                        !s.add(c+" in col "+j) || 
//                        !s.add(c+" in block "+i/3+"-"+j/3))
//                         return false;
//                 }
//             }
//         }
        
//         return true;
    }
    
    public boolean isValidSudoku(char[][] board, int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                char val = board[i][j];
                if( val != '.' ){
                    if( !isValid(board, i, j, val) ){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public boolean isValid(char[][] board, int row, int col, char val){
        for(int r = 0; r<9; r++){
            if( board[r][col] == val ){
                return false;
            }
        }
        for(int c = 0; c<9; c++){
            if( board[row][c] == val ) {
                return false;
            }
        }
        int sqrt = (int)Math.sqrt(9);
        int rs = row - row % sqrt;
        int cs = col - col % sqrt;
        
        for(int i = rs; i<rs+sqrt; i++){
            for(int j = cs; j<cs+sqrt; j++){
                if( board[i][j] == val ){
                    return false;
                }
            }
        }
        return true;
    }
    
}