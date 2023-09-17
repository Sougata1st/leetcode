package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    //https://leetcode.com/problems/group-anagrams/
    public static void main(String[] args) {

    }

    class Solution {
        public List<List<String>> groupAnagrams(String[] arr) {
            List<List<String>> ans = new ArrayList<>();
            HashMap<String, ArrayList<String>> map = new HashMap<>();
            for (String str : arr) {

                String sorted = sortString(str);

                map.putIfAbsent(sorted, new ArrayList<>());

                map.get(sorted).add(str);
            }
            ans.addAll(map.values());
            return ans;
        }

        String sortString(String str) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            return new String(charArray);
        }
    }
}
