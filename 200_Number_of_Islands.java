class Solution {
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        boolean[][] vis = new boolean[r][c];
        
        int count = 0;
        for(int i = 0; i < r; i++ ){
            for(int j = 0; j<c; j++){
                if( grid[i][j] == '1' && !vis[i][j] ){
                    DFS(grid, i, j, vis);
                    count++;
                }
            }
        }
        return count;
    }
    
    public void DFS( char[][] grid, int i, int j, boolean[][] vis ){
        if( !valid(grid, i, j, vis) ){
            return;
        }
        
        vis[i][j] = true;
        
        DFS(grid, i+1, j, vis);
        DFS(grid, i-1, j, vis);
        DFS(grid, i, j+1, vis);
        DFS(grid, i, j-1, vis);
        
    }
    
    public boolean valid(char[][] grid, int i, int j, boolean[][] vis){
        int r = grid.length;
        int c = grid[0].length;
        if( i >= 0  && j >= 0 && i < r && j < c && grid[i][j] == '1' && !vis[i][j] ){
            return true;
        }
        return false;
    }
    
}