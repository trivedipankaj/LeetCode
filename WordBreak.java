/***
Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

For example, given
s = "leetcode",
dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code".

****/

public class WordBreak {

    public boolean wordBreak(String s, Set<String> dict) {
         boolean[] dp = new boolean[s.length()+1];
         dp[0] = true; 
        
        for(int i=0; i<s.length(); i++){
            //should continue from match position
            if(!dp[i]) 
                continue;
 
            for(String a: dict){
                int len = a.length();
                int end = i + len;
                if(end > s.length())
                    continue;
                  
                if(dp[end]) continue;
 
                if(s.substring(i, end).equals(a)){
                    dp[end] = true;
                }
            }
        }
 
        return dp[s.length()];
    }
}
