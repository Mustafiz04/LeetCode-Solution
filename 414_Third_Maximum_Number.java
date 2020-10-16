class Solution {
    public int thirdMax(int[] nums) {        
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums){
            hs.add(i);
        }
        
        int k = 3;
        if( hs.size() < k ){
            k = 1;
        }
        Queue<Integer> q = new PriorityQueue<>();
        
        
        for(int i : hs){
            q.add(i);
            while( q.size() > k ){
                q.poll();
            }
        }
        return q.poll();
    }
}