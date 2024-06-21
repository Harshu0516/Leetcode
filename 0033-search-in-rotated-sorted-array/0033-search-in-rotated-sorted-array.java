class Solution {
    public int search(int[] a, int t) {
        int i=0;
        int j=a.length-1;
        while(i<=j){
            int m=(i+j)/2;
            if(a[m]==t) return m;
            if(a[i]<=a[m]){
                if(a[i]<=t && t<=a[m]){
                    j=m-1;
                }
                else i=m+1;
            }
            else{
                if(a[m]<=t && t<=a[j]){
                    i=m+1;
                }
                else j=m-1;
            }
        }
        return -1;
    }
}