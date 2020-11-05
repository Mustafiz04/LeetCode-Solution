class Solution {
    public int majorityElement(int[] nums) {
        // int n = nums.length;
        
        // if( n == 1 ){
        //     return nums[0];
        // }
        
        // HashMap<Integer, Integer> hm = new HashMap<>();
        // int half = n/2;
        
        // for(int i = 0; i<n; i++){
        //     if( hm.containsKey(nums[i]) ){
        //         int val = hm.get(nums[i]) + 1;
        //         if( val > half ){
        //             return nums[i];
        //         }else{
        //             hm.put(nums[i], val);
        //         }
        //     }else{
        //         hm.put(nums[i], 1);
        //     }
        // }
        // return -1;


        // Moore Algo
        int count = 0;
        int majority = 0;
        
        for(int i : nums){
            if( count == 0 ){
                majority = i;
            }
            if( i == majority ){
                count++;
            }else{
                count--;
            }
        }
        return majority;


    }
}