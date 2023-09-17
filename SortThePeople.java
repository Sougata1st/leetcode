package leetcode;

import java.util.Arrays;

public class SortThePeople {
    //https://leetcode.com/problems/sort-the-people/description/
    public static void main(String[] args) {

    }
    class Solution {
        private static class Person {
            String name;
            int height;

            public Person(String name, int height) {
                this.name = name;
                this.height = height;
            }
        }

        public String[] sortPeople(String[] names, int[] heights) {
            int n = names.length;
            Person[] people = new Person[n];

            for (int i = 0; i < n; i++) {
                people[i] = new Person(names[i], heights[i]);
            }

            Arrays.sort(people, (a, b) -> {
                int heightComparison = Integer.compare(b.height, a.height);
                if (heightComparison != 0) {
                    return heightComparison; // Sort by height in descending order
                } else {
                    return a.name.compareTo(b.name); // If heights are the same, sort names lexicographically
                }
            });

            String[] sortedNames = new String[n];
            for (int i = 0; i < n; i++) {
                sortedNames[i] = people[i].name;
            }

            return sortedNames;
        }
    }
}
