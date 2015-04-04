/**********
The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.



Given an integer n, return all distinct solutions to the n-queens puzzle.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.

*/

public class Solution {
    List<String[]> res = new ArrayList<String[]>();
    public List<String[]> solveNQueens(int n) {
        
        int A[] = new int[n];
        for(int i=0; i<n; i++){
            A[i]=-1;
        }
        solve(A,0,n);
        return res;
    }
    
    public void printBoard(int[] A, int n){
        String str[] = new String[n];
        for(int i=0; i<n; i++){
            String temp="";
            for(int j=0; j<n; j++){
                if(A[i]==j){
                    temp +="Q";
                }else{
                    temp +=".";
                }
            }
            str[i]=temp;
        }
        res.add(str);
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
             printBoard(A,n);
         }else{
             for(int i=0; i<n; i++){
                 A[col] =i;
                 if(isValid(A,col)){
                     solve(A,col+1,n);
                 }
             }
         }
    }
}
