class Solution {
    public int rob(int[] nums) {
        // int n = nums.length;
        // if (n == 1) {
        //     return nums[0];
        // }
        // int[] dp = new int[n];
        // dp[0] = nums[0];
        // dp[1] = Math.max(nums[0], nums[1]);
        // for (int i = 2; i < n; i++) {
        //     dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        // }
        // return dp[n - 1];
        int dp [] = new int[nums.length];
        Arrays.fill(dp,-1);
        return recur(nums,nums.length-1,dp);
    }

    public static int recur(int nums[],int idx,int [] dp){
        if(idx == 0){
            return nums[0];
        }
        if(idx == -1){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }

        int pick = nums[idx]+recur(nums,idx-2,dp);
        int nopick = 0 + recur(nums,idx-1,dp);
        dp[idx] = Math.max(pick,nopick);
        return dp[idx];
    }   
}