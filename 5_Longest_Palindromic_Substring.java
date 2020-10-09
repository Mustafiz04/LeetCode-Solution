class Solution {
    public String longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        
        String str = LPS( arr, n );
        return str;
    }
    
    public String LPS(char[] arr, int n){
        boolean[][] mat = new boolean[n][n];
        int maxLen = 1;
        
        for(int  i = 0 ; i<n; i++){
            mat[i][i] = true;
        }
        
        int start = 0;
        for(int i = 0; i<n-1; i++){
            if( arr[i] == arr[i+1] ){
                mat[i][i+1] = true;
                start = i;
                maxLen = 2;
            }
        }
        int e = 0;
        for(int i = 3; i<=n; i++){
            for(int s = 0; s<n-i+1; s++){
                e = s + i - 1;
                if( arr[s] == arr[e] && mat[s+1][e-1] ){
                    mat[s][e] = true;
                    
                    if( i > maxLen  ){
                        maxLen = i;
                        start = s;
                    }
                }
            }
        }
        String str = "";
        int end = start + maxLen - 1;
        for(int i = start; i<=end; i++){
            str += arr[i];
        }
        return str;
    }   
}