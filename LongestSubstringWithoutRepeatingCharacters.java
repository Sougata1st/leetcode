package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    //https://leetcode.com/problems/longest-substring-without-repeating-characters/
    //sliding window
    public static void main(String[] args) {
        String str = "abcabcdc";

        System.out.println(Solution.lengthOfLongestSubstring(str));

    }

    static class Solution {
        public static int lengthOfLongestSubstring(String s) {
            int n = s.length();
            int left=0,maxLength=0;
            HashMap<Character,Integer> map = new HashMap<>();
            for(int right =0;right<n;right++){

                char currentChar=s.charAt(right);

                if(map.containsKey(currentChar)){

                    left = Math.max(left,map.get(currentChar)+1);

                }
                map.put(currentChar,right);

                maxLength= Math.max(maxLength,(right-left)+1);

            }
            return maxLength;
        }
    }
}
