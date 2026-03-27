class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);

        int removed = 0;
        int last = intervals[0][1];

        for(int i = 1;i<intervals.length;i++){
            if(intervals[i][0]<last){
                removed++;
            }
            else{
                last = intervals[i][1];
            }
        }
        return removed; 

    }
    //  Integer[] arr = new Integer[finish.length];
    //     for(int i = 0;i<finish.length;i++){
    //         arr[i] = i;
    //     }
        
    //     Arrays.sort(arr, (a,b) -> (finish[a] - finish[b]));

        
    //     int maxAt = 1;
    //     int last = finish[arr[0]];
    //     for(int i = 1;i<finish.length;i++){
    //         int idx = arr[i];
    //         if(start[idx]>last){
    //             maxAt++;
    //             last = finish[idx];
    //         }
    //     }
    //     return maxAt;
}