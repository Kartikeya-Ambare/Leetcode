class Solution {
    public int minCostClimbingStairs(int[] cost) {
        Integer dp[] = new Integer[cost.length];

        int z = solver(cost,0,dp,cost.length);
        int f = solver(cost,1,dp,cost.length);
        return Math.min(z,f);
    }

    public static int solver(int cost[], int idx, Integer dp[], int len){
        if(idx >= len) return 0;

        if(dp[idx]!=null) return dp[idx];

        int one = cost[idx] + solver(cost,idx+1,dp,len);
        int tow = cost[idx] + solver(cost,idx+2,dp,len);

        return dp[idx] = Math.min(one,tow);
    }
}