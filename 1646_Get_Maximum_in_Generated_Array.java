class Solution {
    public static int getMaximumGenerated(int n) {
        int[] arr = new int[n+1];
        
        if( n <= 1 ){
            return n;
        }
        
        arr[0] = 0;
        arr[1] = 1;
        int max = 1;
        for(int i = 2; i<=n; i++){
            int index = 0;
            if( i % 2 == 0 ){
                index = (int)i/2;
                arr[i] = arr[index];
            }else{
                index = (int)(i-1)/2;
                arr[i] = arr[index] + arr[index + 1];
            }
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}