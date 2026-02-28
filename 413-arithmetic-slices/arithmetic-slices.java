class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3) return 0;

        int knt = 0;
        // int j = 3;
        // for(int i = 0;i<nums.length-2;i++){
        //     if(check(nums,i,i+3)) knt++;
        // }
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 2; j < nums.length; j++) {
                if (check(nums, i, j + 1)) {
                    knt++;
                } else {
                    break; 
                }
            }
        }

        // if(nums.length == 3){
        //     return knt;
        // }
        // if(check_full(nums)){
        //     knt++;
        // }

        return knt;

    }

    // public static boolean check_full(int arr[]){
    //     int diff = arr[1] - arr[0];
    //     for(int i = 0;i<arr.length-1;i++){
    //         if((arr[i+1]- arr[i])!= diff){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public static boolean check(int arr[],int start,int end){
    //     int diff = arr[start+1] - arr[start];
    //     for(int i = start+1;i<end;i++){
    //         if((arr[start+1]- arr[start])!= diff){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static boolean check_full(int arr[]){
        int diff = arr[1] - arr[0];
        for(int i = 0;i<arr.length-1;i++){
            if((arr[i+1]- arr[i])!= diff){
                return false;
            }
        }
        return true;
    }

    public static boolean check(int arr[],int start,int end){
        int diff = arr[start+1] - arr[start];
        for(int i = start+1;i<end;i++){
            if((arr[i]- arr[i-1]) != diff){
                return false;
            }
        }
        return true;
    }
}