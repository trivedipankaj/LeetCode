public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int x = matrix.length;
        int y = matrix[0].length;
        int i=x-1; int j=0;
        while(i>=0 && j<y){
            if(matrix[i][j] == target){
                return true;
            }
            if(matrix[i][j] > target){
                i--;
            }else{
                j++;
            }
        }
        return false;
    }
}
