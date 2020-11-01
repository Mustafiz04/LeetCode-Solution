class Solution {
    public void solveSudoku(char[][] board) {
        // solveSudoku(board, 9);
        solveSudoku(board, 0, 0);
    }
    
    public boolean solveSudoku(char[][] board, int row, int col) {
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if (board[i][j] == '.') {
                    for (char c='1'; c<='9'; c++) { //go through all the options
                        if (isValid(board, c, i, j)) {
                            board[i][j] = c;
                            if(solveSudoku(board, i, j))
                                return true;
                            else
                                board[i][j] = '.';
                        }
                    }
                    //because it was '.' we want to go through it once again
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean isValid(char[][] board, int c, int row, int col) {
        for (int i=0; i<9; i++) {
            if(board[row][i] == c) return false;
            if(board[i][col] == c) return false;
            if(board[3*(row/3) + i/3][3*(col/3) + i%3] == c) return false;
        }

        return true;
    }
    
    
    
//     public boolean solveSudoku(char[][] board, int n){
//         int row = -1;
//         int col = -1;
//         boolean isEmpty = true;
        
//         for(int i = 0; i<n; i++){
//             for(int j = 0; j<n; j++){
//                 if( board[i][j] == '.'){
//                     row = i;
//                     col = j;
//                     isEmpty = false;
//                     break;
//                 }
//             }
//             if( !isEmpty ){
//                 break;
//             }
//         }
//         if( isEmpty ){
//             return true;
//         }
        
//         for(char num = '1'; num<='9'; num++){
//             if(isSafe( board, row, col, num )){
//                 board[row][col] = num;
//                 if( solveSudoku(board, n) ) {
//                     return true;
//                 }else{
//                     board[row][col] = '.';
//                 }
//             }
//         }
//         return false;
//     }
    
//     public boolean isSafe(char[][] board, int row, int col, char num){
//         for(int d = 0; d < 9; d++){
//             if( board[row][d] == num ) {
//                 return false;
//             }
//         }
//         for(int r = 0; r < 9; r++){
//             if( board[r][col] == num ) {
//                 return false;
//             }
//         }
//         int sqrt = (int)Math.sqrt(9);
//         int rs = row - row % sqrt;
//         int cs = col - col % sqrt;
        
//         for(int r = rs; r < rs+sqrt; r++){
//             for(int c = cs; c<cs+sqrt; c++){
//                 if( board[r][c] == num ){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
}