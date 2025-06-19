class Solution {
    public boolean isPerfectSquare(int num) {
        double nums=Math.sqrt(num);
        if(nums == Math.floor(nums)){
            return true;
        }
        else{
            return false;
        }    
    }
}