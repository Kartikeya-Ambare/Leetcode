class MapSum {
    Map<String,Integer> mapp;
    public MapSum() {
        mapp = new HashMap<>();
    }
    
    public void insert(String key, int val) {
        mapp.put(key,val);
    }
    
    public int sum(String prefix) {
        int sum = 0;
        for(Map.Entry<String,Integer> map2:mapp.entrySet()){
            String temp = map2.getKey();
            int idx = temp.indexOf(prefix);
            if(idx == 0){
                sum+=map2.getValue();
            }
        }
        return sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */