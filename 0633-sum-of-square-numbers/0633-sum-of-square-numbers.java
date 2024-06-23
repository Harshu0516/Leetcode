class Solution {
    public boolean judgeSquareSum(int c) {
        long i=0;
        long j=(long)Math.sqrt(c);
        while(i<=j){
            long m=(i*i) + (j*j);
            if(m==(long)c) return true;
            else if(m>c) j--;
            else i++;
        }
        return false;
    }
}