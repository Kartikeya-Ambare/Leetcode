class Solution {
    public int findLongestChain(int[][] nums) {
        Arrays.sort(nums,(a,b)->a[0]-b[0]);
        int n = nums.length;
        int lis[] = new int[n];

        Arrays.fill(lis,1);
        int maxLen = 1;
        for(int i = 1;i<n;i++){
            for(int p = 0;p<i;p++){
                if(nums[p][1]<nums[i][0]){
                    lis[i] = Math.max(lis[i],1+lis[p]);
                }
            }
            if(lis[i]>maxLen){
                maxLen = lis[i];
            }
        }
        return maxLen;
    }
}