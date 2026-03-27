class Solution {
    // public int lengthOfLIS(int[] nums) {
    //     List<Integer> res = new ArrayList<>();

    //     for (int n : nums) {
    //         if (res.isEmpty() || res.get(res.size() - 1) < n) {
    //             res.add(n);
    //         } else {
    //             int idx = binarySearch(res, n);
    //             res.set(idx, n);
    //         }
    //     }

    //     return res.size();        
    // }

    // private int binarySearch(List<Integer> arr, int target) {
    //     int left = 0;
    //     int right = arr.size() - 1;

    //     while (left <= right) {
    //         int mid = (left + right) / 2;
    //         if (arr.get(mid) == target) {
    //             return mid;
    //         } else if (arr.get(mid) > target) {
    //             right = mid - 1;
    //         } else {
    //             left = mid + 1;
    //         }
    //     }

    //     return left;
    // } 

        public int lengthOfLIS(int[] nums) {
        // store.put(0, 1);
        // int s = 1;
        // for (int i=1; i<nums.length; i++) {
        //     int cm = 1;
        //     for (int j=0; j<i; j++) {
        //         if (nums[j] < nums[i]) {
        //             cm = Math.max(store.get(j) + 1, cm);
        //         }
        //     }
        //     store.put(i, cm);
        //     s = Math.max(s, cm);
        //     cm = 0;
        // }
        // return s;
        int n = nums.length;
        int lis[] = new int[n];

        Arrays.fill(lis,1);
        int maxLen = 1;
        for(int i = 1;i<n;i++){
            for(int p = 0;p<i;p++){
                if(nums[p]<nums[i]){
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