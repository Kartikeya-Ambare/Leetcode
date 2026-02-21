class SnapshotArray{
    // public List<int[]>[] h;
    // public int snap = 0;
    // public SnapshotArray(int length) {
    //     h = new List[length];
    //     for (int i = 0; i < length; i++) {
    //         h[i] = new ArrayList<>();
    //         h[i].add(new int[]{-1, 0});
    //     }
    // }
    
    // public void set(int index, int val) {
    //     h[index].add(new int[]{snap, val});
    // }
    
    // public int snap() {
    //     return snap++;
    // }
    
    // public int get(int index, int snap_id) {
    //     List<int[]> temp = h[index];
    //     int l = 0, r = temp.size() - 1;
    //     while (l < r) {
    //         int m = r - (r - l) / 2;
    //         if (temp.get(m)[0] <= snap_id) l = m;
    //         else r = m - 1;
    //     }
    //     return temp.get(l)[1];
    // }

    int snapId;
    List<Map<Integer,Integer>> al;

    public SnapshotArray(int length) {
        al = new ArrayList<>();
        al.add(new HashMap<>());
        snapId =0;
    }
    
    public void set(int index, int val) {
        al.get(snapId).put(index,val);
    }
    
    public int snap() {
        snapId++;
        al.add(new HashMap<>());
        
        return snapId-1;
    }
    
    public int get(int index, int snap_id) {
        for(int i=snap_id;i>=0;i--)
        {
            if(al.get(i).containsKey(index))
                return al.get(i).get(index);
        }
        return 0;
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */