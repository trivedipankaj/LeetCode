/**

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

"((()))", "(()())", "(())()", "()(())", "()()()"
**/


public class Solution {
    List<String> res = new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
        generate(n,0,"");
        return res;
    }
    
    public void generate(int open, int close, String s){
        if(open==0 && close==0){
            res.add(s);
        }
        if(open>0){
            generate(open-1,close+1,s+"(");
        }
        if(close>0){
            generate(open,close-1,s+")");
        }
    }
    
}
