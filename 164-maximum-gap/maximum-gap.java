class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        int max_diff =nums[1]-nums[0],curr_diff=0;
        for(int i =1;i<nums.length-1;i++){
            curr_diff = nums[i+1]-nums[i];
            if(max_diff<curr_diff){
                max_diff=curr_diff;
            }
        }
        return max_diff;
    }
}