class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int l=0,r=n-1;
        int lm=0;
        int rm=0;
        int t=0;
        while(l<r){
            if(h[l]<=h[r]){
                if(lm>h[l]){
                    t+=(lm-h[l]);
                }
                else lm=h[l];

            l++;
            }
            else{
                if(rm>h[r]){
                    t+=(rm-h[r]);
                }
                else rm=h[r];

            r--;
            }
        }
        return t;
    }
}