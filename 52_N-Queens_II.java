class Solution {
    int count = 0;
    public int totalNQueens(int n) {
        int[][] board = new int[n][n];
        
        nQueen(board);
        return count;
    }
    
    public boolean nQueen(int[][] board) {
        if( solveUtil(board, 0) == false ){
            return false;
        }
        return true;
    }
    
    public boolean solveUtil( int[][] board, int row ){
        int n = board.length;
        if( row == n ){
            count++;
            return true;
        }
        boolean res = false;
        for(int col = 0; col < n; col++){
            if( isSafe(board, row, col) ){
                board[row][col] = 1;
                
                res = solveUtil(board, row + 1) || res;
                
                board[row][col] = 0;
            }
        }
        return res;
    }
    
    private boolean isSafe(int[][] board, int row, int col) {
        int N = board.length;
        for (int i = 0; i < row; i++) 
            if (board[i][col] == 1) 
                return false; 

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) 
            if (board[i][j] == 1) 
                return false; 
  
        /* Check lower diagonal on left side */
        for (int i = row, j = col; j >= 0 && i < N; i++, j--) 
            if (board[i][j] == 1) 
                return false; 

        for (int i = row, j = col; i < N && j < N; i++, j++) 
            if (board[i][j] == 1) 
                return false; 
  
        /* Check lower diagonal on left side */
        for (int i = row, j = col; j < N && i >= 0; i--, j++) 
            if (board[i][j] == 1) 
                return false; 


        return true;
    }
    
}
