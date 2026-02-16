class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int temp=nums[i]+nums[j];
                int k=j+1;
                while(k < nums.length && temp > nums[k]){
                    k++;

                }
                count+=k-j-1;
            }
            
        }
        return count;
    }
}