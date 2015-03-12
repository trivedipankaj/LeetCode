public class Solution {
    public void setZeroes(int[][] matrix) {
        int x=matrix.length;
        if(x==0) return;
        int y=matrix[0].length;
        
        boolean firstRow = scanRow(matrix,0);
        boolean firstCol = scanCol(matrix,0);
        
       
        for(int i=1; i<x;i++){
            if(scanRow(matrix,i)==true){
                matrix[i][0]=0;
            }
        }
        for(int i=1; i<y;i++){
            if(scanCol(matrix,i) == true){
                matrix[0][i] = 0;
            }
        }
        for(int i=1; i<x;i++){
            for(int j=1; j<y;j++){
                if(matrix[i][0]==0|| matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(firstRow ==true){
            for(int i=0; i<y;i++){
                matrix[0][i]=0;
            }
        }
        if(firstCol==true){
            for(int i=0; i<x;i++){
                matrix[i][0]=0;
            }
        }
    }
    
    public boolean scanRow(int[][] matrix, int row_num){
        for(int i=0; i<matrix[0].length;i++){
            if(matrix[row_num][i] == 0){
                return true;
            }
        }
        return false;
    }
    
    public boolean scanCol(int[][] matrix, int col_num){
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][col_num]==0){
                return true;
            }
        }
        return false;
    }
}
