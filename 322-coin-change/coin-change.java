class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length][amount+1];
        for(int i = 0 ; i<coins.length;i++){
            for(int j = 0 ; j<amount+1;j++){
                dp[i][j] = -1;
            }
            
        }
        int res = recur(coins,amount,coins.length-1,dp);
        return res>=(int)(1e9)?-1:res;
    }

    public int recur(int coins[], int amt, int idx,int dp[][]){
        if(idx == 0){
            if(amt % coins[idx] == 0){
                dp[idx][amt] = amt/coins[idx];
                return dp[idx][amt];
            }
            dp[idx][amt] = (int)(1e9);
            return dp[idx][amt];
        }
        if(dp[idx][amt]!=-1){
            return dp[idx][amt];
        }
        int pick = (int)(1e9);
        if(amt>=coins[idx]){
            pick = 1+ recur(coins,amt-coins[idx],idx,dp);
        }
        int nopick = recur(coins,amt,idx-1,dp);
        dp[idx][amt]  = Math.min(pick,nopick);        
        return dp[idx][amt];
    }

}