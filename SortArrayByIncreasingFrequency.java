package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortArrayByIncreasingFrequency {
    // Sort Array by Increasing Frequency
    public static void main(String[] args) {

    }
    class Solution {
        public int[] frequencySort(int[] nums) {
            Map<Integer, Integer> umap = new HashMap<>();
            for (int x : nums) {
                umap.put(x, umap.getOrDefault(x, 0) + 1);
            }

            Integer[] numsWrapper = new Integer[nums.length];
            for (int i = 0; i < nums.length; i++) {
                numsWrapper[i] = nums[i];
            }

            Arrays.sort(numsWrapper, (a, b) -> {
                if (umap.get(a).equals(umap.get(b))) {
                    return Integer.compare(b, a);
                } else {
                    return Integer.compare(umap.get(a), umap.get(b));
                }
            });

            for (int i = 0; i < nums.length; i++) {
                nums[i] = numsWrapper[i];
            }

            return nums;
        }
    }
}
