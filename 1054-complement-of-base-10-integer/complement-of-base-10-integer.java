class Solution {
    public int bitwiseComplement(int n) {
        String num = Integer.toBinaryString(n);

        StringBuilder rs = new StringBuilder();

        for(int i = 0;i<num.length();i++){
            if(num.charAt(i) == '0'){
                rs.append('1');
            }
            else{
                rs.append('0');
            }
        }
        return Integer.parseInt(rs.toString(),2);
    }
}