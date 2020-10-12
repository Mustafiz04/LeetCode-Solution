class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for( char ch : s.toCharArray() ){
            if( Character.isDigit(ch) || Character.isLetter(ch) ){
                str += ch;
            }
        }
        
        str = str.toLowerCase();
        
        int l = 0;
        int r = str.length() - 1;
        
        while( l < r ){
            if( str.charAt(l) != str.charAt(r) ){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}