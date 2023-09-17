package leetcode;

public class NumberOfLinesToWriteString {
    //https://leetcode.com/problems/number-of-lines-to-write-string/description/
    public static void main(String[] args) {

    }
    class Solution {
        public int[] numberOfLines(int[] widths, String s) {
            int lines = 1;
            int currentlength=0;
            for(char c : s.toCharArray()){
                int width = widths[c-'a'];
                if(currentlength+width>100){
                    lines++;
                    currentlength=0;
                }
                currentlength+=width;
            }
            return new int[]{lines,currentlength};
        }
    }
}
