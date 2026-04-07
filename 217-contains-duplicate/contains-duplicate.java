class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> sett = new HashSet<>();

        for(int x: nums){
            if(sett.contains(x)) return true;
            sett.add(x);
        }

        return false;
    }
}