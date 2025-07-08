import java.math.*;
class Solution {
    public String multiply(String num1, String num2) {
        //return Long.toString((Long.parseLong(num1)*Long.parseLong(num2)));
        BigInteger bNum1 = new BigInteger(num1);
        BigInteger bNum2 = new BigInteger(num2);

        BigInteger result = bNum1.multiply(bNum2);

        return result.toString();
    }
}