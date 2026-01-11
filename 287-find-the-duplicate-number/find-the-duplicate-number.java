class Solution {
    public int findDuplicate(int[] nums) {
        int[] freq = new int[nums.length];
        for(int a:nums){
            freq[a]++;
            if(freq[a]>1) return a;
        }
        return 0;
    }
}