class Solution {
    public int[] countBits(int n) {
        // int arr[] = new int[n+1];
        // for(int i = 0;i<=n;i++){
        //     if(i == 0){
        //         arr[i]=0;
        //     }
        //     if(i == 1){
        //         arr[i]=1;
        //     }
        //     else{
        //         int knt = 0;
        //         int temp = i;
        //         while(temp > 0){
        //             temp = temp & (temp - 1);
        //             knt++;
        //         }
        //         arr[i] = knt;
        //         arr[i]=knt;
        //     }
        // }
        // return arr;

        int dp[] = new int[n+1];

        for(int i =0;i<=n;i++){
            dp[i] = dp[i>>1]+(i&1);
        }
        return dp;
    }
}