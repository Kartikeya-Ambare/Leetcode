class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        // Because from and to is between 0 and 1000. Idea is to store counts in an array of size 1001.
        int lengthOfTrip[] = new int[1001];
        for (int trip[] : trips){
            lengthOfTrip[trip[1]] += trip[0];
            lengthOfTrip[trip[2]] -= trip[0];
        }
        int carLoad = 0;
        for (int i = 0; i < 1001; i++){
            carLoad += lengthOfTrip[i];
            if(carLoad > capacity) return false;
        }

        return true; 
    }
}