class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        if(jewels.length()<stones.length())
            return count_same(jewels,stones);
        else
            return count_same(stones,jewels);
    }
    public int count_same(String minn,String maxx){
        int sum = 0;
        for(int i =0;i<minn.length();i++){
            for(int j =0;j<maxx.length();j++)
                if(minn.charAt(i) == maxx.charAt(j)){
                    sum++;
                }
        }
        return sum;
    }
}