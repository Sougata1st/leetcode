package leetcode;

import java.util.*;

public class KeyboardRow {
    //https://leetcode.com/problems/keyboard-row/
    public static void main(String[] args) {

        System.out.println(Arrays.toString(Solution.findWords(new String[]{"Hello","Alaska","Dad","Peace"})));
    }

    class Solution {
        public static String[] findWords(String[] words) {
            Set<Character> row1 = new HashSet<>();
            Set<Character> row2 = new HashSet<>();
            Set<Character> row3 = new HashSet<>();

            // Populate the sets with characters from each row
            for (char c : "qwertyuiop".toCharArray()) {
                row1.add(c);
            }
            for (char c : "asdfghjkl".toCharArray()) {
                row2.add(c);
            }
            for (char c : "zxcvbnm".toCharArray()) {
                row3.add(c);
            }

            List<String> result = new ArrayList<>();
            for (String word : words) {
                String lowercaseWord = word.toLowerCase();
                boolean isRow1 = true, isRow2 = true, isRow3 = true;

                // Check if all characters of the word belong to a single row
                for (char c : lowercaseWord.toCharArray()) {
                    if (!row1.contains(c)) {
                        isRow1 = false;
                    }
                    if (!row2.contains(c)) {
                        isRow2 = false;
                    }
                    if (!row3.contains(c)) {
                        isRow3 = false;
                    }
                }

                if (isRow1 || isRow2 || isRow3) {
                    result.add(word);
                }
            }

            return result.toArray(new String[0]);
        }
    }
}
