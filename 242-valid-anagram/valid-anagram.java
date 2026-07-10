class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        int arr[] = new int[26];

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            arr[ch-'a']++;
            char ch2 = t.charAt(i);
            arr[ch2-'a']--;
        }
        for(int x:arr){
            if (x!= 0){
                return false;
            }
        }
        return true;
    }
}