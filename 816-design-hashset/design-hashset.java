class MyHashSet {
    ArrayList<Integer> arr;
    // public MyHashSet() {
    //     arr = new ArrayList<>();
    // }
    
    // public void add(int key) {
    //     arr.add(key);
    // }
    
    // public void remove(int key) {
    //     for(int i = 0;i<arr.size();i++)
    //     {
    //         if(arr.get(i) == key){
    //             arr.remove(i);
    //         }
    //     }
    // }
    
    // public boolean contains(int key) {
    //     for(int i = 0;i<arr.size();i++)
    //     {
    //         if(arr.get(i) == key){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    
    public MyHashSet() {
        arr = new ArrayList<>();
    }
  
    public void add(int key) {
        if (!contains(key)) {
            arr.add(key);
        }
    }
  
    public void remove(int key) {
        int i = 0;
        while (i < arr.size()) {
            if (arr.get(i) == key) {
                arr.remove(i);
            } else {
                i++;
            }
        }
    }
  
    public boolean contains(int key) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == key) {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */