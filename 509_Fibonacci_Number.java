class Solution {
    public int fib(int N) {
        if( N <= 1 ){
            return N;
        }
        
        int[] f = new int[N+1];
        f[0] = 0;
        f[1] = 1;
        
        for(int i = 2; i<=N; i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[N];
    }
}