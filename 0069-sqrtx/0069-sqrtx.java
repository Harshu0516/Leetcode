class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1) return x;
        int i=1;
        int j=x;
        while(i<=j){
            long m=i+(j-i)/2;
            long val=m*m;
            if(val<=(long)x){
                i=(int)(m+1);
            }
            else{
                j=(int)(m-1);
            }
        }
        return j;
    }
}