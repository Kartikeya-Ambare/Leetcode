class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // if(jewels.length()<stones.length())
        //     return count_same(jewels,stones);
        // else
        //     return count_same(stones,jewels);
        int sum = 0;
        for(int i =0;i<jewels.length();i++){
            for(int j =0;j<stones.length();j++)
                if(jewels.charAt(i) == stones.charAt(j)){
                    sum++;
                }
        }
        return sum;
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