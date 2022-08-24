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


}
