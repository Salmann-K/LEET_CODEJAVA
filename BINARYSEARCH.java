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
  
  
}
