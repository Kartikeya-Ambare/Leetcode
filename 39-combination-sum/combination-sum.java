class Solution {
//     public List<List<Integer>> combinationSum(int[] nums, int target) {
//     List<List<Integer>> list = new ArrayList<>();
//     Arrays.sort(nums);
//     backtrack(list, new ArrayList<>(), nums, target, 0);
//     return list;
// }

// private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
//     if(remain < 0) return;
//     else if(remain == 0) list.add(new ArrayList<>(tempList));
//     else{ 
//         for(int i = start; i < nums.length; i++){
//             tempList.add(nums[i]);
//             backtrack(list, tempList, nums, remain - nums[i], i); 
//             tempList.remove(tempList.size() - 1);
//         }
//     }
// }
public static void findCom(int[] candidates, int target, int ind,List<List<Integer>> ans, List<Integer> ds){
        if(ind==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(candidates[ind]<=target){
            ds.add(candidates[ind]);
            findCom(candidates,target-candidates[ind],ind,ans,ds);
            ds.remove(ds.size()-1);
        }
        findCom(candidates,target,ind+1,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        findCom(candidates,target,0,ans,ds);
        return ans;
    }
}