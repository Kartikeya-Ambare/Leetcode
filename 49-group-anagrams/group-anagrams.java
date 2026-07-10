class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapp = new HashMap<>();

        //List<List<String>> ls = new ArrayList<<>>();

        for(String s: strs){
            char [] ch = s.toCharArray();

            Arrays.sort(ch);

            String key = new String(ch);
            if(!mapp.containsKey(key)){
                mapp.put(key,new ArrayList<>());
            }
            mapp.get(key).add(s);
        }

        return new ArrayList<>(mapp.values());

    }
}