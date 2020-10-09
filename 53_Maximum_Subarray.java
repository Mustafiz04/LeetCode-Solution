class Solution {
    public int maxSubArray(int[] arr) {
        int maxSum = arr[0];
        int maxSumSoFar = arr[0];
        
        for(int i = 1; i<arr.length; i++){
            maxSum = Math.max(arr[i], maxSum + arr[i]);
            maxSumSoFar = Math.max(maxSum, maxSumSoFar);
        }
        return maxSumSoFar;
    }
}