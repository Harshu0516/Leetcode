class Solution {
    public int maxPower(String s) {
     int len=s.length();
     if(len==1) return 1;
     int maxi=0;
     int c=1;
     for(int i=1;i<len;i++){
        if(s.charAt(i)==s.charAt(i-1)){
            c++;
        }
        else{
        maxi=Math.max(c,maxi);
        c=1;
        }
     }   
    return (c<maxi)?maxi:c;
    }
}