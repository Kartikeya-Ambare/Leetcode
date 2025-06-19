class Solution {
    public int myAtoi(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.trim();

        int sign = 1, i = 0;
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            sb.append(s.charAt(i));
            i++;
        }

        if (sb.length() == 0) return 0;

        try {
            int num = sign * Integer.parseInt(sb.toString());
            return num;
        } catch (NumberFormatException e) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
    }
}