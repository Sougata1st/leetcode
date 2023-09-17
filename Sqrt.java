package leetcode;

public class Sqrt {
    //https://leetcode.com/problems/sqrtx/description/
    public static void main(String[] args) {
        System.out.println(Solution.mySqrt(9));
    }
    class Solution {
        public static int mySqrt(int x) {
            return (int) Math.sqrt(x);
        }
    }
}
