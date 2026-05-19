class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 1;i<=n;i++){
            if(n%i == 0){
                arr.add(i);
            }
        }

        return arr.size()>=k?arr.get(k-1):-1;
    }
}