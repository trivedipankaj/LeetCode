public class Solution {
    public boolean isPalindrome(String s) {
       int len = s.length();
       if(len<=1){
           return true;
       }
       int start=0,end=len-1;
       while(start <end){
           while(!Character.isLetterOrDigit(s.charAt(start)) && start <end)
           { start++;}
           while(!Character.isLetterOrDigit(s.charAt(end)) && end>0){
               end--;
           }
           if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)) && start <=end)
           {
               return false;
           }else{
               start++;end--;
           }
       }
       return true;
    }
}
