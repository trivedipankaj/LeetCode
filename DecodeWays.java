/***
A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' - 1
'B' - 2
'Z' - 26
Given an encoded message containing digits, determine the total number of ways to decode it.

For example,
Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

The number of ways decoding "12" is 2.
*/

public class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if(n==0) return 0;
        int ways[] = new int[n+1];
        
        ways[0]=1;
        ways[1] = s.charAt(0) !='0' ? 1:0;
        for(int i=2; i<=n; i++){
            if(s.charAt(i-1) !='0'){
                ways[i] = ways[i-1];
            }
            int val = (s.charAt(i-2)-'0')*10 + (s.charAt(i-1)-'0');
            if(val<=26 && val>=10){
                ways[i] += ways[i-2];
            }
        }
        return ways[n];
    }
}
