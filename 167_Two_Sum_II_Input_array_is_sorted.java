class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        
        int l = 0;
        int e = n - 1;
        
        while( l <= e ){
            int sum = numbers[l] + numbers[e];
            
            if( sum > target ){
                e--;
            }else if( sum < target){
                l++;
            }else{
                return new int[]{l+1, e+1};
            }
        }
        return new int[]{l+1, e+1};
    }
}