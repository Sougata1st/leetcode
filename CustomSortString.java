package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CustomSortString {
    public static void main(String[] args) {

        System.out.println(findDuplicate_mark(new int[]{1,3,4,2,2}));

    }
    public static int findDuplicate_mark(int[] nums) {
        int len = nums.length;
        for (int num : nums) {
            int idx = Math.abs(num);
            //System.out.println(idx);
            if (nums[idx] < 0) {
                return idx;
            }
            nums[idx] = -nums[idx];
        }

        return len;
    }

}
