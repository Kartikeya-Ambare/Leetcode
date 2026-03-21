class Solution {
     static class Pair{
        String s;
        int count;
        Pair(String s, int count)
        {
            this.s=s;
            this.count=count;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            if(a.count!=b.count)
                return b.count - a.count;
            else
                return a.s.compareTo(b.s);
        });
        for(String s : words)
            map.put(s,map.getOrDefault(s,0)+1);
        for(String s : map.keySet())
            pq.offer(new Pair(s,map.get(s)));
        List<String> list = new ArrayList<>();
        int i=0;
        while(!pq.isEmpty())
        {
            Pair p = pq.poll();
            if(i<k)
                list.add(p.s);
            else
                return list;
            i++;
        }
        return list;
    }
}