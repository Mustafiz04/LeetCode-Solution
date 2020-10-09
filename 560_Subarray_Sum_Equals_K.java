import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int res = 0;
        int currSum = 0;
        
        for(int i = 0; i<nums.length; i++){
            currSum += nums[i];
            
            if( currSum == k ){
                res += 1;
            }
            
            if( hm.containsKey(currSum - k ) ){
                res += hm.get( currSum - k );
            }
            
            Integer val = hm.get( currSum );
            if( val == null ){
                hm.put( currSum , 1 );
            }else{
                hm.put( currSum, val + 1 );
            }
            
        }
        return res;
        
        // Method 2
        // int n = nums.length;
        // int total = 0;
        // for(int i = 0; i<n; i++ ){
        //     int sum = 0;
        //     for(int j = i; j<n; j++){
        //         sum += nums[j];
                
        //         if( sum == k ){
        //             total++;
        //         }
        //     }
        // }
        
        // return total;
    }
}