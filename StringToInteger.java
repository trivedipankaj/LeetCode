/***

Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.

***/


public class Solution {
    private boolean isNumber(char c) {
       return c >= '0' && c <= '9';
   }
   
   public int atoi(String str) {
       if(str==null || str.length()==0) return 0;
       int startIndex=0;
       while(str.charAt(startIndex) ==' '){
           startIndex++;
       }
       char firstChar = str.charAt(startIndex);
       if(!isNumber(firstChar) && (firstChar !='+' && firstChar!='-')){
           return 0;
       }
       
       boolean isPositive=true;
       if(firstChar=='+' || firstChar=='-'){
           if(firstChar=='-'){
               isPositive=false;
           }
           startIndex++;    
       }
       
       int begin=startIndex;
       long value=0;
       while(startIndex< str.length() && isNumber(str.charAt(startIndex)) && value<Integer.MAX_VALUE){
           value = value*10 + (str.charAt(startIndex)-'0');
           
           startIndex++;
       }    
       if(begin == startIndex){
           return 0;
       }
       if(!isPositive){
           value *= -1;
       }
       if(value<Integer.MIN_VALUE){
           return Integer.MIN_VALUE;
       }
       
       if(value > Integer.MAX_VALUE){
           return Integer.MAX_VALUE;
       }
       
       return (int)value;
   }
}
