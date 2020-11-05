class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        
        int min = Integer.MAX_VALUE;
        int ans = 0;
        
        for(int i = 0; i<len; i++){
            if( prices[i] < min ){
                min = prices[i];
            }
            ans = Math.max(ans, prices[i] - min);
        }
        return ans;
    }
}