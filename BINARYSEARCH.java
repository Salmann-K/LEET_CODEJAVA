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
      
      
    /*
    Problem 540
      public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (((mid + 1) % 2 == 0 && nums[mid] != nums[mid + 1]) || ((mid + 1) % 2 == 1 && nums[mid] == nums[mid + 1])) start = mid + 1;
            else end = mid;
        }
        return nums[start];
    }
     */

    /*
    Problem 33
      public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while(low<=high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;

            if(nums[low]<=nums[mid]) {
                if (target<nums[mid] && target>=nums[low])
                    high=mid-1;
                else low=mid+1;

            } else {
                if(target>nums[mid] && target<=nums[high]) low=mid+1;
                else high=mid-1;
            }
        }
        return -1;
    }
     */

    /*
    Problem 162
       public static int findPeakElement(int[] nums) {
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if((mid==0 || nums[mid]>=nums[mid-1]) &&
                    (mid==nums.length-1 || nums[mid]>=nums[mid+1]))
                return mid;
            if(mid>0 && nums[mid]<=nums[mid-1])
                high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
     */

      
 
    /*
    Problem 153
      public static int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
     */
  
  
    /*
    Problem 287
 public static int findDuplicate(int[] nums) {
        int ans=0;
        while (true) {
            int num = nums[0];
            if (num == nums[num]) {
                ans=num;
                break;
            }
            int tmp = nums[num];
            nums[num] = num;
            nums[0] = tmp;
        }
        return ans;
    }
     */

    /*
    Problem 18
      public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList();
        if(nums==null || nums.length==0)
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int partial_sum=target-(nums[i]+nums[j]);
                int front=j+1,back=n-1;
                while(front<back){
                    int sum=nums[front]+nums[back];
                    if(sum>partial_sum)
                        back--;
                    else if(sum<partial_sum)
                        front++;
                    else{
                        ArrayList<Integer> quad =new ArrayList<Integer>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[front]);
                        quad.add(nums[back]);
                        res.add(quad);
                        while(front<back&&nums[front]==quad.get(2))++front;
                        while(front<back&& nums[back]==quad.get(3)) --back;
                    }  }
                while(j+1<n&&nums[j]==nums[j+1])
                    ++j; }
            while(i+1<n&&nums[i]==nums[i+1])
                ++i;  }
        return res; }
     */
    /*
    Problem 4
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        int nl=(nums1.length+ nums2.length);
        int [] num3= new int[nl];
        System.arraycopy(nums1,0,num3,0,n1);
        System.arraycopy(nums2,0,num3,n1,n2);
        Arrays.sort(num3);
        float median=0.f;
        if(num3.length%2!=0) {
            int a=(num3.length/2);
            median=num3[a];
        }else {
            int a=(num3.length/2)-1;
            median=(num3[a]+num3[a+1])/2.0f; }
        return median;
    }
     */
  
 
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  ///////////////////////////// BINARY SEARCH IN 2D MATRIX ///////////////////////////////////////////////////////////
  
   static int [] Binarysearch(int[][] matrix, int row, int cStart, int cEnd, int target)
    {
        while(cStart<=cEnd)
        {
            int mid= cStart + (cEnd-cStart)/2;
            if(matrix[row][mid]==target)
            {
                return new int[] {row,mid};
            }
            if(matrix[row][mid]<target)
            {
                cStart=mid+1;
            }
            if(matrix[row][mid]>target)
            {
                cEnd=mid-1;
            }
        }
        return new int []{-1,-1};
    }

    static int [] search(int[][]matrix, int target)
    {
        int rows= matrix.length;
        int col= matrix[0].length;
        if(rows==1)
        {
            return Binarysearch(matrix,0,0,col-1,target);
        }
        int rStart=0;
        int rEnd=rows-1;
        int cMid=col/2;

        while(rStart<(rEnd-1))
        {
            int mid= rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]== target)
            {
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]<target)
            {
                rStart=mid;
            }else
            {
                rStart=mid;
            }

        }
        // Checking in the remaining two rows

        if(matrix[rStart][cMid]==target)
        {
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid]==target)
        {
            return new int[]{rStart+1,cMid};
        }

        // last four part Checking

        if(target<=matrix[rStart][cMid-1])
        {
            return Binarysearch(matrix,rStart,0,cMid-1,target);
        }
        if(target>=matrix[rStart][cMid+1] && target<=matrix[rStart][col-1])
        {
            return Binarysearch(matrix,rStart,cMid+1,col-1,target);
        }
        if(target<=matrix[rStart+1][cMid-1])
        {
            return Binarysearch(matrix,rStart+1,0,cMid-1,target);
        }else
        {
            return Binarysearch(matrix,rStart+1,cMid+1,col-1,target);
        }

    }

  
}
