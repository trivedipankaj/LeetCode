/***
Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
*/
public class Solution {
    public int removeElement(int[] A, int elem) {
        int n= A.length;
        if(n==0) return 0;
        if(n==1){
            if(A[0] == elem){
                return 0;
            }
            return 1;
        }
        int p=0;
        int q=n-1;
        while(q>p){
            if(A[p] != elem){
                p++;
                continue;
            }
            if(A[q] ==elem){
                q--;
                continue;
            }
            int temp = A[p];
            A[p]=A[q];
            A[q] =temp;
        }
        if(A[p] == elem)
		    return p;
        else
            return p+1;
    }
}
