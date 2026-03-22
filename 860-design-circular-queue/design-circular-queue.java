class MyCircularQueue {
    int arr[];
    int fr,rr;
    int size;
    public MyCircularQueue(int k) {
        arr = new int[k];
        fr = -1;
        rr = -1;
        size = k;
    }
    
    public boolean enQueue(int value) {
        if(rr == -1 && fr == -1){
            fr++;
            rr++;
            arr[rr] = value;
            return true;
        }
        if((rr+1)%size == fr){
            return false;
        }
        rr=(rr+1)%size;
        arr[rr] = value;
        return true;
    }
    
    public boolean deQueue() {
        if(fr ==-1 && rr == -1){
            return false;
        }
        if(fr == rr){
            fr = -1;
            rr = -1;
            return true;
        }
        fr=(fr+1)%size;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return arr[fr];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return arr[rr];
    }
    
    public boolean isEmpty() {
        if(rr == -1){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if((rr+1)%size == fr){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */