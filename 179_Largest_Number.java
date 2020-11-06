class Solution {
    public String largestNumber(int[] arr) {
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                String s1 = Integer.toString(arr[i]); 
                String s2 = Integer.toString(arr[j]);
                String ij = s1 + s2;
                String ji = s2 + s1;
                
                if( Long.parseLong(ji) > Long.parseLong(ij) ){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        if( arr[0] == 0 ){
            return "0";
        }
        String result = "";
        for(int i = 0; i<n; i++){
            result += arr[i];
        }
        return result;
    }
}