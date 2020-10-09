class Solution {
    public int removeDuplicates(int[] arr) {
        if( arr.length == 0 ){
            return 0;
        }
        
        int len = 1;
        int num = arr[0];
        for(int i = 1; i<arr.length; i++){
            if( arr[i] != num ){
                arr[len] = arr[i];
                num = arr[len];
                len++;
            }
        }
        return len;
    }
}