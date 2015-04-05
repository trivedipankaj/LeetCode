/********
Write a program to solve a Sudoku puzzle by filling the empty cells.

Empty cells are indicated by the character '.'.

You may assume that there will be only one unique solution and the board is a fixed 9X9
**/


public class Solution {
    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
			return;
		}
		solve(board);
    }
    
   public boolean solve(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] != '.') {
					continue;
				}
				
				for (int k = 1; k <= 9; k++) {
					board[i][j] = (char) (k + '0');
					if (isValid(board, i, j) && solve(board)) {
						return true; // we found a solution now stop!
					}
					board[i][j] = '.'; // well, we failed to find a solution now backtrack
				}
				
				return false; // we have just reached dead end, backtrack
			}	
		}
		
		return true; // all points are filled --> true. the last step
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
