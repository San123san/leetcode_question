class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seeDuplicate = new HashSet<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] == '.')
                continue;
                final char c = board[i][j];
                if(!seeDuplicate.add(c + "@row" + i)||
                   !seeDuplicate.add(c + "@col" + j)||
                   !seeDuplicate.add(c + "@3*3" + i/3 + j/3))
                return false;
            }  
        }
        return true;
    }
}