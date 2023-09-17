package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumOfTwoLists {
    //https://leetcode.com/problems/minimum-index-sum-of-two-lists/description/
    public static void main(String[] args) {

    }
    class Solution {
        public String[] findRestaurant(String[] list1, String[] list2) {
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < list1.length; i++) {
                map.put(list1[i], i);
            }

            List<String> result = new ArrayList<>();
            int minIndexSum = Integer.MAX_VALUE;

            for (int j = 0; j < list2.length; j++) {
                if (map.containsKey(list2[j])) {
                    int indexSum = j + map.get(list2[j]);
                    if (indexSum < minIndexSum) {
                        minIndexSum = indexSum;
                        result.clear();
                        result.add(list2[j]);
                    } else if (indexSum == minIndexSum) {
                        result.add(list2[j]);
                    }
                }
            }

            return result.toArray(new String[result.size()]);
        }
    }
}
