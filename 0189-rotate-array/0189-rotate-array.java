class Solution {
    static void swap(int[] a,int i,int j){
        while(i<j){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
    }
    public void rotate(int[] a, int k) {
        int n=a.length-1;
        k=k%(n+1);
        swap(a,n-k+1,n);
        swap(a,0,n-k);
        swap(a,0,n);
    }
}