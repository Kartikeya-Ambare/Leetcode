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
        // Avoid duplicates on add
        if (!contains(key)) {
            arr.add(key);
        }
    }
  
    public void remove(int key) {
        // Continue searching after removal due to shifting indices
        int i = 0;
        while (i < arr.size()) {
            if (arr.get(i) == key) {
                arr.remove(i);
                // Don't increment i - check same index again
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