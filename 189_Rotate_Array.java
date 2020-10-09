class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        int rem = n-k;
        int[] tem = new int[rem];
        for(int i = 0; i<rem; i++){
            tem[i] = arr[i];
        }
        
        for(int i = 0; i<k; i++){
            arr[i] = arr[i+rem];
        }
        for(int i = 0; i<rem; i++){
            arr[i+k] = tem[i];
        }
    }
}