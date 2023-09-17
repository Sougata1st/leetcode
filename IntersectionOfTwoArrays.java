package leetcode;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    //https://leetcode.com/problems/intersection-of-two-arrays/description/
    public static void main(String[] args) {

    }

    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set = new HashSet<>();
            Set<Integer> intersect = new HashSet<>();

            // Store elements of nums1 in the set
            for (int num : nums1) {
                set.add(num);
            }

            // Check for common elements in nums2 and the set
            for (int num : nums2) {
                if (set.contains(num)) {
                    intersect.add(num);
                }
            }

            // Convert the result set to an array
            int[] result = new int[intersect.size()];
            int index = 0;
            for (int num : intersect) {
                result[index++] = num;
            }

            return result;
        }
    }

}
