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
    
    
        /*
    //Factorial
    static long factorial(int N){
    if(N==1 || N==0){return 1;}
    return N*factorial(N-1);
    }
     */
    
    
         /*
    // Problem 70
    public static int climbStairs(int n) {
        int arr[] = new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for(int i =2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];

        }
        return arr[n];}
     */


}
