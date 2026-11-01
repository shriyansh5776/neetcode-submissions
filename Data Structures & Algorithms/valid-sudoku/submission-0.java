class Solution {
    private boolean checkRow(char[] row) {
        boolean[] found = new boolean[10];
        for (char c : row) {
            if (c == '.')
                continue;
            int digit = c - '0';
            if (found[digit]) {
                return false;
            } else
                found[digit] = true;
        }
        return true;
    }

    private boolean checkColumn(char[][] board,int j) {
        boolean[] found = new boolean[10];
        for (int i = 0; i < 9; i++) {
            char c = board[i][j];
            if (c == '.')
                continue;
            int digit = c - '0';
            if (found[digit]) {
                return false;
            } else
                found[digit] = true;
        }
        return true;
    }

    private boolean checkBox(char[][] board, int boxNum) {
        int i = 3 * (boxNum / 3);
        int j = 3 * (boxNum % 3);
        boolean[] found = new boolean[10];

        for (int a = i; a < (i + 3); a++) {
            for (int b = j; b < (j + 3); b++) {
                char c = board[a][b];
                if (c == '.')
                continue;
            int digit = c - '0';
            if (found[digit]) {
                return false;
            } else
                found[digit] = true;
            }
        }
        return true ; 
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0 ;i<9;i++){
            if(!checkRow(board[i])){
                return false ;
            }
        }
        for(int j = 0 ;j<9;j++){
            if(!checkColumn(board,j)){
                return false ;
            }
        }
        for(int j = 0 ;j<9;j++){
            if(!checkBox(board,j)){
                return false ;
            }
        }
        return true ;
    }
}
