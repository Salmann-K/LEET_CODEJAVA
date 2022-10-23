package com.company.UPLOAD;

public class Recursion {
     
     /*
    Problem 509
    public static int fib(int n) {
    if(n==0 || n==1 )
    {
        return n;
    }
        return fib(n-1)+fib(n-2);
    }
     */
    
     
         /*
    Problem 344
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        solve(s, i, j);
    }
    public static void solve(char[] s, int i, int j){
        if(i >= j) return;
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        solve(s, ++i, --j);
    }
     */
     

     /*
    static int fibo(int n)
    {
        if(n<2)
            return n;
        return fibo(n-1)+fibo(n-2);
    }
     */
    /*
    static int bsearch(int [] arr , int target , int s , int e)
    {
        if(s>e)
            return -1;
        int m=s+(e-s)/2;
        if(arr[m]==target)
        {
            return m;
        }
        if(arr[m]>target)
        {
            return bsearch(arr,target,s,m-1);
        }
        else
            return bsearch(arr,target,m+1,m);
    }
     */
     
     /*
    static void sumtriangle(int [] arr) {

        if (arr.length<1)
        {
            return ;
        }
        int [] re = new int[(arr.length - 1)];
        for (int i = 0; i < arr.length-1; i++) {
            re[i] = arr[i] + arr[i + 1];
        }
        sumtriangle(re);
        System.out.println(Arrays.toString(arr));
    }
     */
    
     
     /*
    static int min(int [] arr,int n)
    {
        if(n==1)
        {
            return arr[0];
        }
        return Math.min(arr[n-1],min(arr,n-1));
    }
*/
    /*
    static int max(int [] arr,int n)
    {
        if(n==1)
        {
            return arr[0];
        }
        return Math.max(arr[n-1],max(arr,n-1));
    }
    */
    
      /*
    static char upper(String s){
        for (int i = 0; i <s.length() ; i++) {
            if(Character.isUpperCase(s.charAt(i)))
                return s.charAt(i);
        }
        return 0;
    }
    
    /*
    public static void printNos(int N)
    {
        if(N > 0)
        {
            printNos(N-1);
            System.out.println(N);
        }
    }
     */
    
   
    
}
