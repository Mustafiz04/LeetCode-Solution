class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if( n == 0 ) return 0;
        // int maxSoFar = nums[0];
        // int maxEndHere = nums[0];
        // for(int i = 1; i<n; i++){
        //     maxEndHere = Math.max(nums[i], maxEndHere + nums[i]);
        //     maxSoFar = Math.max(maxSoFar, maxEndHere);
        // }
        // return maxSoFar;
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndHere = 0, start = 0, s = 0, end = 0;
        for(int i = 0; i < n; i++) {
            maxEndHere += nums[i];
            if( maxSoFar < maxEndHere ){
                maxSoFar = maxEndHere;
                start = s;
                end = i;
            }
            if( maxEndHere < 0 ){
                maxEndHere = 0;
                s = i + 1;
            } 
        }
        System.out.println("Maximum contiguous sum is "+ maxSoFar);
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
        return maxSoFar;
    }
}