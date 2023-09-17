package leetcode;

import java.util.HashMap;

public class WinnerOfAnElection {
    //https://practice.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names-1587115621/1
    public static void main(String[] args) {

    }
    class Solution
    {
        //Function to return the name of candidate that received maximum votes.
        public static String[] winner(String arr[], int n)
        {
            int max = 0;
            String names="";
            HashMap<String,Integer> map = new HashMap<>();
            for(String str : arr){
                map.put(str, map.getOrDefault(str,0)+1);
            }
            for (String name : map.keySet())
            {
                if(map.get(name)>max){
                    max = map.get(name);
                    names = name;
                }else if(map.get(name)==max){
                    if(name.compareTo(names) < 0){
                        names=name;
                    }
                }
            }
            return new String[]{names,max+""};
        }
    }
}
