class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> arr = new ArrayList<>();

        for(int i =0;i<nums.length;i++){
            if(nums[i]>9){
                filll(arr,Integer.toString(nums[i]));
            }
            else{
                arr.add(nums[i]);
            }
        }
        return arr.stream().mapToInt(i -> i).toArray();
    }

    public static void filll(List<Integer> arr,String n){
        for(int i =0;i<n.length();i++){
            arr.add(Character.getNumericValue(n.charAt(i)));
        }
    }
}