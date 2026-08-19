class Solution {
    public int climbStairs(int n) {
       Integer memo[] = new Integer[n];

       return solver(n,n-1,memo); 
    }

    public static int solver(int n, int idx, Integer memo[]){
        if(idx<2) return memo[idx] = idx+1;

        if(memo[idx]!=null) return memo[idx];

        return memo[idx] = solver(n,idx-1,memo) +solver(n,idx-2,memo);
    }
}