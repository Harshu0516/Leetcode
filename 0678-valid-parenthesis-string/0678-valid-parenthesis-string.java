class Solution {
    public boolean checkValidString(String s) {
        int mi=0,ma=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                mi++;
                ma++;
            }
            else if(ch==')'){
                mi--;
                ma--;
            }
            else{
                mi--;
                ma++;
            }
            if(mi<0) mi=0;
            if(ma<0) return false;
        }
        return (mi==0);
    }
}