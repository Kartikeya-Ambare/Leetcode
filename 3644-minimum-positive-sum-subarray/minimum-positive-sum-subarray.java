class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        // int k = r-l+1;
        // int min = (int)(1e9);
        // int sum = 0;
        // for(int i = 0;i<k;i++){
        //     sum += nums.get(i);
        // }
        // min = Math.min(sum,min);
        // int len =nums.size();
        // int currSum = min;
        // for(int i = k;i<len;i++){
        //     currSum = currSum-nums.get(i-k)+nums.get(i);

        //     if(currSum>0) min = Math.min(currSum,min);
        // }

        // return min>0?min:-1;

        int minSum = Integer.MAX_VALUE;
        int n = nums.size();
        
        for (int k = l; k <= r; k++) {
            int currentSum = 0;
            
            for (int i = 0; i < k; i++) {
                currentSum += nums.get(i);
            }
            
            if (currentSum > 0) {
                minSum = Math.min(minSum, currentSum);
            }
            
            for (int i = k; i < n; i++) {
                currentSum = currentSum - nums.get(i - k) + nums.get(i);
                
                if (currentSum > 0) {
                    minSum = Math.min(minSum, currentSum);
                }
            }
        }
        
        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}