class Solution {
    public int removeElement(int[] nums, int val) {
        // int pos = 0 , curr = nums.length-1,knt = 0;
        // while(pos<curr){
        //     if(nums[curr] != val){
        //         nums[pos] = nums[curr];
        //         pos++;
        //         knt++;
        //     }
        //     curr--;
        // }
        // return knt;
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k; 
    }
}