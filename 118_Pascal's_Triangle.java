class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        if( numRows == 0 ){
            return pascalTriangle;
        }
        
        List<Integer> currentRow = new ArrayList<>();
        currentRow.add( 1 );
        pascalTriangle.add(currentRow);
        
        for(int i = 1; i<numRows; i++){
            List<Integer> prevRow = pascalTriangle.get( i - 1 );
            List<Integer> row = new ArrayList<>();
            
            row.add( 1 );
            
            for(int j = 1; j<i; j++){
                row.add( prevRow.get( j-1 ) + prevRow.get(j ) );
            }
            
            row.add(1);
            pascalTriangle.add(row);
        }
        
        return pascalTriangle;
    }
}