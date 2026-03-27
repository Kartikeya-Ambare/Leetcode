class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int i = 0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return recur(dp,m-1,n-1);
    }

    public static int recur(int dp[][],int m,int n){
        // if(m == 0 && n == 0){
        //     dp[m][n] = 1;
        //     return dp[m][n];
        // }
        // if(m == 0 || n == 0){
        //     dp[m][n] = 0;
        //     return dp[m][n];
        // }
        // if(m == 0){
        //     return dp[0][n];
        // }
        // if(n == 0){
        //     return dp[m][0];
        // }
        // if(dp[m][n]!=-1){
        //     return dp[m][n];
        // }
        if (m < 0 || n < 0) return 0;
        if (m == 0 && n == 0) return 1;
        if (dp[m][n] != -1) return dp[m][n];

        dp[m][n] = recur(dp, m - 1, n) + recur(dp, m, n - 1);
        return dp[m][n];

    }
}