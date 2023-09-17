package leetcode;

public class FindTheDuplicateNumber {
    //https://leetcode.com/problems/find-the-duplicate-number/
    public static void main(String[] args) {

    }
    class Solution {
        public int findDuplicate(int[] nums) {
            for(int i : nums){
                int indx = Math.abs(i);
                if(nums[indx]<0){
                    return indx;
                }
                nums[indx] = - nums[indx];
            }
            return 0;
        }
    }
}
