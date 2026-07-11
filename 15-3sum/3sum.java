class Solution {

    public void twoSumHelper(int f, int nums[], List<List<Integer>> ls){
        int i = f+1;
        int j = nums.length-1;

        //= ;
        while(i<j){
            int sum = nums[f]+nums[i]+nums[j];
            if(sum>0) j--;
            else if (sum<0) i++;
            else{ 
                ls.add(Arrays.asList(nums[f],nums[i],nums[j]));
                i++;
                j--;
                while(i<j && nums[j] == nums[j+1]) j--;
                while(i<j && nums[i] == nums[i-1]) i++;
            }
        }

    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        for(int i =0;i<nums.length;i++){
            if(nums[i]>0){
                break;
            }

            if(i == 0 || nums[i]!=nums[i-1]){
                twoSumHelper(i,nums,ans);
            }
        }
        return ans;

    }
}