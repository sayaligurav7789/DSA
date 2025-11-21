// package declaration removed to fix Incorrect Package error

import java.util.*;

class sudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < 9; row++){
            HashSet<Character> seen = new HashSet<>();
            for(int i = 0; i < 9; i++){
                if(board[row][i] == '.')
                    continue;
                if(seen.contains(board[row][i]))
                    return false;
                seen.add(board[row][i]);
            }
        }
        
        for(int col = 0; col < 9; col++){
            HashSet<Character> seen = new HashSet<>();
            for(int i = 0; i < 9; i++){
                if(board[col][i] == '.') 
                continue;
                if(seen.contains(board[col][i]))
                    return false;
                seen.add(board[col][i]);
            }
        }

        for(int squa = 0; squa < 3; squa++){
            HashSet<Character> seen = new HashSet<>();
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    int row = (squa / 3) * 3 + i;
                    int col = (squa % 3) * 3 + j;
                    if (board[row][col] == '.') continue;
                    if (seen.contains(board[row][col])) return false;
                    seen.add(board[row][col]);                    
                }
            }
        }
        return true;

    }
}
