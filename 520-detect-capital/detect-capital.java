class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        // All uppercase, all lowercase, or only first uppercase
        return count == word.length() || count == 0 || (count == 1 && Character.isUpperCase(word.charAt(0)));
    
    }
}