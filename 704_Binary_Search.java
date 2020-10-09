class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int l = 0;
        int r = n-1;
        
        while( l <= r ){
            int mid = (l+r)/2;
            
            if( arr[mid] == target ){
                return mid;
            }else if( arr[mid] < target ){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return -1;
    }
}