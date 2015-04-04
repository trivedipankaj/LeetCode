/*****
Now, instead outputting board configurations, return the total number of distinct solutions.
*/

public class Solution {
    int count=0;
    public int totalNQueens(int n) {
         int A[] = new int[n];
        for(int i=0; i<n; i++){
            A[i]=-1;
        }
        solve(A,0,n);
        return count;
    }
    
    public boolean isValid(int[] A, int col){
        for(int i=0; i<col; i++){
            if(A[i]==A[col] || Math.abs(A[i]-A[col])== (col-i)){
                return false;
            }
        }
        return true;
    }
    
    public void solve(int[] A, int col, int n){
         if(col==n){
             count++;
         }else{
             for(int i=0; i<n; i++){
                 A[col] =i;
                 if(isValid(A,col)){
                     System.out.print(col+" ");
                	 solve(A,col+1,n);
                 }
             }
         }
    }
}
