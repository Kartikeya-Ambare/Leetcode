class Solution {
    public String defangIPaddr(String address) {
        StringBuilder rs = new StringBuilder();

        for(int i =0;i<address.length();i++){
            if(address.charAt(i) == '.'){
                rs.append("[.]");
            }
            else{
                rs.append(address.charAt(i));
            }
        }
        return rs.toString();
    }
}