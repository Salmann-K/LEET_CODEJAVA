package com.company.UPLOAD;

public class Recursion {

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
    
    
}
