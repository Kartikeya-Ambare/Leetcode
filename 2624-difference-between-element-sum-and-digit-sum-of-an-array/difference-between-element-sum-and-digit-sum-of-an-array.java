class Solution {
    public int differenceOfSum(int[] nums) {
        int sum_t = 0;
        int sum_d = 0;
        for(int i =0;i<nums.length;i++){
            sum_t+=nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>9){
               sum_d+=dig(Integer.toString(nums[i]));
                continue;
            }
            else{
            sum_d+=nums[i];    
            }
        }
        int num = sum_t-sum_d;
            return (int)Math.abs(num);
        }

    public static int dig(String n){
        int c = 0;
        for(int i =0;i<n.length();i++){
            c+=Character.getNumericValue(n.charAt(i));
        }
        return c;
    }

}