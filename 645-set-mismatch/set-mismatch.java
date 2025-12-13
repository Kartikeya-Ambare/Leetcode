class Solution {
    public int[] findErrorNums(int[] nums) {
        int missing =-1,duplicate = -1;
        boolean [] seen = new boolean[nums.length+1];
        for(int num: nums){
            if(seen[num]){
                duplicate = num;
            }
            seen[num]=true;
        }
        for (int i = 1; i < seen.length; i++) {
            if (!seen[i]) {
                missing = i;
                break;
            }
        }
        return new int[]{duplicate,missing};
    }
}