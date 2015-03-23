/***
Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.
*/
public class Solution {
    public int[] plusOne(int[] digits) {
        int m = digits.length;
        int res[] = new int[m+1];
        int carry=1;
        for(int i=m; i>0; i--){
            int sum = carry+digits[i-1];
            carry = sum/10;
            sum    = sum%10;
            res[i] = sum;
        }
        if(carry>0){
            res[0] = carry;
            return res;
        }else{
           for(int i=0; i<m;i++){
               digits[i] = res[i+1];
           }
           return digits;
        }
    }
}
