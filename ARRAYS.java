package com.company.UPLOAD;

public class ARRAYS {
 /*
    Problem 1929
     public int[] getConcatenation(int[] nums) {
         int [] cn1 = new int[2*nums.length];
        for(int i=0; i<nums.length; i++)
        {
            cn1[i]=nums[i];
            cn1[i+nums.length]=nums[i];
        }
        return cn1;
    }
     */

    /*
    Problem 1480
    public static int[] runningSum(int[] nums) {
        int [] runsum = new int[nums.length];
        runsum[0]=nums[0];
        for(int i=1; i<nums.length; i++)
        {
            runsum[i]= runsum[i-1] + nums[i] ;
        }
        return runsum;
    }
     */

    /*
    Problem 1672
      public static int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i< accounts.length; i++)
        {
            sum=0;
            for(int j=0; j<accounts[i].length; j++)
            {
                sum= sum + accounts[i][j];
            }
            if(sum>max)
            {
                max=sum;
            }
        }
        return max;
    }
     */

    /*
    Problem 1512
    public int numIdenticalPairs(int[] nums) {
      int count = 0;
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i]==nums[j])
                    count++;
            }
        }
        return count;
    }
     */

    /*
    Problem 1365
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int count;
        int[] sol = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j])
                    count++;
            }
            sol[i] = count;
        }
        return sol;
    }
     */

    /*
    Problem 1732
     public static int largestAltitude(int[] gain) {
        int [] altitude = new int[(gain.length+1)];
        int max=0;
        for(int i =0; i<(gain.length+1); i++)
        {
            for (int j=0; j<(i); j++)
                altitude[i]= altitude[i]+gain[j];
            if(altitude[i]>max)
                max=altitude[i];
        }
        return max;
    }
     */

      /*
    Problem 832
        public static int[][] flipAndInvertImage(int[][] image) {
        int [][] image2 = new int[image.length][image.length];
        for(int i =0; i<image.length; i++)
        {
            for (int j=0; j<image[i].length; j++)
            {
                image2[i][image[0].length-1 - j] = (image[i][j]==0) ? 1 : 0;
            }
        }
        return image2;
    }
     */

    /*
    Problem 1572
      public static int diagonalSum(int[][] mat) {
        int sum=0;
        if( (mat.length&1) ==1)
        {
            sum-=mat[mat.length/2][mat.length/2];
        }
        for(int i=0; i<mat.length; i++)
        {
            sum += mat[i][i];
            sum+=mat[i][mat[i].length-1-i];
        }
       return sum;
    }
     */
 
   
    /*
    Problem 867
     public static int[][] transpose(int[][] matrix) {
        int[][] ans=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
     */

    /*
    Problem 1
     public static int[] twoSum(int[] nums, int target) {
        for(int i=1; i<nums.length; i++) {
            for(int j=i; j<nums.length; j++) {
                if (nums[j-i]+nums[j] == target) {
                    return new int[]{j-i,j};
                }
            }
        }
        return null;
        }
     */

    /*
    Problem 1304
    public static int[] sumZero(int n) {
        if(n == 1)
            return new int[]{0};

        int[] result = new int[n];

        for(int i = 0; i < n-1; i+=2) {
            result[i] = i + 1;
            result[i+1] = (i + 1) * -1;
        }
        return result;
    }
     */

    /*
    Problem 66
  public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i] ==9){
                digits[i]=0;
            }else{
                digits[i]++;
                return digits;
            }
        }
        int[] res = new int[digits.length+1];
        res[0]=1;
        return res;
    }
     */

    /*
    Problem 54
    public static List<Integer> spiralOrder(int[][] matrix) {
        int tne=matrix.length*matrix[0].length;
        int rowmin=0, colmin=0, colmax=matrix[0].length-1, rowmax=matrix.length-1;
        int count=0;
        List<Integer> ans=new ArrayList<>();
        while(count<tne){
            //top wall
            for(int i=colmin; i<=colmax && count<tne; i++){
                ans.add(matrix[rowmin][i]);
                count++;
            }
            rowmin++;

            //right wall
            for(int i=rowmin; i<=rowmax && count<tne; i++){
                ans.add(matrix[i][colmax]);
                count++;
            }
            colmax--;

            //bottom wall
            for(int i=colmax; i>=colmin && count<tne; i--){
                ans.add(matrix[rowmax][i]);
                count++;
            }
            rowmax--;

            //left wall
            for(int i=rowmax; i>=rowmin && count<tne;i--){
                ans.add(matrix[i][colmin]);
                count++;
            }
            colmin++;
        }
        return ans;
    }
     */

    
    /*
    Problem 59
    public static int[][] generateMatrix(int n) {
        int rowmin = 0, colmin = 0, colmax = n - 1, rowmax = n - 1;
        int[][] matrix = new int[n][n];
        int tne = n * n,int count = 0,val = 1;
        while(count <tne)
        {
            for (int i = colmin; i <= colmax & count < tne; i++) {
                matrix[rowmin][i] = val++;
                count++;
            }
            rowmin++;
            for (int i = rowmin; i <= rowmax && count < tne; i++) {
                matrix[i][colmax] = val++;
                count++;
            }
            colmax--;
            for (int i = colmax; i >= colmin & count < tne; i--) {
                matrix[rowmax][i] = val++;
                count++;
            }
            rowmax--;
            for (int i = rowmax; i >= rowmin & count < tne; i--) {
                matrix[i][colmin] = val++;
                count++;
            }
            colmin++;
        }
        return matrix;
    }
     */
 
      
    /*
    Problem 238
    public static int[] productExceptSelf(int[] nums) {
        int [] ans = new int[nums.length];
        int temp=1;
        for(int i=0; i<nums.length; i++)
        {ans[i]=temp;
            temp *=nums[i];
        }temp=1;
        for(int i=nums.length-1; i>=0; i--)
        {   ans[i] *= temp;
            temp *= nums[i];
        }
        return ans;
    }
     */

    /*
    Problem 55
     public static boolean canJump(int[] nums) {
        int ls = nums.length-1;
        for(int i=nums.length-1; i>=0; i--)
        {
            if(i+nums[i]>=ls)
                ls = i;
        }
        return ls==0;
    }
     */

    /*
    Problem 198
      public static int rob(int[] nums) {
        int [] sums = new int[nums.length];
        int max = sums[0];
        for (int i = 0; i < nums.length; i ++) {
            sums[i] = nums[i];
            max = Math.max(max, sums[i]);
        }
        if (nums.length > 1) {
            sums[1] = Math.max(sums[0], sums[1]);
        }
        for (int i = 2; i < nums.length; i ++) {
            sums[i] = Math.max(sums[i - 2] + sums[i], sums[i - 1]);
            max = Math.max(max, sums[i]);
        }

        return max;
    }
     */
 
       /*
    Problem 1886
    public static boolean findRotation(int[][] mat, int[][] target) {
        int n= mat.length;
    //Checking Matrices Are equal Are not
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(equals(mat, target))
                    return true;
                else
                    rotate(mat);
            }
        }
        return false;
    }
    public static boolean equals(int[][] mat, int[][] target) {
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat.length; j++) {
                if (mat[i][j] != target[i][j])
                    return false;
            }
        }
        return true;
    }
    public static void rotate(int [][] mat)
    {
        int n= mat.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < (n + 1) / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[n - 1 - j][i];
                mat[n - 1 - j][i] = mat[n - 1 - i][n - 1 - j];
                mat[n - 1 - i][n - 1 - j] = mat[j][n - 1 - i];
                mat[j][n - 1 - i] = temp;
            }
        }
    }
     */
 
 
     
    /*
    Problem 1920
    public int[] buildArray(int[] nums) {
        int [] ans = new int[nums.length];
        for (int i = 0; i <nums.length; i++) {
        ans[i]=nums[nums[i]];
        }
        return ans;
    }
     */

    /*
    // Problem 2006
    public static int countKDifference(int[] nums, int k) {
        int count=0;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i; j < nums.length ; j++) {
                if (nums[i]-nums[j]==k || nums[i]-nums[j]==(-k)){
                    count++;
                }}}
        return count;
    }
    */

    /*
    //Problem 2176
    public static int countPairs(int[] nums, int k) {
    int count=0;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i; j < nums.length ; j++) {
                if( (nums[i]==nums[j] && ((i*j)%k==0) ) && i<j  ){
                    count++;
                }}}
        return count;
    }
    */

     
    /*
    //Problem 1534
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
            int i,j,k,count=0;
            for(i=0;i<(arr.length)-2;i++)
                for(j=i+1;j<(arr.length)-1;j++)
                    if(Math.abs(arr[i]-arr[j]) <=a)
                        for(k=j+1;k<arr.length;k++){
                            if(Math.abs(arr[j]-arr[k]) <=b)
                                if(Math.abs(arr[i]-arr[k]) <=c)
                                    count++;
                        }
            return count;
        }
*/

    /*
    Problem 1470
  public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        int k = 0;
        for (int i = 0; i < n; i = i++) {
            res[i] = nums[k];
            res[i + 1] = nums[k + n];
            k++;
        }
        return res;
    }
     */

     
    /*
    Problem 1913
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int max=0,min=0,res=0;
        max=nums[nums.length-1]*nums[nums.length-2];
        min=nums[0]*nums[1];
        return (max-min);
    }
     */

    /*
    // Problem !464
    public int maxProduct(int[] nums) {
    Arrays.sort(nums);
    return ( (nums[nums.length-1]-1) * (nums[nums.length-2]-1) );
    }
     */

    /*
    Problem 2089
    public List<Integer> targetIndices(int[] nums, int target) {
    ArrayList<Integer> res = new ArrayList<>();
    Array.sort(nums);
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]==target){
                res.add(i);
            }}
    return res;
    }
    */

 
 
}
