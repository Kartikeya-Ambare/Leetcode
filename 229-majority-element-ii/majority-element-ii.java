class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> mapp = new HashMap<>();

        for(int num:nums){
            mapp.put(num,mapp.getOrDefault(num,0)+1);
        }
        int target =(int) Math.floor(nums.length/3);

        List<Integer> ans = new ArrayList<>();

        for(Map.Entry<Integer,Integer> map2 : mapp.entrySet()){
            if(map2.getValue()>target){
                ans.add(map2.getKey());
            }
        }
        return ans;

    }
}