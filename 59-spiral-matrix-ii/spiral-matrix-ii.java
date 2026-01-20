class Solution {
    public int[][] generateMatrix(int n) {
        if(n<2){
            return new int [][]{{1}};
        }
        int rows=0;
        int cols=0;
        int rowe=n-1;
        int cole=n-1;
        int[][] matrix=new int[n][n];
        int val=1;
        while(rows<=rowe && cols<=cole){
            for(int i=cols;i<=cole;i++){
                matrix[rows][i]=val;
                val++;
            }
            rows++;
            for(int j=rows;j<=rowe;j++){
                matrix[j][cole]=val;
                val++;
            }
            cole--;
            for(int i=cole;i>=cols;i--){
                matrix[rowe][i]=val;
                val++;
            }
            rowe--;
            for(int j=rowe;j>=rows;j--){
                matrix[j][cols]=val;
                val++;
            }
            cols++;
        }
        return matrix;

    }
}