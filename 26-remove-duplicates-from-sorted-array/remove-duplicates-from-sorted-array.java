class Solution {
    public int removeDuplicates(int[] nums) {
      if(nums.length == 1){
        return 1;
      }
      int curr_index = 0,knt = 1;
      for(int i =1;i<nums.length;i++){
        if(nums[curr_index]!=nums[i]){
            curr_index++;
            nums[curr_index]=nums[i];
            knt++;
        }
      }
      return knt;  
    }
}