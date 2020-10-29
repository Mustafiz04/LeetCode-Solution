class Solution {
    public String multiply(String num1, String num2) {
        int l1 = num1.length();
        int l2 = num2.length();
        int[] ans = new int[l1 + l2];
        
        int k = ans.length - 1;
        
        for(int i = l2-1; i>= 0; i--){
            int a = num2.charAt(i) - '0';
            int l = k;
            for(int j = l1-1; j>=0; j--){
                int b = num1.charAt(j) - '0';
                int num = a * b + ans[l];
                if( num < 9 ){
                    ans[l] = num;
                }else{
                    ans[l] = num % 10;
                    ans[l-1] = ans[l-1] + num / 10;
                }
                l--;
            }
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
		int i = 0;
		while (i<ans.length && ans[i] == 0) {
			i++;
		}
		for (; i < ans.length; i++) {
			sb.append(ans[i]);
		}

		return sb.length()==0?"0":sb.toString();
        
        
//         long n1 = Long.parseLong(num1);
//         long n2 = Long.parseLong(num2);
        
//         return Long.toString(n1 * n2);
    }
}