package leetcode;

public class SumOfSquaresOfSpecialElements {
    //https://leetcode.com/problems/sum-of-squares-of-special-elements/description/
    public static void main(String[] args) {

    }
    class Solution {
        public int sumOfSquares(int[] arr) {
            int ans =0;
            for(int i=1;i<=arr.length;i++){
                if(arr.length%i==0){
                    ans += arr[i-1]*arr[i-1];
                }
            }
            return ans;
        }
    }
}
