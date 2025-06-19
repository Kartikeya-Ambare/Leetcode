class Solution {
    public boolean areNumbersAscending(String s) {
        ArrayList<Integer> nums = new ArrayList<>();
        String[] parts = s.split(" ");
        for (String part : parts) {
            if (part.matches("\\d+")) {
                nums.add(Integer.parseInt(part));
            }
        }
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) <= nums.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}