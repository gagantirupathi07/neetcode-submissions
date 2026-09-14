class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int r = 0;r<9;r++){
            for(int c=0;c<9;c++){
                char v = board[r][c];
                if( v== '.') continue;
                String row = v+" in row"+r;
                String col = v+" in col"+c;
                String box = v+" in box" + (r/3)+"-"+(c/3);
                if(!set.add(row)) return false;
                if(!set.add(col)) return false;
                if(!set.add(box)) return false;
            }
        }
        return true;
    }
}
