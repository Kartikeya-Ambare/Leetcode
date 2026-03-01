class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // int [] ans  = new int[nums.length-k];

        // for(int i = 0;i<nums.length-k;i++){
        //     ans[i] = get_ans(nums,i,i+k);
        // }
        // return ans;

        // ArrayList<Integer> ans = new ArrayList<>();
        // PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        // int i = 0;

        // for(;i<k;i++){
        //     queue.add(nums[i]);
        // }

        // ans.add(queue.peek());

        // queue.remove(nums[0]);

        // for(;i<nums.length;i++){
        //     queue.add(nums[i]);
        //     ans.add(queue.peek());
        //     queue.remove(nums[i-k+1]);
        // }

        // return ans.stream().mapToInt(j -> j).toArray();


        Deque<Integer> Dq = new ArrayDeque<>();
        int[] ans = new int[nums.length - k + 1]; 

        int i;
        for (i = 0; i < k; ++i) {
            while (!Dq.isEmpty() && nums[i] >= nums[Dq.peekLast()]) Dq.removeLast();
            Dq.addLast(i);
        }
        ans[0] = nums[Dq.peekFirst()];  

        for (; i < nums.length; ++i) {
            while (!Dq.isEmpty() && Dq.peekFirst() <= i - k) Dq.removeFirst(); 
            while (!Dq.isEmpty() && nums[i] >= nums[Dq.peekLast()]) Dq.removeLast();  
            Dq.addLast(i);
            ans[i - k + 1] = nums[Dq.peekFirst()];  
        }
        return ans;

    }
    // public int get_ans(int nums[],int i,int j){
    //     int maxx = 0;

    //     for(int curr = i;curr<j;curr++){
    //         maxx = Math.max(maxx,nums[curr]);
    //     }

    //     return maxx;
    // }
}