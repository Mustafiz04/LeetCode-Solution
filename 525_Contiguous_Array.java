class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        
        int n = nums.length;
        int count = 0;
        int maxLen = 0;
        
        for(int i = 0; i<n; i++){
            count += nums[i] == 1 ? 1 : -1;
            if( hm.containsKey( count )){
                maxLen = Math.max(maxLen , i - hm.get(count) );
            }else{
                hm.put( count, i );
            }
        }
        
        return maxLen;
        

        // method 2
//         int n = nums.length;
        
//         int maxLen = 0;
//         for(int i = 0; i<n; i++){
//             int zero = 0;
//             int one = 0;
//             for(int j = i; j<n; j++){
//                 if( nums[j] == 0 ){
//                     zero += 1;
//                 }else{
//                     one += 1;
//                 }
//                 if( one == zero ){
//                     maxLen = Math.max(maxLen, j-i+1);
//                 }
//             }
//         }
//         return maxLen;
    }
}