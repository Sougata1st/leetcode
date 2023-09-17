package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RelativeSortArray {
    //https://leetcode.com/problems/relative-sort-array/description/
    public static void main(String[] args) {

    }
    class Solution {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            List<Integer> ans = new ArrayList<>();

            Map<Integer, Integer> mp = new HashMap<>();
            for (int x : arr1) {
                mp.put(x, mp.getOrDefault(x, 0) + 1);
            }

            for (int temp : arr2) {
                if (mp.containsKey(temp)) {
                    int count = mp.get(temp);
                    for (int i = 0; i < count; i++) {
                        ans.add(temp);
                    }
                    mp.remove(temp);
                }
            }

            List<Integer> remaining = new ArrayList<>();
            for (int ele : mp.keySet()) {
                int count = mp.get(ele);
                for (int i = 0; i < count; i++) {
                    remaining.add(ele);
                }
            }

            remaining.sort(null);
            ans.addAll(remaining);

            // Convert the ArrayList<Integer> to int[]
            int[] result = new int[ans.size()];
            for (int i = 0; i < ans.size(); i++) {
                result[i] = ans.get(i);
            }

            return result;
        }
    }

}
