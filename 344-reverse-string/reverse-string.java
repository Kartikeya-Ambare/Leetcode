class Solution {
    public void swap(char [] s, int idx1,int idx2){
        char temp = s[idx1];
        s[idx1]=s[idx2];
        s[idx2]=temp;
    }
    public void reverseString(char[] s) {
        for(int i =0;i<s.length/2;i++){
            swap(s,i,s.length-i-1);
        }
    }
}