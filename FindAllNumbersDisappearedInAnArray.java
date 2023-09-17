package leetcode;

import java.util.*;

public class FindAllNumbersDisappearedInAnArray {
    //https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    public static void main(String[] args) {
        System.out.println(Solution.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }
    class Solution {
        public static List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> result = new ArrayList<>();
            int n = nums.length;

            // Mark elements as negative based on their absolute value
            for (int num : nums) {
                int index = Math.abs(num) - 1;
                nums[index] = -Math.abs(nums[index]);
            }

            // The elements that are still positive indicate missing numbers
            for (int i = 0; i < n; i++) {
                if (nums[i] > 0) {
                    result.add(i + 1);
                }
            }

            return result;
        }
    }
}
