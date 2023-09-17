package leetcode;

import java.util.*;

public class ContainsDuplicate_II {
    //https://leetcode.com/problems/contains-duplicate-ii/submissions/
    public static void main(String[] args) {

    }
    class Solution {
        public boolean containsNearbyDuplicate(int[] arr, int k) {

            HashMap<Integer,Integer> map = new HashMap();

            for(int i=0;i<arr.length;i++){

                int currentNum=arr[i];

                if(map.containsKey(currentNum)){
                    int diff =i- map.get(currentNum);
                    if(diff<=k){
                        return true;
                    }
                }
                map.put(currentNum,i);
            }
            return false;
        }
    }

}
