class Solution {
    public int change(int amount, int[] coins) {
        int dp[][] = new int[coins.length+1][amount+1];
        for(int x[]:dp) Arrays.fill(x,-1);

        return countCombinations(coins.length,coins,amount,dp);
    }
    private int countCombinations(int n, int[] coins, int amount, int[][] memo) {
        if (amount == 0) return 1;
        if (n == 0 || amount < 0) return 0;
        if (memo[n][amount] != -1) return memo[n][amount];

        int result = countCombinations(n - 1, coins, amount, memo)
            + countCombinations(n, coins, amount - coins[n - 1], memo);
        memo[n][amount] = result;
        return result;
    }
}