class Solution {
    public boolean isPerfectSquare(int n) {
        if(n==1) return true;
        int i=1;
        int j=n;
        while(i<=j){
            long m=i+(j-i)/2;
            long val=m*m;
            if(val==(long)n) return true;
            else if(val<(long)n){
                i=(int)(m+1);
            }
            else j=(int)(m-1);
        }
    
    return false;
   }
}