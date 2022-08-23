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

}
