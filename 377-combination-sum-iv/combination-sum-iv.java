class Solution {
    // public int combinationSum4(int[] nums, int target) {
    //     if(nums.length == 1 && (target<nums[0])) {
    //         return 0;
    //     } 

    //     int dp[][] = new int[nums.length][target+1];

    //     for(int[] row: dp){
    //         Arrays.fill(row,-1);
    //     }


    //     return recur(nums,nums.length-1,target,0);
    // }

    // public static int recur(int nums[],int idx, int target,int score){
    //     if(target>0 && idx == 0 && (target%nums[idx]!=0)){
    //         return 0;
    //     }
    //     if(target == 0 || idx == 0){
    //         return 1;
    //     }

    //     if(target>=nums[idx]){
    //         score=1 + recur(nums,idx,target-nums[idx],score);
    //     }

    //     score+=recur(nums,idx-1,target,score);
    //     return score;
    // }


    public int combinationSum4(int[] nums, int target) {
        Integer[] memo = new Integer[target + 1];
        return helper(nums, target, memo);
    }

    int helper(int[] nums, int target, Integer[] memo) {
        if (target == 0) return 1;
        if (target < 0) return 0; 
        if (memo[target] != null) return memo[target];

        int count = 0;
        for (int num : nums) {
            count += helper(nums, target - num, memo);
        }
        memo[target] = count; // Store result
        return count;
    }
}