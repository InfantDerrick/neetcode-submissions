class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new Set[9];
        Set<Character>[] cols = new Set[9];
        Set<Character>[] boxes = new Set[9];

        for(int i = 0; i < 9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.') continue;
                if( !rows[i].add(board[i][j]) ||
                    !cols[j].add(board[i][j]) ||
                    !boxes[3*(i/3) + j / 3].add(board[i][j])) return false;
            }
        }
        return true;
    }
}
