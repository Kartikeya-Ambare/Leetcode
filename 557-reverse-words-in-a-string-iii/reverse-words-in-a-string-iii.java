class Solution {
    public static StringBuilder rev(String s){
        StringBuilder rs = new StringBuilder(s);
        return rs.reverse();
    }
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder rs = new StringBuilder();
        String parts[] = s.split(" ");
        for(int i =0;i<parts.length;i++){
            rs.append(rev(parts[i]));
            if(i != parts.length-1){
                rs.append(" ");
            }
        }
        return rs.toString();
    }
}