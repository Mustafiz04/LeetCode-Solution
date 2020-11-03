class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for(int i = n-1; i>=0; i--){
            int sum = digits[i] + 1;
            digits[i] = sum % 10;
            if(sum < 10){
                return digits;
            }
            if( i == 0 && sum == 10 ){
                digits = new int[n+1];
                digits[0] = 1;
            }
        }
        return digits;
    }
}