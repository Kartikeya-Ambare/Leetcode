class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : t.toCharArray()) freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        int start = 0, minLen = Integer.MAX_VALUE, count = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (freq.containsKey(ch)) {
                if (freq.get(ch) > 0) count++;
                freq.put(ch, freq.get(ch) - 1);
            }
            while (count == t.length()) {
                if ((i - start + 1) < minLen) {
                    minLen = i - start + 1;
                    ans = s.substring(start, i + 1);
                }
                char leftChar = s.charAt(start);
                if (freq.containsKey(leftChar)) {
                    freq.put(leftChar, freq.get(leftChar) + 1);
                    if (freq.get(leftChar) > 0) count--;
                }
                start++;
            }
        }
        return ans;
    }
}