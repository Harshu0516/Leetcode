class Solution {
    public int longestOnes(int[] A, int k) {
        int L=0,R=0,len=0,z=0;
        while(R<A.length){
            if(A[R]==0) z++;

            if(z>k){
                if(A[L]==0) z--;
                L++;
            }
            if(z<=k){
                len=Math.max(len,R-L+1);
            }
            R++;
        }
        return len;
    }
}