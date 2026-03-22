class Number implements Comparable<Number>{
    int ele;
    int freq;

    Number(int ele,int freq){
        this.ele=ele;
        this.freq=freq;
    }

    public int compareTo(Number that){
        return that.freq - this.freq;
    }


}
class Solution {
     

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int a : nums){
            map.put(a, map.getOrDefault(a,0)+1);
        }   

        PriorityQueue<Number> pq = new PriorityQueue<>();

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            Number num = new Number(entry.getKey(),entry.getValue());
            pq.offer(num);
        }

        int res[] = new int[k];

        int idx = 0;

        while(idx<k){
            Number num = pq.poll();
            res[idx] = num.ele;
            idx++;
        }

        return res;



        // List<Integer>[] bucket = new List[nums.length+1];
        
        // for(Map.Entry<Integer,Integer> e : map.entrySet()){
        //     int freq = e.getValue();
        //     if(bucket[freq] == null){
        //         bucket[freq] = new ArrayList<>();
        //     }
        //     bucket[freq].add(e.getKey());
        // }
        // int ans[] = new int[k];
        // int index = 0;
        // for(int i = bucket.length - 1;i >= 0 && index < k;i--){
        //     if(bucket[i] != null){
        //         for(int num : bucket[i]){
        //             ans[index++] = num;
        //             if(index == k) break;
        //         }
        //     }
        // }
        // return ans;

         
    }
}