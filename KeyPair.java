package leetcode;

import java.util.HashSet;

public class KeyPair {
    //https://practice.geeksforgeeks.org/problems/key-pair5616/1
    public static void main(String[] args) {

    }
    class Solution {
        boolean hasArrayTwoCandidates(int arr[], int n, int x) {
            // code here
            HashSet<Integer> set = new HashSet<>();
            for(int i : arr){
                int diff = (x-i);
                if(set.contains(diff)){
                    return true;
                }
                set.add(i);
            }
            return false;
        }
    }
}
