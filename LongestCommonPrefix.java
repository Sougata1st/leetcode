package leetcode;

public class LongestCommonPrefix {
    //https://leetcode.com/problems/longest-common-prefix/
    public static void main(String[] args) {
       String array[]={"flow","flower","flight"};
        System.out.println(Solution.longestCommonPrefix(array));
    }
    class Solution {
        public static String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) {
                return "";
            }

            String prefix = strs[0];

            for (int i = 1; i < strs.length; i++) {
                while (strs[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) {
                        return "";
                    }
                }
            }

            return prefix;
        }
    }

}
