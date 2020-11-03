class Solution {
    public int maxPower(String s) {
        int len = s.length();
        int[] mat = new int[len];
        
        Arrays.fill(mat, 1);
        int max = 1;
        
        for(int i = 1; i<len; i++){
            if( s.charAt(i) == s.charAt(i-1) ){
                mat[i] += mat[i-1];
                max = Math.max( max, mat[i] );
            }
        }
        return max;
    }
}