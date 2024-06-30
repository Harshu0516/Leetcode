class Solution {
    static int fun(int a[][],int c){
        int m=-1;
        int idx=-1;
        for(int i=0;i<a.length;i++){
            if(a[i][c]>m){
                idx=i;
                m=a[i][c];
            }
        }
        return idx;
    }
    public int[] findPeakGrid(int[][] a) {
        int n=a.length;
        int m=a[0].length;
        
        int i=0;
        int j=m-1;
        while(i<=j){
            int mid=(i+j)>>1;
            int maxROWIDX=fun(a,mid);
            
            int left=mid-1>=0? a[maxROWIDX][mid-1]:-1;
            int right=mid+1<m? a[maxROWIDX][mid+1]:-1;

            if(a[maxROWIDX][mid]>left && a[maxROWIDX][mid]>right){
                return new int[]{maxROWIDX,mid};
            }
            else if (a[maxROWIDX][mid]<left) j=mid-1;
            else i=mid+1;
        }
        return new int[]{-1,-1};
    }
}