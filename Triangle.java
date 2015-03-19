/***

Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

For example, given the following triangle
[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
*/



public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size(); //number of rows
        if(m==0) return 0;
        int minSum[][] = new int[m][m];
        minSum[0][0] = triangle.get(0).get(0);
    
        for(int i=1; i<m; i++){
           for(int j=0; j<triangle.get(i).size(); j++){
            if(j==0){
                minSum[i][j] =minSum[i-1][j]+triangle.get(i).get(j);
            }else if(j==triangle.get(i).size()-1){
                minSum[i][j] =minSum[i-1][j-1]+triangle.get(i).get(j);
            }
            else{
                minSum[i][j] = triangle.get(i).get(j)+ Math.min(minSum[i-1][j],minSum[i-1][j-1]);
             }
           }
        }
        int res= minSum[m-1][0];
        for(int i=1; i<m;i++){
            if(minSum[m-1][i] < res){
                res = minSum[m-1][i];
            }
        }
        return res;
    }
}
