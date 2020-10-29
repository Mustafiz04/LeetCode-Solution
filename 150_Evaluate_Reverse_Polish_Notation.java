class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> digits = new Stack<Integer>();
        for(String token : tokens){
            if(!digits.empty()){
                System.out.println(digits.peek());
            }
            
            switch(token){         
                case "+":
                {
                    int firstDigit = digits.pop();
                    int secondDigit = digits.pop();
                    int result = firstDigit + secondDigit;
                    digits.push(result);
                    break;
                }
                case "-":
                {
                    int firstDigit = digits.pop();
                    int secondDigit = digits.pop();
                    int result = secondDigit - firstDigit;
                    digits.push(result);
                    break;
                }
                case "*":
                {
                    int firstDigit = digits.pop();
                    int secondDigit = digits.pop();
                    int result = firstDigit * secondDigit;
                    digits.push(result);
                    break;
                }
                case "/":
                {
                    int firstDigit = digits.pop();
                    int secondDigit = digits.pop();
                    int result = secondDigit / firstDigit;
                    digits.push(result);
                    break;
                }
                default:
                    digits.push(Integer.parseInt(token));
                    break;
            }
        }
        
        return digits.pop();
    }
}