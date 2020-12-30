class Solution {
    public int xorOperation(int n, int start) {
        int total = start;
        for(int i = 1; i < n; i++){
            int num = start + i*2;
            total = total ^ num;
        }
        return total;
    }
}