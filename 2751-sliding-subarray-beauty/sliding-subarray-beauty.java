class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
    //     int arr[] = new int[nums.length-k+1];

    //     int freq[] = new int[101];

    //     Arrays.fill(freq,0);


    //     for(int i =0;i<k;i++){
    //         freq[nums[i]+50]++;
    //     }

    //     arr[0] = getNeg(nums,freq,x);

    //     for(int i = k;i<nums.length;i++){
    //         freq[nums[i]+50]--;
    //         freq[nums[i]+50]++;

    //         arr[i-k+1] = getNeg(nums,freq,x);
    //     }

    //     return arr;
    // }

    // public static int getNeg(int arr[],int freq[], int k){
    //     for(int i = 0;i<50;i++){
    //         if(freq[i]==1 && k != 0){
    //             k--;
    //         } 
    //         else if(freq[i] == 1 && k == 0){
    //             return arr[i-50];
    //         }
    //     }
    //     return 0;
    // }

    int arr[] = new int[nums.length - k + 1];
        int freq[] = new int[101];

        // Initialize the first window
        for (int i = 0; i < k; i++) {
            freq[nums[i] + 50]++;
        }

        arr[0] = getNeg(freq, x);

        // Slide the window
        for (int i = k; i < nums.length; i++) {
            freq[nums[i - k] + 50]--; 
            freq[nums[i] + 50]++;     

            arr[i - k + 1] = getNeg(freq, x);
        }

        return arr;
    }

    public static int getNeg(int freq[], int x) {
        int count = x;
        for (int i = 0; i < 50; i++) {
            if (freq[i] > 0) {
                count -= freq[i]; 
                
                if (count <= 0) {
                    return i - 50; 
                }
            }
        }
        return 0;
    }
}