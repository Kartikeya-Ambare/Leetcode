class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int maxT = k*threshold;

        int knt = 0;

        int sum = 0;

        for(int i = 0 ;i<k;i++){
            sum+=arr[i];
        }

        if(sum>=maxT)knt++;

        for(int i = k ;i<arr.length;i++){
            sum=sum + arr[i]-arr[i-k];
            if(sum>=maxT) knt++;
        }
        return knt;
    }
}