/******
Determine if a Sudoku is valid

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
*/

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(!isValid(board,i,j)){
                    return false;
                }
            }
        }
        return true;
        
    }
    
     private boolean isValid(char[][] board, int a, int b) {
		HashSet<Character> contained = new HashSet<Character>();
		// cache the occurrence and return false in case of a duplicate
		for (int i = 0; i < 9; i++) {
			if (contained.contains(board[a][i])) {
				return false;
			}
			if (board[a][i] > '0' && board[a][i] <= '9') {
				contained.add(board[a][i]);
			}
		}
		
		
		
		contained.clear();
		for (int i = 0; i < 9; i++) {
			if (contained.contains(board[i][b])) {
				return false;
			}
			if (board[i][b] > '0' && board[i][b] <= '9') {
				contained.add(board[i][b]);
			}
		}
		
		// Check sub-box board[a][b] located.
		contained.clear();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int x = a / 3 * 3 + i, y = b / 3 * 3 + j;
				if (contained.contains(board[x][y])) {
					return false;
				}
				
				if (board[x][y] > '0' && board[x][y] <= '9') {
					contained.add(board[x][y]);
				}
			}
		}		
		return true;
	}
}
