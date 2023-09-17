package leetcode;

public class MissingNumber {
    //https://leetcode.com/problems/missing-number/
    public static void main(String[] args) {

    }
    class Solution {
        public int missingNumber(int[] arr) {
            int totalSum =0;
            for(int i : arr){
                totalSum+=i;
            }
            int n= arr.length;
            int sum = n*(n+1)/2;
            return sum -totalSum;
        }
    }
}
