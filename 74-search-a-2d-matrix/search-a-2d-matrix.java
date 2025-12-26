class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        if (mat == null || mat.length == 0) return false;
        
        int rows = mat.length;
        int cols = mat[0].length;
        
        int row = 0;
        int col = cols - 1;
        
        while (row < rows && col >= 0) {
            if (mat[row][col] == x) {
                return true;
            } else if (mat[row][col] > x) {
                col--; 
            } else {
                row++;
            }
        }
        return false;
    }
}