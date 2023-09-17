package leetcode;

public class LongestAlternatingSubarray {
    //https://leetcode.com/problems/longest-alternating-subarray/
    public static void main(String[] args) {
        System.out.println(Solution.alternatingSubarray(new int[]{2,3,4,3,4}));
    }
    class Solution {
        public static int alternatingSubarray(int[] arr) {
            int maxLength=0,length=0,add,next;
            for(int i=0;i<arr.length;i++){
                length = 1;
                add = 1;
                next=arr[i];
                for(int j= i+1;j<arr.length;j++){
                    next += add;
                    if(arr[j]==next){
                        length++;
                    }else{
                        break;
                    }
                    add *= (-1);
                }
                maxLength= Math.max(maxLength,length);
            }
            if(maxLength==0||maxLength==1){
                return -1;
            }else{
                return maxLength;
            }

        }
    }
}
