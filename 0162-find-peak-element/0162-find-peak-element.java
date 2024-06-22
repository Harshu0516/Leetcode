class Solution {
    public int findPeakElement(int[] a){
        int n=a.length;
        if(n==1) return 0;
        if(a[0]>a[1]) return 0;
        if(a[n-1]>a[n-2]) return n-1;
        int i=1;
        int j=n-2;
        while(i<=j){
            int m=(i+j)/2;
            if(a[m]>a[m+1] && a[m]>a[m-1]) return m;

            else if(a[m]>a[m-1]) i=m+1;

            else j=m-1;
        }
        return -1;
    }
}