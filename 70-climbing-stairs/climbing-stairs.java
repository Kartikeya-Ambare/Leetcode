class Solution {
    public int climbStairs(int n) {
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(1);
        lis.add(2);
        for(int i = 2 ;i<=n;i++){
            lis.add(lis.get(i-1)+lis.get(i-2));
        }
        return lis.get(n-1);
    }
}