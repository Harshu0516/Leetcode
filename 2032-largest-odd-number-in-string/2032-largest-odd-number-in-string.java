class Solution {
    public String largestOddNumber(String num) {
        int len=num.length();
        String str="";
        for(int i=len-1;i>=0;i--){
            char ch=num.charAt(i);
            if(ch=='1' || ch=='3'|| ch=='5' || ch=='7'|| ch=='9'){
                str=num.substring(0,i+1);
                break;
            }
        }
        return str;
    }
}