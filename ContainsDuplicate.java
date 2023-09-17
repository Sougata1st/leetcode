package leetcode;

import java.util.HashMap;

public class ContainsDuplicate {
    //https://leetcode.com/problems/contains-duplicate/
    public static void main(String[] args) {

    }
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                if(map.get(nums[i])>=2){
                    return true;
                }
            }
            return false;
        }
    }
}
