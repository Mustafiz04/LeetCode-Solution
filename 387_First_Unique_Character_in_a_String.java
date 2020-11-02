class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(int i = 0; i<s.length(); i++){
            char a = s.charAt(i);
            if( !hm.containsKey(a) ){
                hm.put(a, 1);
            }else{
                int val = hm.get(a);
                hm.put(a, val+1);
            }
        }
        
        int index = -1;
        for(int i = 0; i<s.length(); i++){
            if( hm.get(s.charAt(i)) == 1 ){
                index = i;
                break;
            }
        }
        return index;
    }
}