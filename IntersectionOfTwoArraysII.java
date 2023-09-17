package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArraysII {
    //https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
    public static void main(String[] args) {

    }
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i: nums1){
                map.put(i,map.getOrDefault(i,0)+1);
            }
            ArrayList<Integer> list = new ArrayList<>();
            for(int i : nums2){
                if(map.getOrDefault(i,0)>0){
                    list.add(i);
                    map.put(i,map.get(i)-1);
                }
            }
            int ans[]= new int[list.size()];
            int x=0;
            for(int i : list){
                ans[x]=i;
                x++;
            }
            return ans;
        }
    }
}
