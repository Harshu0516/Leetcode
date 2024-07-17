class Solution {
    public boolean isValid(String s) {
        int len=s.length();
        if(len==1) return false;
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if((ch=='[') || (ch=='(') || (ch=='{')){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;

                char ch1=st.pop();
                if((ch==']' && ch1=='[') || (ch==')' && ch1=='(') || (ch=='}' && ch1=='{')) continue;

                else return false;
 
            }
        }
        return st.isEmpty();
    }
}