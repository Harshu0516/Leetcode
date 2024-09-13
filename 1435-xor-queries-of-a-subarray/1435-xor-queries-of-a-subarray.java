class Solution {
    static int doing(int x,int y,int[] A){
        int s=A[x];
        for(int i=x+1;i<=y;i++){
            s=s^A[i];
        }
        return s;
    }
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=arr.length;
        int m=queries.length;
        int ans[]=new int[m];
        for(int i=0;i<m;i++){
            int x=queries[i][0];
            int y=queries[i][1];
            ans[i]+=doing(x,y,arr);
        }
        return ans;
    }
}