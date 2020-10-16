class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0; i<arr.length; i++){
            if( !hm.containsKey(arr[i]) ){
                hm.put(arr[i], 1);
            }else{
                int val = hm.get(arr[i]);
                hm.put(arr[i], val+1);
            }
        }
        
        for( Map.Entry<Integer, Integer> entry : hm.entrySet() ){
            if( hs.contains(entry.getValue()) ){
                return false;
            }
            hs.add( entry.getValue() );
        }
        
        return true;
        
    }
}