/*******

Determine whether an integer is a palindrome. Do this without extra space.
*/
public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x==0) return true;
        int div=1;
        while(x/div>=10){
            div *=10;
        }
        while(x!=0){
            int left = x%10;
            int right = x/div;
            if(left !=right){
                return false;
            }
            x = (x%div)/10;
            div = div/100;
        }
        return true;
    }
}
