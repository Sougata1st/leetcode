package leetcode;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    //https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
    //two pointer algo
    public static void main(String[] args) {
        String haystack = "leetcode", needle = "leeto";
        System.out.println(Solution.strStr(haystack,needle));
    }
    class Solution {
        public static int strStr(String haystack, String needle) {
            if (haystack.length()<needle.length()){
                return -1;
            }
            if (haystack.length()==needle.length()&&!haystack.equals(needle)){
                return -1;
            }
            int startIndx=0,endIndx=needle.length();

            while(endIndx<=haystack.length()){
                String substring = haystack.substring(startIndx,endIndx);
                if (substring.equals(needle)){
                    return startIndx;
                }
                startIndx++;
                endIndx++;
            }
            return -1;
        }
    }
}
