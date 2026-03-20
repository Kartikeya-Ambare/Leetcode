class Solution {
    public int longestBalanced(String s) {
        // int freq[][] = new int[26][2];

        // for(char ch : s.toCharArray()){
        //     int num = ch-'a';
        //     freq[num][0]++;
        //     freq[num][1]=1;
        // }
        // int max = Integer.MAX_VALUE;

        // for(int i =0;i<freq.length;i++){
        //     if(freq[i][1] == 1){
        //         max = Math.min(freq[i][0],max);
        //     }
        // }
        // return max;


        int n = s.length();
        int res =0;
        int [] freq = new int[26];

        for(int i=0; i<n; i++){
            Arrays.fill(freq,0);
            int maxF =0, unique =0;
            for(int j =i; j<n; j++){
                int c = s.charAt(j) -'a';
                freq[c]++;
                if(freq[c]==1){
                    unique++;
                }
                maxF = Math.max(maxF, freq[c]);

                if(maxF* unique == j-i+1){
                    res = Math.max(res, j-i+1);
                }
            }
        }
        return res;

    }
}