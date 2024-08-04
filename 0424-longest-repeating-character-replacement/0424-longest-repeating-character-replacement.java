class Solution {
    public int characterReplacement(String S, int K) {
         int L=0,R=0,mF=0,c=0,len=0;
        Map<Character,Integer> mpp=new HashMap<>();
        while(R<S.length()){
            int val=mpp.getOrDefault(S.charAt(R),0)+1;
            mpp.put(S.charAt(R),val);
            
            mF=Math.max(mF,mpp.get(S.charAt(R)));
            c=(R-L+1)-mF;
            if(c>K){
            int x=mpp.get(S.charAt(L))-1;
            mpp.put(S.charAt(L),x);
            if(mpp.get(S.charAt(L))==0) mpp.remove(S.charAt(L));
            
            L++;
            // c = (R - L + 1) - mF;
            }
            
            if(c<=K){
                len=Math.max(len,R-L+1);
            }
            R++;
            
        }
        return len;
    }
}