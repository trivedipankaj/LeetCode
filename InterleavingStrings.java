/***
Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.

For example,
Given:
s1 = "aabcc",
s2 = "dbbca",

When s3 = "aadbbcbcac", return true.
When s3 = "aadbbbaccc", return false.

*/
public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int m= s1.length();
        int n = s2.length();
        int k = s3.length();
        if(k != (m+n)){
            return false;
        }
        
        boolean table[][] = new boolean[m+1][n+1];
        for(int i=0; i<=m;i++){
            for(int j=0; j<=n;j++){
                table[i][j] = false;
            }
        }
        
        for(int i=0; i<=m;i++){
            for(int j=0; j<=n;j++){
                if(i==0 && j==0){
                    table[i][j] = true;
                }
                else if(i==0  && s2.charAt(j-1) == s3.charAt(j-1)){
                    table[i][j] = table[i][j-1];
                }else if(j==0  && s1.charAt(i-1) == s3.charAt(i-1)){
                    table[i][j] = table[i-1][j];
                }else if(i>0 && j>0 && s1.charAt(i-1) != s3.charAt(i+j-1) && s2.charAt(j-1) == s3.charAt(i+j-1)){
                    table[i][j]= table[i][j-1];
                }else if(i>0 && j>0 && s1.charAt(i-1) == s3.charAt(i+j-1) && s2.charAt(j-1) != s3.charAt(i+j-1)){
                    table[i][j]=table[i-1][j];
                }else if(i>0 && j>0 && s1.charAt(i-1) == s3.charAt(i+j-1) && s2.charAt(j-1) == s3.charAt(i+j-1)){
                    table[i][j]= table[i][j-1]||table[i-1][j];
                }
                
            }
        }
        return table[m][n];
    }
}
