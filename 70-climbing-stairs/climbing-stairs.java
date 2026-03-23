class Solution {
    public int climbStairs(int n) {
        // ArrayList<Integer> lis = new ArrayList<>();
        // lis.add(1);
        // lis.add(2);
        // for(int i = 2 ;i<=n;i++){
        //     lis.add(lis.get(i-1)+lis.get(i-2));
        // }
        // return lis.get(n-1);
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return calc(dp,n);
    }

    public int calc(int dp[], int n){
        if(n<=2){
            return n;
        }

        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n] = calc(dp,n-1)+calc(dp,n-2);
        return dp[n];
    }
}