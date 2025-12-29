class Solution {
    // public int get_res(int val1,int val2, char op){
    //     if(op == '-'){
    //         return val1-val2;
    //     }
    //     else if(op == '+'){
    //         return val1+val2;
    //     }
    //     else if(op == '*'){
    //         return val1*val2;
    //     }
    //     else if(op == '/'){
    //         return val1/val2;
    //     }
    //     return 0;
    // }
    // public int calculate(String s) {
    //     s=s.trim();
    //     Stack<Integer> stk = new Stack<>();
    //     for(int i = 0 ; i<s.length() ; i++){
    //         if(s.charAt(i)>='1' && s.charAt(i)<='9'){
    //             stk.push(Character.getNumericValue(s.charAt(i)));
    //         }
    //         else if(s.charAt(i) == '-' ||
    //                 s.charAt(i) == '+' ||
    //                 s.charAt(i) == '*' ||
    //                 s.charAt(i) == '/'){
    //                     char op = s.charAt(i);
    //                     int val2 = s.charAt(i+1);
    //                     int val1 = stk.peek();
    //                     stk.pop();
    //                     stk.push(get_res(val1,val2,op));
    //                 }
                
    //     }
        
    //         return stk.peek();
    // }
    public int calculate(String s) {
       Stack<Integer> st = new Stack<>();
        char sgn = '+';
        long n = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            }
            if ((!Character.isDigit(c) && !Character.isWhitespace(c)) || i == s.length() - 1) {
                if (sgn == '+') st.push((int)n);
                else if (sgn == '-') st.push((int)(-n));
                else if (sgn == '*') st.push(st.pop() * (int)n);
                else if (sgn == '/') st.push(st.pop() / (int)n);
                
                sgn = c;
                n = 0;
            }
        }
        
        int res = 0;
        while (!st.isEmpty()) {
            res += st.pop();
        }
        return res;
    }
}