package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PairsWithPositiveNegativeValues {
    //https://practice.geeksforgeeks.org/problems/pairs-with-positive-negative-values3719/1
    public static void main(String[] args) {

    }
    class Solution {

        public List<Long> PosNegPair(long a[], long n) {
            Arrays.sort(a);
            HashMap<Long, Long> map = new HashMap<>();
            for (long i : a) {
                map.put(i, map.getOrDefault(i, 0L) + 1L);
            }
            ArrayList<Long> list = new ArrayList<>();
            for (long i : a) {
                long num = i*(-1);
                if (i > 0L && map.getOrDefault(num, 0L) > 0L) {

                    list.add(num);
                    list.add(i);
                    map.put(num, map.get(num) - 1L);
                }
            }
            return list;
        }
    }
}
