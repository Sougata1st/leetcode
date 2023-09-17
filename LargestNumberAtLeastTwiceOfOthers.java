package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class LargestNumberAtLeastTwiceOfOthers {
    //https://leetcode.com/problems/largest-number-at-least-twice-of-others/
    public static void main(String[] args) {

    }
    class Solution {
        public int dominantIndex(int[] arr) {

            HashMap<Integer,Integer> map = new HashMap<>();
            int indx=0;
            for(int i: arr){
                map.put(i,indx);
                indx++;
            }

            Arrays.sort(arr);

            int x= arr.length-1;

            if(arr[x]>=2*arr[x-1]){
                return map.get(arr[x]);
            }

            return -1;

        }
    }
}
