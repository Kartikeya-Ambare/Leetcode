class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int j = nums.size()-1;
        int i = 0;

        int knt  = 0;

        while(i<j){
            int sum = nums.get(i)+nums.get(j);
            if(sum<target){
                knt+=j-i;
                i++;
            }
            else{
                j--;
            }
        }
        return knt;
    }
}