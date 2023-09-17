package leetcode;

public class CountTheNumberOfVowelStringsInRange {
    //https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/
    public static void main(String[] args) {

    }
    class Solution {
        public int vowelStrings(String[] words, int left, int right) {
            int i = left,count=0;
            while(i<= right){
                String str = words[i];

                if(isVowel(str)){
                    count++;
                }

                i++;
            }

            return count;
        }
        boolean isVowel(String str){
            char start = str.charAt(0);
            char end = str.charAt(str.length()-1);
            if((start=='a'||start=='e'||start=='i'||start=='o'||start=='u')&&
                    (end=='a'||end=='e'||end=='i'||end=='o'||end=='u')){
                return true;
            }
            return false;
        }
    }
}
