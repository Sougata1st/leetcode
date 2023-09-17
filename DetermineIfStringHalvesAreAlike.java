package leetcode;

public class DetermineIfStringHalvesAreAlike {
    //https://leetcode.com/problems/determine-if-string-halves-are-alike/
    public static void main(String[] args) {

    }
    class Solution {
        public boolean halvesAreAlike(String str) {

            String flag = "aeiouAEIOU";
            int length = str.length();
            int mid = length/2;
            String a = str.substring(0,mid);
            String b = str.substring(mid,length);

            int count1=0,count2=0;

            for(int i=0;i<a.length();i++){
                String temp1 = a.charAt(i)+"";
                String temp2 = b.charAt(i)+"";
                if(flag.contains(temp1)){
                    count1++;
                }
                if(flag.contains(temp2)){
                    count2++;
                }
            }
            if(count1==count2){
                return true;
            }
            return false;
        }
    }
}
