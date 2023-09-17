package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ShortestCompletingWord {
    //https://leetcode.com/problems/shortest-completing-word/
    public static void main(String[] args) {
        System.out.println(Solution.shortestCompletingWord("Ah71752", new String[]{"suggest", "letter", "of", "husband", "easy", "education", "drug", "prevent", "writer", "old"}));
    }

    class Solution {
        public static String shortestCompletingWord(String licensePlate, String[] words) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (char c : licensePlate.toCharArray()) {
                if (Character.isLetter(c)) {
                    char ch = Character.toLowerCase(c);
                    map.put(ch, map.getOrDefault(ch, 0) + 1);
                }
            }
            ArrayList<String> list = new ArrayList<>();
            for (String str : words) {
                HashMap<Character, Integer> map2 = new HashMap<>(map);

                for (char c : str.toCharArray()) {
                    if (map2.getOrDefault(c, 0) > 0) {
                        map2.put(c, map2.getOrDefault(c, 0) - 1);
                    }

                    if (map2.getOrDefault(c, 0) <= 0) {
                        map2.remove(c);
                    }

                }
                if (map2.size() == 0) {
                    list.add(str);
                }
            }

            Collections.sort(list, (s1, s2) -> {
                return Integer.compare(s1.length(), s2.length());
            });
            // Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
            return list.get(0);
        }
    }


}
