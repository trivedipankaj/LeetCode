public class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        if(m==0) return 0;
        int n=grid[0].length;
        if(n==0){
            return 0;
        }
        int minSum[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n;j++){
                if(i==0 && j==0){
                   minSum[i][j]=grid[i][j];
                }else if(i==0)
                {
                    minSum[i][j] = grid[i][j]+minSum[i][j-1];
                }else if(j==0){
                    minSum[i][j] = grid[i][j]+minSum[i-1][j];
                }
                else{
                    minSum[i][j]=Math.min(minSum[i-1][j],minSum[i][j-1])+grid[i][j];
                }
            }
        }
        return minSum[m-1][n-1];
    }
}
