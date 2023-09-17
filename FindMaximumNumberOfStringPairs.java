package leetcode;

import java.util.ArrayList;
import java.util.HashSet;

public class FindMaximumNumberOfStringPairs {
    //https://leetcode.com/problems/find-maximum-number-of-string-pairs/
    public static void main(String[] args) {

    }
    class Solution {
        public int maximumNumberOfStringPairs(String[] words) {

            HashSet<String> reversedSet = new HashSet<>();
            int count =0;

            for(String str : words){
                String rev = new StringBuilder(str).reverse().toString();
                if (reversedSet.contains(rev)) {
                    count++;
                    reversedSet.remove(rev);
                } else {
                    reversedSet.add(str);
                }
            }

            return count;

        }
    }
}
