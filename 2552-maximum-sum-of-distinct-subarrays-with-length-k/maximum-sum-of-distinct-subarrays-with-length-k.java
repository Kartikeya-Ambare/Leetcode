class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int dups = 0;
        long sum = 0;
        for(int i = 0;i<k;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],0);
            }
            map.put(nums[i],map.get(nums[i])+1);
            sum +=nums[i];

            if(map.get(nums[i])>1) dups+=1;
        }

        long max = 0;
        if(dups == 0) max=Math.max(max,sum);



        for(int i = k ;i<nums.length;i++){
            // int numsAdd = nums[i];
            // int numsRem = nums[i-k];

            // if(!map.containsKey(numsAdd)){
            //     map.put(nums[i],0);
            // }
            // map.put(numsAdd,map.get(numsAdd)+1);
            // sum +=numsAdd;
            // if(map.get(numsAdd)>1) dups+=1;

            // sum-=numsRem;

            // if(map.get(numsRem) == 1) dups-=1;

            // map.put(numsRem,map.get(numsRem)-1);

            // if(dups == 0) max = Math.max(sum,max);
            int numsAdd = nums[i];
            int numsRem = nums[i - k];

            map.put(numsAdd, map.getOrDefault(numsAdd, 0) + 1);
            sum += numsAdd;
            if (map.get(numsAdd) > 1) dups += 1;

    
            sum -= numsRem;
            if (map.get(numsRem) > 1) dups -= 1; 
            map.put(numsRem, map.get(numsRem) - 1);

            if (dups == 0) max = Math.max(sum, max);

        }
        return max;
    }
}