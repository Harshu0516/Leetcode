class Solution {
    public String minWindow(String s, String p) {
        int n=s.length();
        int m=p.length();
        // int len=0;
        int len = Integer.MAX_VALUE;
        int L=0;
        int R=0;
        int si=-1;
        int hash[]=new int[128];
        for(int i=0;i<m;i++){
            hash[p.charAt(i)]++;
        }
        int c=0;
        while(R<n){
            char ch=s.charAt(R);
            if(hash[ch]>0){
                c++;
                
            }
            hash[ch]--;
            while(c==m){
                if(R-L+1<len){
                    len=R-L+1;
                    si=L;
                }
                hash[s.charAt(L)]++;
                if(hash[s.charAt(L)]>0) c--;

                L++;
            }
            R++;


        }
        return si == -1 ? "" : s.substring(si, si + len);
    }
}