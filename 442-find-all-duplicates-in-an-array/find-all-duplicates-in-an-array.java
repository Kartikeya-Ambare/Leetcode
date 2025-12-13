class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // int [] count = new int[nums.length+1];
        // for(int num:nums){
        //     count[num]++;
        // }
        // List<Integer> res = new ArrayList<>();
        // for(int i =0;i<nums.length;i++){
        //     if(count[i]>1){
        //         res.add(i);
        //     }
        // }
        // return res;
        List<Integer> res = new ArrayList<>();
        int val =0,idx=0;
        for(int i = 0;i<nums.length;i++){
            val = Math.abs(nums[i]);
            idx = val-1;

            if(nums[idx]<0){
                res.add(val);
            }
            else{
                nums[idx]*=-1;
            }
        }
        return res;
    }
}