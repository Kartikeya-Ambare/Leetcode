class Solution {
    public int numTeams(int[] nums) {
        int knt = 0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                for(int k =j+1;k<n;k++){
                    if((nums[i]>nums[j] && nums[j]>nums[k])|| (nums[i]<nums[j] && nums[j]<nums[k])){
                        knt++;
                    }
                }   
            }   
        }
        return knt;
    }
}