class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int dp [][] = new int[m+1][n+1];

        for(int x[]:dp) Arrays.fill(x,-1);

        return solver(m,n,text1,text2,dp);
    }
    public static int solver(int i, int j, String s1, String s2, int dp[][]){
        if(i == 0 || j == 0) return 0;
        
        if(dp[i][j] !=-1) return dp[i][j];

        if(s1.charAt(i-1) == s2.charAt(j-1)){
            return dp[i][j] = 1+solver(i-1,j-1,s1,s2,dp);
        }
        int pick = solver(i-1,j,s1,s2,dp);
        int nopick = solver(i,j-1,s1,s2,dp);
        return dp[i][j] = Math.max(pick,nopick);
    }
}