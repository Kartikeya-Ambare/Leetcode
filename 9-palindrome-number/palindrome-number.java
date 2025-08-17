class Solution {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        StringBuilder rev = new StringBuilder();
        for(int i =num.length()-1;i>=0;i--){
            rev.append(num.charAt(i));
        }
        String reversed = rev.toString();
        return reversed.equals(num);
    }
}