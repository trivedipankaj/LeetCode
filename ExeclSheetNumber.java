/***
Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A - 1
    B - 2
    C - 3
    ...
    Z - 26
    AA - 27
    AB - 28 
**/



public class Solution {
    public int titleToNumber(String s) {
        int n = s.length();
        int num=0;
        for(int i=0; i<n;i++){
            num = num*26 + (s.charAt(i) -'A' +1);
        }
      return num;    
    }
}
