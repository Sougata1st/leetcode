package leetcode;

import java.util.HashSet;

public class SubarrayWith0sum {
    //https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1
    public static void main(String[] args) {

    }
    class Solution{
        //Function to check whether there is a subarray present with 0-sum or not.
        static boolean findsum(int arr[],int n)
        {
            int prefixSum =0;
            HashSet<Integer> set = new HashSet<>();
            for(int i : arr){
                prefixSum+=i;
                if(prefixSum==0){
                    return true;
                }
                if(set.contains(prefixSum)){
                    return true;
                }
                set.add(prefixSum);
            }
            return false;
        }
    }
}
