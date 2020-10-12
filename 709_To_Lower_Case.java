class Solution {
    public String toLowerCase(String str) {
        // return str.toLowerCase();
        String result = "";
        for( char c : str.toCharArray() ){
            if( Character.isUpperCase(c) ){
                result += (char)(c + 32);
            }else{
                result += c;
            }
        }
        return result;
    }
}