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
    
    
    /* public static int findDuplicate(int[] nums) {
        int i=0;
        int ans=0;
        while(i<nums.length)
        {
            int correct = nums[i];
            if(nums[i] != nums[correct])
            {
                swap(nums,i,correct);
            }
            else if(nums[i]==nums[correct])
            {
                ans=nums[i];
                break;
            }
            else
            {
                i++;
            }
        }

        return ans;
    }
*/
    /*
   public static void swap (int[] arr,int a , int b)
   {
       int temp=arr[a];
       arr[a]=arr[b];
       arr[b]=temp;
   }

     */
/*
   public static int sort (int [] nums)
   {
       int i=0;
       while(i<nums.length)
       {
           int correct = nums[i];
           if(nums[i] <nums.length && nums[i] != nums[correct])
           {
               swap(nums,i,correct);
           }
           else
           {
               i++;
           }
       }
       for (int j = 0; j < nums.length ; j++) {
           {
               if(nums[j] != j)
                   return j;
           }
       }
       return nums.length;
   }
*/


}
