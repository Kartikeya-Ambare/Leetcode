class Solution {
    public String toHex(int num) {

        if(num == 0) {
            return "0" ;
        }

        long n = num ;

        if(num < 0) {
            n = (long)(Math.pow(2,32) + num) ;
        }

        StringBuilder ans = new StringBuilder() ;

        char[] hex = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'} ;

        while(n != 0) {
            ans.append(hex[(int)(n % 16)]) ;
            n /= 16 ;
        }

        return ans.reverse().toString() ;

    }
}