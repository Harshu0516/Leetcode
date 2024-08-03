class Solution {
    public int totalFruit(int[] f) {
        Map<Integer,Integer> mpp=new HashMap<>();
        int l=0;
        int r=0;
        int len=0;
        int n=f.length;
        while(r<n){
            int val=mpp.getOrDefault(f[r],0)+1;
            mpp.put(f[r],val);
            
            if(mpp.size()>2){
              while(mpp.size()>2){
                int k=mpp.get(f[l])-1;
                mpp.put(f[l],k);
                if(mpp.get(f[l])==0) {
                    mpp.remove(f[l]);
                }
                l++;
              }  
            }

            if(mpp.size()<=2){
                len=Math.max(len,r-l+1);
            }
            r++; 
        }
        return len;
    }
}