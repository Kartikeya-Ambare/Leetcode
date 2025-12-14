class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 1){
            return true;
        }
        

        // while(n>4){
        //     n = (int)Math.floor(Math.sqrt(n));
        // }
        // return n == 4? true:false;
        long num= 1;
        while(num<=n){
            if(num==n){
                return true;
            }
            num=num*3;
        }
        return false;
    }
}