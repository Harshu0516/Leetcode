class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int N=g.length;
        int M=s.length;
        int L=0,R=0;
            while(L<M && R<N){
                if(s[L]>=g[R]){
                    R++;
                    // L++;
                }   
                L++;
            }
            return R;
    }
}