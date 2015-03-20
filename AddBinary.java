/***
Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
*/

public class Solution {
    public String addBinary(String a, String b) {
        int carry=0;
        int m=a.length();
        int n=b.length();
        if(m==0 && n==0){
            return "";
        }
        List<Integer> list = new ArrayList<Integer>();
        m--; n--;
        while(m>=0 || n>=0){
            int sum=carry;
            if(m>=0){
                sum += a.charAt(m) - '0';
            }
            if(n>=0){
               sum +=  b.charAt(n) -'0';
            }
            int res = sum%2;
            carry   = sum/2;
            list.add(res);
            m--; n--;
        }
        if(carry>0){
            list.add(carry);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=list.size()-1;  i>=0;i--){
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}
