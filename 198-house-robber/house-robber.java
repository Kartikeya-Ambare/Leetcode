class Solution {
    public int rob(int[] nums) {
     Integer dp[] = new Integer[nums.length];

     return solver(nums.length-1,nums,dp);   
    }

    public static int solver(int idx,int nums[], Integer dp[]){
        if(idx==0) return nums[0];
        if(idx == -1) return 0;

        if(dp[idx]!=null){
            return dp[idx];
        }
        int pick = nums[idx] + solver(idx-2,nums,dp);
        int nopick =solver(idx-1,nums,dp);

        return dp[idx] = Math.max(pick,nopick);
    }
}