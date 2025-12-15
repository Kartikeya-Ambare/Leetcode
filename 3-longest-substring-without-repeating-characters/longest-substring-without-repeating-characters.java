class Solution {
    public int lengthOfLongestSubstring(String s) {
        int right=0, left = 0, maxlen = 0;
        HashMap<Character,Integer> charMap =new HashMap<>();
        for(right = 0;right<s.length();right++){
            char curr_char = s.charAt(right);
            if(charMap.containsKey(curr_char)){
                left = Math.max(left, charMap.get(curr_char)+1);
            }
            charMap.put(curr_char, right);
            maxlen = Math.max(maxlen, right-left+1);
        }
        return maxlen;

    }
}