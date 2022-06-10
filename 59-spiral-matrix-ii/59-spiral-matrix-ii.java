class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int left = 0, top = 0, right = n-1, bottom = n-1, j = 1;
        while(j <= n*n) {
            for(int i = left; i <= right; i++) {
                arr[top][i] = j++;
            }
            top++;
            
            for(int i = top; i <= bottom; i++) {
                arr[i][right] = j++;
            }
            right--;
            
            for(int i = right; i >= left; i--) {
                arr[bottom][i] = j++;
            }
            bottom--;
            
            for(int i = bottom; i >= top; i--) {
                arr[i][left] = j++;
            }
            left++;
        }
        return arr;
    }
}