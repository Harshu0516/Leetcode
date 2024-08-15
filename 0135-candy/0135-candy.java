class Solution {
    public int candy(int[] A) {
        int n=A.length;
        int i=1,s=1,d=1,p=1;
        while(i<n){
            if(i<n && A[i]==A[i-1]){
                s+=1;
                i++;
                continue;
            }
            p=1;
            while(i<n && A[i]>A[i-1]){
                p++;
                i++;
                s+=p;
            }
            d=1;
            while(i<n && A[i]<A[i-1]){
                s+=d;
                d++;
                i++;
            }
            if(d>p) s+=d-p;
        }
        
        return s;
    }
}