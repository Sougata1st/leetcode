package leetcode;

public class SearchInsertPosition {
    //https://leetcode.com/problems/search-insert-position/description/
    public static void main(String[] args) {

    }
    class Solution {
        public int searchInsert(int[] nums, int target) {

            for(int i =0; i< nums.length; i++){

                if(target > nums[nums.length -1]){
                    return nums.length;
                }

                if(nums[i] == target){
                    return i;
                }else if(nums[i] > target){
                    return i;
                }
            }
            return 0;
        }
    }
}
