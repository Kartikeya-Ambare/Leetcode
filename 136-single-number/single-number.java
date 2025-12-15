class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int uniqNum = 0;
        for (int idx : nums) {
            uniqNum ^= idx;
        } return uniqNum; 
    }
}