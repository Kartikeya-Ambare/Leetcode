class Solution {
    public int lb(int[] arr, int x) {
        int lb = -1;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                lb = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return (lb != -1 && arr[lb] == x) ? lb : -1;
    }
    
    public int ub(int[] arr, int x) {
        int ub = -1;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                ub = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ub == -1 ? arr.length - 1 : ub - 1;
    }
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int left = lb(nums,target);
        if( left == -1){
            return new ArrayList<>();
        }
        int right = ub(nums,target);
        
        List<Integer> ans = new ArrayList<>();
        if(left == right){
            ans.add(left);
            return ans;
        }
        for(int i = left;i<=right;i++){
            ans.add(i);
        }
        return ans;
    }
}