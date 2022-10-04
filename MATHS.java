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

    
    /*
    // Problem 728
    public static List selfDividingNumbers(int left, int right) {
        List<Integer> results = new ArrayList<Integer>();
        for(int i=left;i<right+1;i++){
            if (palin(i)){
                results.add(i);
            }
        }
        return results;
    }
    public static boolean palin(int i) {
        int n=i;
        while(n>0){
            int rem = n%10;
            n=n/10;
            if (rem==0){
                return false;
            }
            if(i%rem!=0){
                return false;
            }
        }
        return true;
    }
*/

    /*
    // Square Root Of A Number
    private static double sqrt(int n, int p) {
        int s=0;
        int e=n;
        double root=0.0;
        // For A Perfect Square Root Number
        while(s<=e){
            int m=s+(e-s)/2;
            if(m*m==n){
                return m;
            }
            if(m*m>n){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        // For Decimal Square Root Number
        double inc=0.1;
        for (int i = 0; i <p ; i++) {
            while (root*root<=n){
                root+=inc;
            }
            root-=inc;
            inc/=10;
        }
        return root;
    }
        */
    
        /*
    //problem 1281
    public static int subtractProductAndSum(int n) {
        int pr=1,sum=0,diff;
        while(n>0){
            int tem=n%10;
            n=n/10;
            pr*=tem;
            sum+=tem;
        }
        if(pr>sum){
            return pr-sum;
        }
        return sum-pr;
    }
       */

        /*
    //problem 1281
    public static int subtractProductAndSum(int n) {
        int pr=1,sum=0,diff;
        while(n>0){
            int tem=n%10;
            n=n/10;
            pr*=tem;
            sum+=tem;
        }
        if(pr>sum){
            return pr-sum;
        }
        return sum-pr;
    }
       */

    
}
