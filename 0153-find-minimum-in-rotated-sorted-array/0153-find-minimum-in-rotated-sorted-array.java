class Solution {
    public int findMin(int[] a) {
        int n=a.length;
        int i=0;
        int j=n-1;
        int sol=Integer.MAX_VALUE;
        while(i<=j){
            int m=(i+j)/2;
            if(a[i]<=a[m]){
                sol=Math.min(sol,a[i]);
                i=m+1;
            }
            else{
                sol=Math.min(sol,a[m]);
                j=m-1;
            }
        }
        return sol;
    }
}