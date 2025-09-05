class Solution {
    public String reverseWords(String s) {
        s = s.replaceAll("\\s+", " ").trim();
        String[] parts= s.split(" ");
        StringBuilder rev = new StringBuilder();
        for(int i=parts.length-1;i>=0;i--){
            if(i == 0){
                rev.append(parts[i]);    
            }
            else{
            rev.append(parts[i]+" ");
        }
        }
        
        return rev.toString(); 
    }
}