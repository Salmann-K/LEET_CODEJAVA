package com.company.UPLOAD;

public class BINARYSEARCH {
  
   /*
    Problem 374
    public static int guessNumber(int n) {
        int s=1,e=n;
        while(s<=e){
            int pick=s+(e-s)/2;
            if(guess(pick)==0)return pick;
            else if(guess(pick)==-1)e=pick-1;
            else s=pick+1;
        }
        return -1;
    }
     */

    /*
    Problem 278
      public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while(start<end){
            int mid  = start+(end -start)/2; //find mid value
            if(isBadVersion(mid)){
                end = mid;
            }

            else{
                start = mid+1;
            }
        }
        return start;
    }
     */

    /*
    Problem 167
    public static int[] twoSum(int[] numbers, int target) {
        int first = -1;
        int second = -1;
        int i=0;
        int j=numbers.length-1;
        int [] ans= new int[2];
        while(i<j){
            if(numbers[i] + numbers[j] == target){
                ans[0] = i+1;
                ans[1] = j+1;
                break;
            }
            else if(numbers[i] + numbers[j] < target)
                i++;
            else
                j--;
        }
        return ans;
    }
     */
  
  
    /*
    Problem 367
       public static boolean isPerfectSquare(int num) {
        if(num == 0 || num ==1) return true;
        int n = 1;
        while(num > 0){
            num-=n;
            n+=2;
        }
        return num == 0;
    }
     */

    /*
    Problem 441
     public static int arrangeCoins(int n) {
        int nums = 0;
        int i = 1;
        while(i <= n) {
            nums++;
            n = n - i;
            i++;}
        return nums;
    } */
    /*
    Problem 1539
     public static int findKthPositive(int[] arr, int k) {
        int j = 1;int i = 0;
        while(true){
            if(i<arr.length && arr[i]==j)
                i++;
            else{
                k--;}
            if(k==0)
                break;
            j++;}
        return j;}
     */
  
          /*
    Problem 35
     public static int searchInsert(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            if (nums[i] >= target)return i;
        }
        return nums.length;}
     */
    /*
    Problem 852
     public static int peakIndexInMountainArray(int[] arr) {
        int ans=0;
        for (int i = 1; i <arr.length ; i++) {
            if((arr[i]>arr[i-1] ) && ( arr[i]>arr[i+1])) {
                ans=i;
            }  }
        return ans; }
     */
  
        /*
    Problem 1351
      public static int countNegatives(int[][] grid) {
        int count=0;
        for (int[] ints : grid) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] < 0)
                    count++; } }
        return count; }
     */
    /*
    Problem 1346
    public static boolean checkIfExist(int[] arr) {
        boolean b=false;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if(i!=j){
                    if(i>=0 & j<arr.length){
                        if(arr[i]==2*arr[j])
                        {b=true;
                        } } } } }
        return b;
    }
     */
    /*
    Problem 1608
      public static int specialArray(int[] nums) {
        Arrays.sort(nums);
        if(nums[0] >= nums.length) return nums.length;
        for (int i = 1; i <= nums.length - 1; i++) {
            int count = nums.length - i;
            if(nums[i] >= count && nums[i - 1] < count) {
                return count;  } }
        return -1; }
     */


        /*
    Problem 704
      public static int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1; }
     */

  
}
