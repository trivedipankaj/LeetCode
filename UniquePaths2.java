/***
Follow up for "Unique Paths":

Now consider if some obstacles are added to the grids. How many unique paths would there be?

An obstacle and empty space is marked as 1 and 0 respectively in the grid.

For example,
There is one obstacle in the middle of a 3x3 grid as illustrated below.

[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
The total number of unique paths is 2.

Note: m and n will be at most 100.

*/


public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(m==0 && n==0){ return 1;}
        int paths[][] = new int[m][n];
        boolean found=false;
        for(int i=0; i<m; i++){
            if(obstacleGrid[i][0]==0 && found==false){
                paths[i][0] =1;
            }
            else{
                paths[i][0]=0;
                found=true;
            }
        }
        found =false;
        for(int i=0; i<n; i++){
            if(obstacleGrid[0][i]==0 && found==false){
               paths[0][i]=1;
            }
            else{
               paths[0][i]=0;
               found=true;
            }
        }
        for(int i=1; i<m;i++){
            for(int j=1; j<n; j++){
                if(obstacleGrid[i][j]==0)
                   paths[i][j] = paths[i][j-1]+ paths[i-1][j];
                else
                   paths[i][j]=0;
            }
        }
        return paths[m-1][n-1];
    }
}
