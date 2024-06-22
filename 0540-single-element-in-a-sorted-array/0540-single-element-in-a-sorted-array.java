class Solution {
    public int singleNonDuplicate(int[] a) {
        int n=a.length;
        if(n==1) return a[0];

        if(a[0]!=a[1]) return a[0];

        if(a[n-1]!=a[n-2]) return a[n-1];

        int i=1;
        
        int j=n-2;

        while(i<=j){

            int m=(i+j)/2;

            if(a[m]!=a[m+1] && a[m]!=a[m-1]) return a[m];

            //Left half eliminates*******
            if((m%2==1 && a[m]==a[m-1]) || (m%2==0 && a[m]==a[m+1])){
                i=m+1;
            }
            // eliminating right half
            else {
                j=m-1;
            } 
        }
        return -1;
    }
}