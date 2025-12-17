class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int UniqueNum = 0;
        for (int idx : nums) {
            UniqueNum ^= idx;
        } 
        return UniqueNum; 
    }
}