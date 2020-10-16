class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        int[] ans = new int[a];
        
        if( a == 0 ){
            return ans;
        }
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        Stack<Integer> s = new Stack<Integer>();
        
        s.push( nums2[0] );
        int next, ele;
        for(int i = 1; i<b; i++){
            next = nums2[i];
            if( !s.isEmpty() ){
                ele = s.pop();
                while( ele < next ){
                    hm.put( ele, next );
                    if( s.isEmpty() ){
                        break;
                    }
                    ele = s.pop();
                }
                if( ele > next ){
                    s.push(ele);
                }
            }
            s.push(next);
        }
        
        while( !s.isEmpty() ){
            ele = s.pop();
            next = -1;
            hm.put( ele, next );
        }
        
        
        for(int i = 0; i<a; i++ ){
            ans[i] = hm.get( nums1[i] );
        }
        
        return ans;
    }
}