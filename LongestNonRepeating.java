/***
Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.

**/


public class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean flag[] = new boolean[256];
        
        int n = s.length();
        int result=0;
        int start=0;
        for(int i=0; i<n; i++){
            char curr = s.charAt(i);
            result = Math.max(result,i-start);
            if(flag[curr]){
                for(int j=start; j<i; j++){
                    if(s.charAt(j) == curr){
                        start = j+1;
                        break;
                    }
                    flag[s.charAt(j)]=false;
                }
            }else{
               flag[curr] =true;
            }
        }
        result = Math.max(n-start,result);
        return result;
    }
}
