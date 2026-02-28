class Solution {
    // // public long countGood(int[] nums, int k) {
    // //     long knt = 0;

    // //     // for(int i = 0 ; i<nums.length-1;i++){
    // //     //     knt = knt+chk_good_arr(nums,i);
    // //     // }
    // //     for (int left = 0; left < nums.length; left++) {
    // //         for (int right = left; right < nums.length; right++) {
    // //             if (chk_good_arr(nums, left, right) >= k) {
    // //                 knt++;
    // //             }
    // //         }
    // //     }
    // //     return knt > k? knt : 1;
    // // }

    // // public static long chk_good_arr(int []nums,int i){
    // //     long knt = 0;
    // //     for(int j = i+1;j<nums.length;j++){
    // //         if(nums[i] == nums[j]){
    // //             knt++;
    // //         }
    // //     }
    // //     return knt;
    // // }

    // public long countGood(int[] nums, int k) {
    //     long knt = 0;

    //     for (int left = 0; left < nums.length; left++) {
    //         for (int right = left; right < nums.length; right++) {
    //             if (chk_good_arr(nums, left, right) >= k) {
    //                 knt++;
    //             }
    //         }
    //     }

    //     return knt;
    // }

    // public static long chk_good_arr(int[] nums, int start, int end) {
    //     long pairs = 0;
    //     for (int i = start; i <= end; i++) {
    //         for (int j = i + 1; j <= end; j++) {
    //             if (nums[i] == nums[j]) {
    //                 pairs++;
    //             }
    //         }
    //     }
    //     return pairs;
    // }


    public long countGood(int[] nums, int k) {
        // long ans = 0;
        
        // for (int left = 0; left < nums.length; ++left) {
        //     int[] freq = new int[100001];
        //     long pairs = 0;
            
        //     for (int right = left; right < nums.length; ++right) {
        //         int num = nums[right];
        //         pairs -= (long) freq[num] * (freq[num] - 1) / 2;
        //         freq[num]++;
        //         pairs += (long) freq[num] * (freq[num] - 1) / 2; 
        //         if (pairs >= k) ans++;
        //     }
        // }
        
        // return ans;
        Map<Integer, Integer> mpp = new HashMap<>();
        long cnt = 0; int left = 0;
        for (int i = 0; i < nums.length; i++) {
            k -= mpp.getOrDefault(nums[i], 0);
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
            while (k <= 0) {
                mpp.put(nums[left], mpp.get(nums[left]) - 1);
                k += mpp.get(nums[left++]);
            }
            cnt += left;
        }
        return cnt;
    
    }
}