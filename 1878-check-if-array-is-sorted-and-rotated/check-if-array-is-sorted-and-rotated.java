class Solution {
    public boolean check(int[] nums) {
        // boolean grow = true;
        // boolean shrink = true;
        // int idx = 0;
        // for(int i = 0;i<nums.length-1;i++){
        //     if(nums[i]<nums[i+1]){
        //         grow = true;
        //     }
        //     else{
        //         idx++;
        //         break;
        //     }
        //     idx++;
        // }

        // if(idx == nums.length) return true;

        // for(int i =idx;i<nums.length;i++){
        //     if()
        // }
        int breaks = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                breaks++;
            }
        }

        return breaks <= 1;

    }
}