package leetcode;

import java.util.Arrays;

public class AssignCookies {
    //https://leetcode.com/problems/assign-cookies/
    public static void main(String[] args) {

    }
    class Solution {
        public int findContentChildren(int[] baby, int[] cookie) {
            Arrays.sort(baby);
            Arrays.sort(cookie);

            int ans = 0;
            int babyIndex = 0;
            int cookieIndex = 0;

            while (babyIndex < baby.length &&
                    cookieIndex < cookie.length) {
                // Check if the current cookie size can satisfy the current baby's greed
                if (cookie[cookieIndex] >= baby[babyIndex]) {
                    ans++;
                    babyIndex++; // Move to the next baby
                }
                cookieIndex++; // Move to the next cookie, regardless of whether it was assigned to a baby or not
            }

            return ans;
        }
    }


}
