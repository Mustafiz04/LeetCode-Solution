class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        if( nums[n-1] == target ){
            return n-1;
        }
        return searchEle(nums, 0, n-1, target);
    }
    
    public int searchEle(int[] arr, int l, int r, int k){
        if( r < l ){
            return -1;
        }
        
        int mid = (l + r)/2;
        if( arr[mid] == k ){
            return mid;
        }
        if( arr[mid] >= arr[l] ){
            if( arr[mid] >= k && arr[l] <= k  ){
                return searchEle(arr, l, mid-1, k);
            }else{
                return searchEle(arr, mid+1, r, k);
            }
        }
        if( arr[mid] <= k && arr[r] >= k  ){
            return searchEle(arr, mid+1, r, k);
        }
        return searchEle(arr, l, mid-1, k);
    }
}