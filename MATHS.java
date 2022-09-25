package com.company.UPLOAD;

public class MATHS {

    /*
    // Problem 202
    public static boolean isHappy(int n) {
        if(n==1) return true;
        else if(n>1 && n<7) return false;
        else{
            int sum=0;
            while(n!=0){
                sum+=(n%10)*(n%10);
                n/=10;
            }
            return isHappy(sum);
        }}
*/
    
       /*
    // Armstrong Number
    static String armstrongNumber(int n) {
        int sum = 0,tm=n;
        while (n != 0) {
            sum += (n % 10) * (n % 10) * (n % 10);
            n /= 10;
        }
        if(sum==tm){ return "Yes"; }
        return "No";
    }
     */

        /*
    // Problem 342
        public static boolean isPowerOfFour(int n) {
            if(n<=0){return false;}
            if(n==1){return true;}
            if(n%4==0){return isPowerOfFour(n/4);}
            return false;
        }
     */


}
