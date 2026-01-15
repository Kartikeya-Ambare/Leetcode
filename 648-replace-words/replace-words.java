class Solution {
    // public String check(List<String> dict, String word){
    //     Iterator<String> it = dict.iterator();
    //     while(it.hasNext()){
    //         String w = it.next();
    //         // int len = w.length();
    //         // if(len>word.length()) continue;
    //         // String sub = word.substring(0,len);
    //         // if(sub.equals(w)){
    //         //     return w;
    //         // }
    //         if(w.length() > word.length()) continue;
    //         if(word.startsWith(w)){ 
    //         return w;  
    //     }
    //     }
    //     return word;
    // }
    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder rs = new StringBuilder();
        String parts[] = sentence.trim().split(" ");
        for(String part:parts){
            rs.append(check(dictionary,part)+" ");
        }
        return rs.toString().trim();
    }
    public String check(List<String> dict, String word){
    // for(String w : dict){
    //     if(w.length() > word.length()) continue;
    //     if(word.startsWith(w)){ 
    //         return w;  
    //     }
    // }
    // return word;
    String shortest = null;
        
        for(String w : dict){
            if(w.length() > word.length()) continue;
            
            String sub = word.substring(0, w.length());
            if(sub.equals(w)){
                if(shortest == null || w.length() < shortest.length()){
                    shortest = w;
                }
            }
        }
        
        return shortest != null ? shortest : word;
}
}