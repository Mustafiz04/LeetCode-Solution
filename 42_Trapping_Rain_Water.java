class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int ans = 0;
        
        for(int i = 1; i<n-1; i++){
            int left = height[i];
            for(int j = 0; j<i; j++){
                left = Math.max(left, height[j]);
            }
            int right = height[i];
            for(int j = i+1; j<n; j++){
                right = Math.max(right, height[j]);
            }
            
            ans += Math.min(left, right) - height[i];
        }
        return ans;
    }
}