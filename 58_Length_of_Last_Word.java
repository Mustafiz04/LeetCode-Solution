class Solution {
    public int lengthOfLastWord(String s) {
//         if( s.isEmpty() ){
//             return 0;
//         }
//         String[] str = s.trim().split(" ");
//         int n = str.length;
        
//         if( n > 0 ){
//             return str[n-1].length();
//         }
//         return 0;
        
        int count = 0;
        
        if( s.isEmpty() ){
            return count;
        }
        s = s.trim();
        
        for(int i = s.length() - 1; i>=0; i--){
            char c = s.charAt(i);
            
            if( c != ' ' ){
                count++;
            }else{
                return count;
            }
        }
        return count;
    }
}