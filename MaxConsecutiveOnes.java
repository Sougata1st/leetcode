package leetcode;

public class MaxConsecutiveOnes {
    //https://leetcode.com/problems/max-consecutive-ones/description/
    public static void main(String[] args) {

    }
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int ans =0,length=0,i=0;

            while(i<nums.length){
                if(nums[i]==1){
                    length++;
                }else{
                    length=0;
                }
                i++;
                ans = Math.max(ans,length);
            }

            return ans;
        }
    }
}
