class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend < 0 && divisor ==-1 && dividend<=Integer.MIN_VALUE){
            return Integer.MAX_VALUE;
        }
        return (int)Math.floor(dividend/divisor);
    }
}