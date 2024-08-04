class Solution {
    static int fun(int[] A,int k){
        int L=0;
        int R=0;
        int c=0;
        Map<Integer,Integer> mp=new HashMap<>();
        while(R<A.length){
            int val=mp.getOrDefault(A[R],0)+1;
            mp.put(A[R],val);
            while(mp.size()>k){
                int x=mp.get(A[L])-1;
                mp.put(A[L],x);
                if(mp.get(A[L])==0) mp.remove(A[L]);
                L++;
            }
            c=c+(R-L+1);
            R++;
        }
        return c;
    }
    public int subarraysWithKDistinct(int[] A, int k) {
        return fun(A,k)-fun(A,k-1);
    }
}