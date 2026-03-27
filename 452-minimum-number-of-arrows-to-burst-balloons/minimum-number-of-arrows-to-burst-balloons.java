class Solution {
    public int findMinArrowShots(int[][] points) {
        // Arrays.sort(points,(a,b)->a[1]-b[1]);

        // int over1 = 0;
        
        // int non = 1;
        // int last = points[0][1];

        // for(int i = 1;i<points.length;i++){
        //     if(points[i][0]<last){
        //         over++;
        //     }
        //     else{
        //         last = points[i][1];
        //         non++;
        //     }
        // }
        // return over>0?over:non;
        Arrays.sort(points,(a,b)->(a[1]<=b[1])?-1:1);

        int arrows = 1;
        
        int non = 1;
        int last = points[0][1];

        // for(int i = 1;i<points.length;i++){
        //     if(points[i][0]<last){
        //         arrows++;
        //     }
        //     else{
        //         last = points[i][1];
        //         non++;
        //     }
        // }
        // return arrows>0?arrows:non;
        for(int pt[]:points){
            if(pt[0]>last){
                arrows++;
                last = pt[1];
            }
        }
        return arrows;
    }
}