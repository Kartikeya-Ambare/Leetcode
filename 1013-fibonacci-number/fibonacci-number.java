class Solution {
    public int fib(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(1);
        for(int i = 2;i<=n;i++){
            nums.add(nums.get(i-1)+nums.get(i-2));
        }
        return nums.get(n);
    }
}