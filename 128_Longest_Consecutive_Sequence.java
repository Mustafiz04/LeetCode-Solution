class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int i : nums){
            hs.add(i);
        }
        
        int longestStreak = 0;
        
        for(int num : hs){
            if( !hs.contains(num - 1) ){
                int currentNum = num;
                int currentStreak = 1;
                
                while( hs.contains(currentNum + 1) ){
                    currentNum += 1;
                    currentStreak++;
                }
                
                longestStreak = Math.max(longestStreak, currentStreak);
                
            }
        }
        return longestStreak;
    }
}