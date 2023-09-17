package leetcode;

import java.util.Arrays;

import static leetcode.FindFirstAndLastPositionOfElementInSortedArray.Solution.searchRange;

public class FindFirstAndLastPositionOfElementInSortedArray {
    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    public static void main(String[] args) {
        int[]arr=new int[]{1};
        System.out.println(Arrays.toString(searchRange(arr,1)));
    }
    class Solution {
        public static int[] searchRange(int[] nums, int target) {
            int left =0,right =nums.length-1;
            int ans[]= new int[]{-1,-1};
            while(left<=right){
                if(nums[left]!=target){
                    left++;
                }else{
                    ans[0]=left;
                }
                if(nums[right]!=target){
                    right--;
                }else{
                    ans[1]=right;
                }

                if (ans[0]!=-1&&ans[1]!=-1){
                    break;
                }
            }
            return ans;
        }
    }
}
