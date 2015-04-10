/****
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/


public class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        int n = s.length();
        if(n==0) return true;
        if(n%2!=0) return false;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '(' || s.charAt(i) =='{' || s.charAt(i) =='[') {
                st.push(s.charAt(i));
            }else{
                if(st.isEmpty()){
                    return false;
                }
                Character popped = st.pop();
                Character curr   = s.charAt(i);
                if(curr==')' && popped !='('){
                    return false;
                }else if(curr=='}' && popped!='{'){
                    return false;
                }else if(curr==']' && popped!='['){
                    return false;
                }
            }
            
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
}
