class Solution {
    static int LowBound(int []A,int x){
        int n=A.length;
        int i=0;
        int j=n-1;
        int ans=n;
        while(i<=j){
            int m=(i+j)/2;
            if(A[m]>=x){
                ans=m;
                j=m-1;
            }
            else{
                i=m+1;
            }
        }
        return ans;
    }
        static int UpperBound(int []A,int x){
        int n=A.length;
        int i=0;
        int j=n-1;
        int ans=n;
        while(i<=j){
            int m=(i+j)/2;
            if(A[m]>x){
                ans=m;
                j=m-1;
            }
            else{
                i=m+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] A, int t) {
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
       if(A.length==0){
         return ans;
       }
       int lb=LowBound(A,t);
       int ub=UpperBound(A,t);

       if(lb==A.length || A[lb]!=t) return ans;
       else {
        ans[0]=lb;
        ans[1]=ub-1;
        return ans;
       }
    }
}