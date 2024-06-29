class Solution {
    public boolean searchMatrix(int[][] a, int t) {
        int n=a.length;
        int m=a[0].length;
        int r=0;
        int c=m-1;
        while(r<n && c>=0){
            int x=a[r][c];
            if(x==t) return true;
            else if(x<t) r++; 
            else c--;
        }
        return false;
    }
}