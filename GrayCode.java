/***
The gray code is a binary numeral system where two successive values differ in only one bit.

Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.

For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:

00 - 0
01 - 1
11 - 3
10 - 2

**/


public class Solution {
    public List<Integer> grayCode(int n) {
        double m = Math.pow(2.0,(double)n);
        List<Integer> res = new LinkedList<Integer>();
        for(int i=0; i<m; i++){
            int temp = i>>1 ^ i;
            res.add(temp);
        }
        return res;
    }
}
