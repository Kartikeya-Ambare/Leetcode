class Solution {
    public String removeKdigits(String num, int k) {
        if(k == num.length()){
            return "0";
        }
        Stack<Integer> st = new Stack<>();

        st.push(0);

        for(int i=1;i<num.length();i++){
            while(!st.isEmpty() && k>0 && num.charAt(st.peek())>num.charAt(i)){
                st.pop();
                k--;
            }
            st.push(i);
        }

        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }


        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.insert(0,num.charAt(st.peek()));
            st.pop();
        }

        int i = 0;
        while (i < sb.length() && sb.charAt(i) == '0') {
            i++;
        }
        sb.delete(0, i);

        return sb.length()==0 ? "0" : sb.toString();
    }
}