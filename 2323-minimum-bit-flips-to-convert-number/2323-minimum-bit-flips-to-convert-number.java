class Solution {
    static int countingBits(int n){
        // if(n==0) return 0;
        int c=0;
        while(n!=0){
            c++;
            n=n&(n-1);
        }
        return c;
    }
    public int minBitFlips(int start, int goal) {
        int ans=start^goal;
        return countingBits(ans);
        
    }
}