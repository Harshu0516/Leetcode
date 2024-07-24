class Solution {
    static int countingBits(int n){
        // if(n==0) return 0;
        int c=0;
        while(n>0){
            c+=(n&1);
            n=n>>1;
        }
        return c;
    }
    public int[] countBits(int n) {
        int a[]=new int[n+1];
        a[0]=0;
        for(int i=1;i<=n;i++) a[i]=countingBits(i);
        
        
        return a;  
    }
    
}