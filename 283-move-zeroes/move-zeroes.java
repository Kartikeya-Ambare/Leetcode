class Solution {
    public void swap(int [] nums,int index1,int index2){
                int temp = nums[index1];
                nums[index1]=nums[index2];
                nums[index2]=temp;
    }
    public void moveZeroes(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return;
        }
        if(nums.length == 2 && (nums[0]==0 || nums[1] ==0)){
            if(nums[1] == 0 && nums[0] == 0){
                return;
            }
        }
        int j = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                swap(nums,j,i);
                j++;
            }
        }
        
    }
}