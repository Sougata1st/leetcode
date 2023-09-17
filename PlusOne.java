package leetcode;

import java.util.Arrays;

public class PlusOne {
    //https://leetcode.com/problems/plus-one/
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.plusOne(new int[]{10,11,99})));
    }
    class Solution {
        public static int[] plusOne(int[] arr) {
            int carry=1;
            for(int i=arr.length-1;i>=0;i--){
                int tSum=arr[i]+carry;
                arr[i] = tSum%10;
                carry=tSum/10;
            }

            if(carry==1){
                int[] ans =new int[arr.length+1];
                ans[0] = 1;

                for(int i=0;i<arr.length;i++){
                    ans[i+1] = arr[i];
                }
                return ans;
            }

            return arr;

        }
    }
}
