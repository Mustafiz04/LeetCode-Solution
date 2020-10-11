class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0, r = n - 1;
        int maxArea = 0;
        
        while( l < r ){
            maxArea = Math.max( maxArea, Math.min( height[l], height[r] ) * (r-l) );
            
            if( height[l] < height[r] ){
                l++;
            }else{
                r--;
            }
        }
        return maxArea;
        
        
//         int maxH = 0;
//         int n = height.length;
        
//         for( int i = 0; i<n; i++ ){
//             for(int j = i+1; j<n; j++){
//                 maxH = Math.max( maxH, Math.min( height[i], height[j] ) * (j-i) );
//             }
//         }
//         return maxH;
    }
}