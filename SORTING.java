package com.company.UPLOAD;

public class SORTING {

    /*
    public static int findMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correct = nums[i]-1;
            if(nums[i]>0 && nums[i] <nums.length && nums[i] != nums[correct])
            {
                swap(nums,i,correct);
            }
            else
                i++;
        }
        for (int j = 0; j <nums.length ; j++) {
            if(nums[j]!=j+1)
            {
                return j+1;
            }
        }
        return 1;
    }

     */

/*
    public static int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correct = nums[i]-1;
            if(nums[i] != nums[correct])
            {
                swap(nums,i,correct);
            }
            else
                i++;
        }
        for (int j = 0; j <nums.length ; j++) {
            if(nums[j]!=j+1)
            {
                return new int [] {nums[j] , (j+1) };
            }

        }
        return new int [] {-1,-1};
    }
*/

/*
    public static List<Integer> findDuplicate(int[] nums) {
        int i=0;
        ArrayList<Integer> al = new ArrayList<>();
        while(i<nums.length)
        {
            int correct = nums[i]-1;
            if(nums[i] != nums[correct])
            {
                swap(nums,i,correct);
            }
            else
            {
                i++;
            }

        }
        for (int j = 0; j <nums.length ; j++) {
            if(nums[j]!=j+1)
                al.add(nums[j]);
        }
        return al;
    }

 */


}
