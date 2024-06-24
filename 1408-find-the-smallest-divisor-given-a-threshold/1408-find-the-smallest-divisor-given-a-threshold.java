class Solution {
    static int maxArr(int[] a){
        int m=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            m=Math.max(m,a[i]);
        }
        return m;
    }
    static boolean sumByD(int []a,int d,int t){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=Math.ceil((double)a[i]/(double)d);
            if(sum>t) return false;
        }
        return true;
    }
    public int smallestDivisor(int[] a, int th) {
        int n=a.length;
        if(n>th) return -1;
        int maxi=maxArr(a);

        int i=1;
        int j=maxi;
        while(i<=j){
            int mid=(i+j)/2;
            if(sumByD(a,mid,th)){
                j=mid-1;
            }
            else i=mid+1;
        }
        return i;
    }
}