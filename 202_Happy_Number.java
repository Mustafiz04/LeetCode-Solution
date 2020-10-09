class Solution {
    public boolean isHappy(int n) {
        int temp = n;
        Set duplicate = new HashSet<>();
        while(1 > 0){
            int sum = 0;
            while(temp > 0){
                sum = sum + (int)Math.pow(temp % 10, 2);
                temp = temp / 10;
            }
            
            if(sum == 1)
                return true;
            temp = sum;
            
            if(duplicate.contains(sum))
                return false;
            duplicate.add(sum);
        }
    }
}