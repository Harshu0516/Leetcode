class Solution {
    public boolean searchMatrix(int[][] a, int t) {
        int n=a.length;
        int m=a[0].length;
        int i=0,j=m-1;
        while(i<n && j>=0){
            // Search start from here
            int x=a[i][j];
            if(x==t) return true;
            else if(t<x) j--;
            else i++;
        }
        return false;
    }
}