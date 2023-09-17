package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MoveZeroes {
    //https://leetcode.com/problems/move-zeroes/description/
    public static void main(String[] args) {

    }
    class Solution {
        public void moveZeroes(int[] arr) {
            int x=0,countZero=0;
            for(int i :arr){
                if(i==0){
                    countZero++;
                }
            }
            for(int i =0;i<arr.length;i++){
                if(arr[i]!=0){
                    arr[x]=arr[i];
                    x++;
                }
            }
            for(int i = arr.length-1;i>arr.length-countZero-1;i--){
                arr[i]=0;
            }
        }
    }
    class Solution2 {
        public void moveZeroes(int[] nums) {
            // Initialize pointer j to track where the next non-zero element will be moved
            int j = 0;

            // Loop through the array
            for (int i = 0; i < nums.length; i++) {
                // If the current element is not zero...
                if (nums[i] != 0) {
                    // Move the non-zero element to the position indicated by j, and then increment j.
                    // As a result, all non-zero elements will be moved towards the front of the array, in the same order they appeared.
                    nums[j] = nums[i];
                    j++;
                }
            }

            // After all non-zero elements have been moved to the front of the array,
            // all remaining positions from index j to the end of the array should be filled with zeros.
            for (int k = j; k < nums.length; k++) {
                nums[k] = 0;
            }
        }
    }
}
