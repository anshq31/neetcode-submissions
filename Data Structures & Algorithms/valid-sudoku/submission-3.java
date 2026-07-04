class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int r =0;r<9;r++){
            Set<Character> set = new HashSet<>();
            for(int i = 0;i<9;i++){
                if(board[r][i] == '.') continue;
                if(set.contains(board[r][i])) return false;
                set.add(board[r][i]);
            }
        }

        for(int c =0;c<9;c++){
            Set<Character> set = new HashSet<>();
            for(int  i = 0;i<9;i++){
                if(board[i][c] == '.') continue;
                if(set.contains(board[i][c])) return false;
                set.add(board[i][c]);
            }
        }

        for(int sq =0;sq<9;sq++){
            Set<Character> set = new HashSet<>();
            for(int i =0;i<3;i++){
                for(int j = 0;j<3;j++){
                    int r = (sq/3)*3+i;
                    int c = (sq%3)*3+j;
                    if(board[r][c] == '.') continue;
                    if(set.contains(board[r][c])) return false;
                    set.add(board[r][c]);
                }
            }
        }
        return true;
    }
}
