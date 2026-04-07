class Solution {
    public int subarraySum(int[] nums, int k) {
        // if(nums.length == 0){
        //     return 0;
        // }
        // if(nums.length == 1){
        //     return nums[0] == k?1:0;
        // }
        // int left = 0;
        // int right = 1;
        // int sum=nums[0];
        // int knt = 0;

        // while(right>left && right<nums.length){
            
        //     if(sum == k){
        //         knt++;
        //     }

        //     while(sum>=k){
        //         sum-=nums[left];
        //         left++;
        //     }
        //     sum+=nums[right];
        //     right++;
        // }
        // return knt;


        int count = 0;
        int currentSum = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1);
        
        for (int num : nums) {
            currentSum += num;
            
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }
            
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        
        return count;
    }
}