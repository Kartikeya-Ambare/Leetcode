class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 0){
            return 0;
        }
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
        int dp1 [] = new int[nums.length];
        int dp2 [] = new int[nums.length];
        int nums1 [] = new int[nums.length-1];
        int nums2 [] = new int[nums.length-1];
        fill_arr(nums1,nums,0,nums.length-1);
        fill_arr(nums2,nums,1,nums.length);
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        int max1 = recur(nums1,nums1.length-1,dp1);
        int max2 = recur(nums2,nums2.length-1,dp2);
        return Math.max(max1,max2);
    }
    public static void fill_arr(int nums[],int num[],int start,int end){
        int j = 0;                    
        for (int i = start; i < end; i++) {
            nums[j] = num[i];
            j++;
        }
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