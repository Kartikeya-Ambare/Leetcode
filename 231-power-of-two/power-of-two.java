import java.lang.Math;

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) return false;
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
        /*
        if( n == 1 || n == 2){
            return true;
        }
        else{
            int new_val=n;
            String nlen=String.valueOf(new_val);
            while(nlen.length()>=2){
                new_val=(int) Math.round(Math.sqrt(new_val));
                nlen=String.valueOf(new_val);
            }
            if(new_val == 2 || new_val == 4 || new_val==8){
                return true;
            }
            else{
                return false;
            }*/
            /*int curr_num = 2, input_num=n;
            while(curr_num<=input_num){
                curr_num=curr_num*2;
                input_num=input_num/2;
                if(curr_num == input_num){
                    return true;
                }
                
            }
            return false;*/
        
    }
}