package leetcode;

public class NumberOfSeniorCitizens {
    //https://leetcode.com/problems/number-of-senior-citizens/description/
    public static void main(String[] args) {

    }
    class Solution {
        public int countSeniors(String[] details) {
            int ans = 0;
            for(String str : details){
                String age = str.substring(11,13);
                int ref = Integer.parseInt(age);
                if(ref>60){
                    ans++;
                }
            }
            return ans;
        }
    }
}
