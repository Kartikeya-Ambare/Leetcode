class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0 ;

        int dp[][] = new int[coins.length][amount+1];
        for(int x[]:dp) Arrays.fill(x,-1);
        int res =solver(coins,amount,dp,coins.length-1);
        return res>=(int)(1e9)?-1:res;
    }

    public static int solver(int coins[], int amt, int dp[][],int idx){
        if(idx == 0) {
            if(amt % coins[0] == 0) return amt / coins[0];
            else return (int)1e9; 
        }

        if(dp[idx][amt]!=-1) return dp[idx][amt];
        int pick = (int)(1e9);
        int nopick = 0;
        if(coins[idx]<=amt) pick = 1+solver(coins,amt-coins[idx],dp,idx);
        nopick = solver(coins,amt,dp,idx-1);

        return dp[idx][amt] = Math.min(pick,nopick);
    }
}