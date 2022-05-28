class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;
        
        if(rows * cols != r * c) return mat;
        
        int[][] res = new int[r][c];
        int row_nums = 0, col_nums = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                res[row_nums][col_nums] = mat[i][j];
                col_nums++;
                
                if(col_nums == c) {
                    col_nums = 0;
                    row_nums++;
                }
            }
        }
        return res;
    }
}