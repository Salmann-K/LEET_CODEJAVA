package com.company.UPLOAD;

public class Recursion {
     
      /*
    // Problem 50
    public static double myPow(double x, int n) {
        double a=x;
        if(n==0)
            return (double)1;
        if(n>0){
            a=positive(x,n);
        }
        else{
            a=1/positive(x,n);
        }
        return a;
    }
    static double positive(double x,int n){
        if(n==0)
            return 1;
        double temp=positive(x,n/2);
        if(n%2==0)
            return temp*temp;
        else
            return temp*temp*x;
    }
*/
     
      /*
    //Problem 779
    public static int kthGrammar(int n, int k) {
        if(n==1 || k==1){  //base condition- because every 1st row contains 0
            return 0;
        }
        int middle = (int)(Math.pow(2,n-1)/2);  //find middle element
        if(k<=middle){                          //if k lies in 1st half, return the previous row
            return kthGrammar(n-1, k);
        }
        return (kthGrammar(n-1, k-middle)^1);  //else, return the complement of 2nd half by taking XOR
    }
*/
     
     /*
    Problem 1922
    public static int modu=(int)1e9+7;
    public static int countGoodNumbers(long n) {
        if(n%2==0){
            long a1= powerfunc(4,n/2);
            long b1= powerfunc(5,n/2);
            long c=a1*b1 %modu;
            return (int)(c);
        }else{
            long a1= powerfunc(4,n/2);
            long b1= powerfunc(5,(n/2)+1);
            long c=a1*b1%modu;
            return (int)(c);
        }
    }
    // power function
    public static long powerfunc(long x, long y){
        long temp;
        if(y==0) return 1;
        temp= powerfunc(x,y/2);
        if(y%2==0) return (temp*temp)%modu;
        else return (x*temp*temp)%modu;
    }
     */
     
     /*
        public static int count =0;
    public static int numberOfSteps(int num) {
        if(num==0)
        {
            return count;
        }
        if (num % 2 == 0) {
            numberOfSteps(num/2);
            count++;
        }
        else{
            numberOfSteps(num-1);
            count++ ;
        }
       return count;
    }
*/
     
      /*
    //Problem 342
    public static boolean isPowerOfFour(int n) {
        if(n<=0)
        {
            return false;
        }
        if(n==1)
        {
            return true;
        }
        if(n%4==0)
        {
            return isPowerOfFour(n/4);
        }
        return false;
    }
     */
     
      /*
    //Problem 326
    public static boolean isPowerOfThree(int n) {
        if(n<=0)
        {
            return false;
        }
        if(n==1)
        {
            return true;
        }
        if(n%3==0)
        {
            return isPowerOfThree(n/3);
        }
        return false;
    }
     */
     
      /*
    //Problem 231
    public static boolean isPowerOfTwo(int n) {
    if(n<=0)
    {
       return false;
    }
    if(n==1)
    {
        return true;
    }
    if(n%2==0)
    {
       return isPowerOfTwo(n/2);
    }
        return false;
    }
     */
     
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
     Problem Code:FIBXOR01
     static int spfib(int n)
    {
        if(n==0)
        {
            return 'a';
        }
        else if(n==1)
        {
            return 'b';
        }
            return spfib(n-1)^spfib(n-2);
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
    
     /*
    static int length(String str)
    {
        if (str.equals(""))
            return 0;
        else
            return length(str.substring(1)) + 1;

    }
     */
     
      /*
    static void bubblerecursion(int arr[],int n)
    {
        if(n==1)
        {
            return ;
        }
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        bubblerecursion(arr,n-1);
    }
     */
     
      /*
    static int sumrecursion(int number)
    {
    if(number==0)
    {
        return 0;
    }
    return number%10+sumrecursion(number/10);
    }
     */

    /*
    static int productrecursion(int a, int b)
    {
        if (a < b)
            return productrecursion(b, a);

            // iteratively calculate
            // y times sum of x
        else if (b != 0)
            return (a + productrecursion(a, b - 1));

            // if any of the two numbers is
            // zero return zero
        else
            return 0;
    }
     */
     
     /*
    static boolean prime(int n,int i)
    {
        if(n<=2){
            return (n==2);
        }
        if(n%i==0){
            return false;
        }
        if(i*i>n) {
            return true;
        }
        return prime(n,i+1);
    }
     */

    /*
    static int recursum(int n)
    {
        if(n==1)
        {
            return n;
        }
        return n+recursum(n-1);
    }
     */
     
      /*
    public static int factorial(int n) {
    if(n==1 || n==0)
    {
        return 1;
    }
    return n*factorial(n-1);
    }
     */
     
     /*
    static int isSorted(int [] arr , int n)
    {
        if (n == 1 || n == 0)
            return 1;

        // Unsorted pair found (Equal values allowed)
        if (arr[n - 1] < arr[n - 2])
            return 0;

        // Last pair was sorted
        // Keep on checking
        return isSorted(arr, n - 1);
    }
   */
     
     /*
    public static int sum=0;
    static void reverse(int n)
    {
        if(n==0) {
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        reverse(n/10);
    }
    */
     
     /*
    public static int count=0;
    static void countz(int n)
    {
        if(n==0){
            return ;
        }
        if(n%10==0){
            count++;
        }
        countz(n/10);
    }
     */

    /*
    public static boolean sorted(int [] arr,int i)
    {
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && sorted(arr,i+1);
    }
    */
     
      /*
    public static int linsea(int [] arr,int target,int i)
    {
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target)
        {
        return i;
        }
        else
        {
        return target==arr[i] || linsea(arr,target,i+1);
        }
    }
     */
     
      /*
    static ArrayList<Integer> list = new ArrayList<>();
    public static void findallindex(int [] arr,int target,int i)
    {
        if(i==arr.length){
            return ;
        }
        if(arr[i]==target)
        {
        list.add(i);
        }
        findallindex(arr,target,i+1);
    }
    */
     
      /*
    public static int searchrotatedsorted(int [] arr,int target , int s, int e)
    {
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid]== target){
            return mid;
        }

        if(arr[s]<=arr[mid]){
            if(target>=arr[s] && target<=arr[mid]){
                return searchrotatedsorted(arr,target,s,mid-1);
            }
            else{
                return searchrotatedsorted(arr,target,mid+1,e);
            }
        }
        if (target >= arr[mid] && target<=arr[e]) {
            return searchrotatedsorted(arr,target,mid+1,e);
        }
            return searchrotatedsorted(arr,target,s,mid-1);
    }
*/

    
}
