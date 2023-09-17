package leetcode;

public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(48%24);
      
    }
    static class Solution {
        public int countPrimes(int n) {
            if(n <=1){
                return 0;
            }
            int count = 2;
            for(int i=n; i>3;i--){
                int temp = i*i;
                --temp;
                if(temp % 24 == 0){
                    count ++;
                }
            }
            return count;
        }
    }
}

