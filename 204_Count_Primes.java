class Solution {
    public int countPrimes(int n) {
        boolean[] primeNum = new boolean[n+1];
        Arrays.fill(primeNum, true);
        
        for(int i = 2; i*i <= n ; i++){
            if( primeNum[i] == true ){
                for(int j = i*i; j<=n; j+=i  ){
                    primeNum[j] = false;
                }
            }
        }
        
        int total = 0;
        
        if( n <= 1 ){
            return 0;
        }
        
        for(int i = 2; i<n; i++){
            if( primeNum[i] == true ) {
                total++;
            }
        }
        
        return total;
    }
}