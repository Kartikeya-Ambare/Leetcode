class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> sett = new HashSet<>();

        for(int i = 0;i<=s.length()-k;i++){
            String curr = s.substring(i,i+k);
            sett.add(curr);
        }
        
        return sett.size() == Math.pow(2,k);
    }
}