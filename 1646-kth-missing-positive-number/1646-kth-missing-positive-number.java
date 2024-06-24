class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
       // special case by me
        if(arr[0]>k) return k;
        int i=0;
        int j=n-1;
        while(i<=j){
            int mid=(i+j)/2;
            int miss=arr[mid]-(mid+1);
            if(miss<k){
                i=mid+1;
            }
            else j=mid-1;
        }
        //int x=arr[j]+(k-(arr[j]-(j+1)));
        // x=k+j+1;
        // simplify to this
        return i+k;
    }
}