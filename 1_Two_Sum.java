class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int currentSum = 0;
        int start = 0;
        int flag = 0;
        int[] ans = new int[2];
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i<n; i++){
            int com = target - arr[i];
            if( hm.containsKey(com) ){
                ans[0] = hm.get(com);
                ans[1] = i;
                break;
            }
            hm.put(arr[i], i);
        }
        
        // for(int i = 0; i<n-1; i++){
        //     for(int j = i+1; j<n; j++){
        //         if( arr[i] + arr[j] == target ){
        //             ans[0] = i;
        //             ans[1] = j;
        //             break;
        //         }
        //     }
        // }
        
        return ans;
    }
}