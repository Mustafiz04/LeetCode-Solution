class Solution {
    public double myPow(double x, int n) {
        // inbuilt lib
        // return Math.pow(x, n);
        
        
        // for only positive number
        // if( n == 0 ){
        //     return 1;
        // }
        // if( n % 2 == 0 ){
        //     return myPow(x, n/2) * myPow(x, n/2);
        // }else{
        //     return x * myPow(x, n/2) * myPow(x, n/2);
        // }
        
        
        // for both positve and negative
        double temp;
        if( n == 0 ){
            return 1;
        }
        temp = myPow( x, n/2 );
        
        if( n % 2 == 0 ){
            return temp * temp;
        }else{
            if( n > 0 ){
                return x * temp * temp;
            }else{
                return (temp * temp)/x;
            }
        }
            
    }
}