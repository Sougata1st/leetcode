package leetcode;

public class SingleNumber {
   //https://leetcode.com/problems/single-number/description/
   public static void main(String[] args) {

   }
    class Solution {
        public int singleNumber(int[] arr) {
            int result = arr[0];
            for(int i=1;i<arr.length;i++){
                result = result^arr[i];

            }
            return result;
        }
    }
}
