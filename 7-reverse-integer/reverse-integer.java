class Solution {
    public int reverse(int x) {
        if(x == 0){
            return 0;
        }
        int sign=(x>0?1:-1);
        String num = Integer.toString(x);
        int reversed = rev(num,sign);
        return reversed;

    }
    public int rev(String s,int sign){
        if(sign == -1){
            String part = s.substring(1);
            StringBuilder revnum = new StringBuilder();
            for(int i =0;i<part.length();i++){
                revnum.append(part.charAt(i));
            }
            revnum=revnum.reverse();
            s = revnum.toString();
            s = check_if_zero(s);
            long reversedLong = Long.parseLong(s);
            if (reversedLong > Integer.MAX_VALUE) return 0;
            int reversed = (int) reversedLong;
            return reversed*sign;
        }
            StringBuilder revnum = new StringBuilder();
            for(int i =0;i<s.length();i++){
                revnum.append(s.charAt(i));
            }
            revnum=revnum.reverse();
            s = revnum.toString();
            s = check_if_zero(s);
            long reversedLong = Long.parseLong(s);
            if (reversedLong > Integer.MAX_VALUE) return 0;
            int reversed = (int) reversedLong;
            return reversed*sign;
    }
    public String check_if_zero(String str){
        if(str.charAt(0) == 0){
            return str.substring(1);
        }
        return str;
    }
    }
