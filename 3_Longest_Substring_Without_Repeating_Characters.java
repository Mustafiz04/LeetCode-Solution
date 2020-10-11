class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> hs = new HashSet<>();
        int i = 0, j = 0, max = 0;
        
        while( i < n ){
            char c = s.charAt(i);
            while( hs.contains(c) ){
                hs.remove( s.charAt(j) );
                j++;
            }
            hs.add(c);
            max = Math.max( max, i - j + 1 );
            i++;
        }
        return max;
    }
}