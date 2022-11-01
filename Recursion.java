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
    public static int findTheWinner(int n, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        int start = 0, check = 1;
        for (int i = 1; i <= n; i++) {
            al.add(i);
        }
        return resultTheWinner(al, k, start, check);
    }
    public static int resultTheWinner(ArrayList<Integer> al,int k,int start,int check)
    {
        if(al.size()==1){
            return al.get(0);
        }
        if(start>=al.size())
            start=0;
        if(check==k){
            al.remove(start);
            check=1;
            return resultTheWinner(al,k,start,check);
        }
         else{
            check++;
            start++;
            return resultTheWinner(al,k,start,check);
        }
    }
     */
     
     /*
    public static int[] mergesort(int [] arr)
    {
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int [] left=mergesort(Arrays.copyOfRange(arr,0,mid));
        int [] right=mergesort(Arrays.copyOfRange(arr,mid,arr.length);
        return merge(left,right);
    }
    public static int [] merge(int [] first, int [] second)
    {
        int [] mix=new int[first.length+ second.length];
        int i=0,j=0,k=0;
        while(i< first.length && j< second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else{
                mix[k]= second[j];
                j++;
            }k++;
        }
        while(i< first.length){
            mix[k]= first[i];
            k++; i++;
        }
        while(j< second.length){
            mix[k]= second[j];
            k++; j++;
        }
    return mix;
    }
    */
     
      /*
    // Quicksort
    public static void quicksort(int [] arr , int low , int high)
    {
        if(low>=high)  {
            return;
        }
        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        quicksort(arr,low,e);
        quicksort(arr,s,high);
    }
    */

     /*
        // Replace every array element with the product of every other element
        // without using a division operator
        public static int findProduct(int[] arr, int n, int left, int i)
        {// base case: no elements left on the right
        if (i == n) {
            return 1;
        }
        // take backup of the current element
        int curr = arr[i];
        // calculate the product of the right subarray
        int right = findProduct(arr, n, left * arr[i], i + 1);
        // replace the current element with the product of the left and right subarray
        arr[i] = left * right;
        // return product of right the subarray, including the current element
        return curr * right;
    }
     */
     
      /*
    // **** *** ** * This Pattern Using Recursion 1
    public static void pattern(int r,int c)
    {
        if(r==0){
            return;
        }
      if(r>c){
          System.out.print("*");
          pattern(r,c+1);
      }
      else{
          System.out.println();
          pattern(r-1,0);
      }
    }
*/
     
      /*
    public static void mergesortinplace(int [] arr, int s, int e)
    {
        if(e-s==1){
            return;
        }
        int mid=(s+e)/2;
        mergesortinplace(arr,0,mid);
        mergesortinplace(arr,mid,e);

        mergeinplace(arr,s,mid,e);
    }
    public static void mergeinplace(int [] arr, int s, int mid, int e)   {
        int [] mix=new int[e-s];
        int i=s,j=mid,k=0;
        while(i< mid && j< e) {
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]= arr[j];
                j++;
            }k++;
        }
        while(i< mid){
            mix[k]= arr[i];
            k++; i++;
        }
        while(j< e){
            mix[k]= arr[j];
            k++; j++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l]=mix[l];
        }
    }
*/
     
      /*
    FInding Prime Between 0 and N
    public static boolean Isprime(int n)
    {
        int c=2;
        while(c*c<=n)
        {
            if(n%c==0)
            {
                return false;
            }
            c++;
        }
        return true;
    }
     */

    /*
    // Reversing A String Using Recursion
    static void recursiveReverse(char[] str, int i)
    {
        int n = str.length;
        if (i == n / 2)
            return;
        swap(str,i,n - i - 1);
        recursiveReverse(str, i + 1);
    }
    static void swap(char []arr, int i, int j)
    {
        char temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    */
     
      /*
    // Add elements of two arrays into a new array
    public static void split_number(int num, List<Integer> result)
    {
        if (num > 0){
            split_number(num/10, result);
            result.add(num % 10);
        }
    }
    public static void add(int[] a, int[] b, List<Integer> result)
    {
        int m = a.length, n = b.length;
        // loop till either `a` or `b` runs out
        int i = 0;
        while (i < m && i < n){
            // get the sum of the next element from each array
            int sum = a[i] + b[i];
            // separate the digits of the sum and add them to the output list
            split_number(sum, result);
            i++;
        }
        // process remaining elements of the first list, if any
        while (i < m) {
            split_number(a[i++], result);
        }
        // process remaining elements of the second list, if any
        while (i < n) {
            split_number(b[i++], result);
        }
    }
*/

      /*
    // Find the smallest missing element from a sorted array
    private static int smallMissing(int[] nums , int left ,int right) {
    if(left>right){
        return left;
    }
    int mid= left+(right-left)/2;
    if(nums[mid]==mid){
        return smallMissing(nums,mid+1,right);
    }
    else{
        return smallMissing(nums,left,mid-1);
    }}
*/

       /*
    // Find the peak element in an array Using Recursion
    public static int findPeakElement(int[] nums, int left, int right)
    {
        // find the middle element. To avoid overflow, use mid = low + (high - low) / 2
        int mid = (left + right) / 2;
        // check if the middle element is greater than its neighbors
        if ((mid == 0 || nums[mid - 1] <= nums[mid]) &&
                (mid == nums.length - 1 || nums[mid + 1] <= nums[mid])) {
            return mid;
        }
        // If the left neighbor of `mid` is greater than the middle element,
        // find the peak recursively in the left subarray
        if (mid - 1 >= 0 && nums[mid - 1] > nums[mid]) {
            return findPeakElement(nums, left, mid - 1);
        }
        // If the right neighbor of `mid` is greater than the middle element,
        // find the peak recursively in the right subarray
        return findPeakElement(nums, mid + 1, right);
    }
    public static int findPeakElement(int[] nums)
    {
        // base case
        if (nums == null || nums.length == 0) {
            System.exit(-1);
        }
        int index = findPeakElement(nums, 0, nums.length - 1);
        return nums[index];
    }
*/

    /*
    // Determine whether a string is a palindrome or not
    private static boolean isPalindrome(String s , int st ,int e) {
        if(st>e){
            return true;
        }
        if(s.charAt(st)!=s.charAt(e)){
            return false;
        }
        return isPalindrome(s,(st+1),(e-1));
    }
     */
     
      /*
    // Remove adjacent duplicate characters from a string
    static StringBuilder sb = new StringBuilder();
    private static String removeAdjacent(String s, int st) {
        // Base Condition
        if(st==s.length()-1){
        return sb.toString();
        }

        if(st==1){
            sb.append(s.charAt(0));
        }
        if(s.charAt(st)!=s.charAt(st-1)){
            sb.append(s.charAt(st));
        }
        return removeAdjacent(s,st+1);
    }
    */

    /*
    // Reverse a string using recursion
    private static String reverse(String s , int st , String rev) {
        if(st<0)  {
            return rev;
        }
        rev=rev+s.charAt(st);
        return reverse(s,st-1,rev);
    }
    */

      /*
    // Skipping A String In Another String
    private static String skipString(String s1, String s2,int len) {
        if(s1.isEmpty()){
        return "";
        }
        if(s1.startsWith(s2))  {
        return skipString(s1.substring(len),s2,len);
        }
        else {
            return s1.charAt(0)+skipString(s1.substring(1),s2,len);
        }
    }
    */

   
      /*
    // * ** *** **** pattern using Recursion 2
    public static void pattern(int r,int c)
    {
        if(r==0){
            return;
        }
        if(r>c){
            pattern(r,c+1);
            System.out.print("*");
        }
        else{
            pattern(r-1,0);
            System.out.println();
        }
    }
     */

    /*
    public static void bubblesort(int [] arr , int r,int c)
    {
        if(r==0){
            return;
        }
        if(r>c){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubblesort(arr,r,c+1);
        }
        else{
            bubblesort(arr,r-1,0);
        }
    }
*/
     
      /*
    //Recursive Digit Sum // Hackerrank
    public static int superDigit(String n, int k) {
        if (n.length() > 1){
            long sum = 0;
            for (int i = 0; i < n.length(); i++){
                sum += Character.getNumericValue(n.charAt(i));
            }
            return superDigit(Long.toString(sum * k), 1);
        }
        else   {
            return Character.getNumericValue(n.charAt(0));

        }
    }
     */

    /*
    static int count(int N)
    {
       if(N==0){
           return 1;
       }
       int ans=0;
        for(int i=0;i<N;i+=2){
            ans+= count(i)*count(N-2-i);
        }
        return ans;
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
    public static void selectionsort(int [] arr , int r, int c,int max)
    {
        if(r==0){
            return;
        }
        if(r>c){
            if(arr[c]>arr[max]){
                selectionsort(arr,r,c+1,c);
            }
            else
            {
                selectionsort(arr,r,c+1,max);
            }
        }
        else{
            int temp=arr[r-1];
            arr[r-1]=arr[max];
            arr[max]=temp;
            selectionsort(arr,r-1,0,0);
        }
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
