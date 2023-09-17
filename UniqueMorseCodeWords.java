package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueMorseCodeWords {
    //https://leetcode.com/problems/unique-morse-code-words/
    public static void main(String[] args) {

    }
    class Solution {
        public int uniqueMorseRepresentations(String[] words) {
            String[]morseArray= new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

            HashMap<Character,String> map = new HashMap<>();
            for(int i =0;i<=25;i++){
                map.put((char)(97+i),morseArray[i]);
            }

            HashSet<String> set = new HashSet<>();

            for(String str: words){
                String temp="";
                for(char c : str.toCharArray()){
                    temp+=map.get(c);
                }
                set.add(temp);
            }
            return set.size();
        }
    }
}
