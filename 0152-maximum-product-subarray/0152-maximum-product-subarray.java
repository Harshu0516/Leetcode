class Solution {
    public int maxProduct(int[] A) {
        int n=A.length;
        int ans=Integer.MIN_VALUE;
        int p=1,s=1;
        for(int i=0;i<n;i++){
            if(p==0) p=1;
            if(s==0) s=1;
            p*=(double)A[i];
            s*=(double)A[n-i-1];
            ans=Math.max(Math.max(p,s),ans);
        }
        return (int)ans;
    }
}