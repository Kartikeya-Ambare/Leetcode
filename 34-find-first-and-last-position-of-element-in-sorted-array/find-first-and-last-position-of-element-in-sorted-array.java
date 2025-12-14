class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length<2){
            if(nums.length==0 || nums[0]!=target) return new int[]{-1,-1};
            return new int[]{0,0};
        }
        int res [] = new int[]{-1,-1};
        int left = 0;
        int right = nums.length-1;
        
        // Find any occurrence first
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(nums[mid]<target){
                left=mid+1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                // Found target, now expand left and right
                int l = mid, r = mid;
                // Expand left
                while(l > 0 && nums[l-1] == target) l--;
                // Expand right  
                while(r < nums.length-1 && nums[r+1] == target) r++;
                res[0] = l;
                res[1] = r;
                return res;
            }
        }
        return res;
    }
}
