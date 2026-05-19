class Solution {
    public int findMin(int[] nums) {
        TreeSet<Integer>sett = new TreeSet<>();

        for(int x:nums){
            sett.add(x);
        }
        return (int)sett.first();
    }
}