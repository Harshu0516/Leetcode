class Solution {
    static int poss(int[]a,int mid){
        int std=1;
        long ps=0;
        for(int i=0;i<a.length;i++){
            if(ps+a[i]<=mid){
                ps+=a[i];
            }
            else{
                std++;
                ps=a[i];
            }
        }
        return std;
    }
    public int splitArray(int[] a, int k) {
        int n=a.length;
        if(k>n) return -1;
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,a[i]);
            sum+=a[i];
        }
        int i=maxi;
        int j=sum;
        while(i<=j){
            int mid=(i+j)/2;
            if(poss(a,mid)>k){
               
                i=mid+1;
            }
            else  j=mid-1;
        }
        return i;
    }
}