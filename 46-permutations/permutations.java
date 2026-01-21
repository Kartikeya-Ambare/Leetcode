class Solution {
    public static void track(List<List<Integer>> ans, List<Integer> lis , int [] nums , boolean[] freq){
        if(nums.length == lis.size()){
            ans.add(new ArrayList<>(lis));
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(!freq[i]){
                freq[i] = true;
                lis.add(nums[i]);
                track(ans,lis,nums,freq);
                lis.remove(lis.size() - 1);
                freq[i] = false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        track(ans, new ArrayList<>(), nums,freq);
        return ans;
    }
}