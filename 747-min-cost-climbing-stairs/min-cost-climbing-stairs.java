class Solution {
    public int minCostClimbingStairs(int[] cost) {
    // int min = Integer.MIN_VALUE;
    // int total=0;
    // for(int i =2;i<=cost.length;i++){
    //     total+=Math.min(cost[i-1],cost[i-2]);
    //     }  
    // return total;
        int n = cost.length;
        int dp[] = new int[cost.length+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=0;

        for(int i =2;i<dp.length;i++){
            int stp1 = cost[i-1]+dp[i-1];
            int stp2 = cost[i-2]+dp[i-2];
            dp[i]=Math.min(stp1,stp2);
        }

        // return recur(cost.length,cost,dp);
        return dp[cost.length];
    }

    // public static int recur(int n, int arr[],int dp[]){
    //     if(n ==1 || n==0){
    //         dp[n]=0;
    //     }
    //     if(dp[n]!=-1){
    //         return dp[n];
    //     }


        // int stp1 = arr[n-1]+recur(n-1,arr,dp);
        // int stp2 = arr[n-2]+recur(n-2,arr,dp);
        // dp[n]=Math.min(stp1,stp2);
    //     return dp[n];
    // }
    
}