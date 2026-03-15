class Fancy {
    // ArrayList<Long> res;
    // public Fancy() {
    //     res = new ArrayList<>();
    // }
    
    // public void append(int val) {
    //     res.add(val);
    // }
    
    // public void addAll(int inc) {
        
    //     for(int i = 0;i<res.size();i++){
    //         //int curr = res.get(i);
    //         res.set(i,res.get(i)+inc);
    //     }
    // }
    
    // public void multAll(int m) {
    //     for(int i = 0;i<res.size();i++){
    //         //int curr = res.get(i);
    //         res.set(i,res.get(i)*m);
    //     }
    // }
    
    // public int getIndex(int idx) {
    //     idx = idx%1000000007;
    //     if(idx<res.size()){
    //         return res.get(idx);
    //     }
    //     return -1;
    // }




    // ArrayList<Long> list;
    // long MOD = 1_000_000_007L;

    // public Fancy() {
    //     list = new ArrayList<>();
    // }
    
    // public void append(int val) {
    //     list.add((long) val);
    // }
    
    // public void addAll(int inc) {
    //     for (int i = 0; i < list.size(); i++) {
    //         list.set(i, (list.get(i) + inc) % MOD);
    //     }
    // }
    
    // public void multAll(int m) {
    //     for (int i = 0; i < list.size(); i++) {
    //         list.set(i, (list.get(i) * m) % MOD);
    //     }
    // }
    
    // public int getIndex(int idx) {
    //     if (idx >= list.size()) return -1;
    //     return (int)(list.get(idx) % MOD);
    // }





    private static final int MOD = 1000000007;
    private ArrayList<Long> val;  
    private long a, b;   

    public Fancy() {
        val = new ArrayList<>(); 
        a = 1;
        b = 0;
    }

    private long modPow(long x, long y, long mod) {
        long res = 1;
        x = x % mod;
        while (y > 0) {
            if (y % 2 == 1) {
                res = (res * x) % mod;
            }
            y = y / 2;
            x = (x * x) % mod;
        }
        return res;
    }

    public void append(int val) {
        long x = (val - b + MOD) % MOD;
        this.val.add((x * modPow(a, MOD - 2, MOD)) % MOD);  
    }

    public void addAll(int inc) {
        b = (b + inc) % MOD;
    }

    public void multAll(int m) {
        a = (a * m) % MOD;
        b = (b * m) % MOD;
    }

    public int getIndex(int idx) {
        if (idx >= val.size()) return -1; 
        return (int)((a * val.get(idx) + b) % MOD);
    }
}

/**
 * Your Fancy object will be instantiated and called as such:
 * Fancy obj = new Fancy();
 * obj.append(val);
 * obj.addAll(inc);
 * obj.multAll(m);
 * int param_4 = obj.getIndex(idx);
 */