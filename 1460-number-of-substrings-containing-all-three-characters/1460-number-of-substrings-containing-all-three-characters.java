class Solution {
    public int numberOfSubstrings(String s) {
        int last_seen[]={-1,-1,-1};
        int c=0;
        int mini=0;
        for(int i=0;i<s.length();i++){
            last_seen[s.charAt(i)-'a']=i;
            if(last_seen[0]!=-1 && last_seen[1]!=-1 && last_seen[2]!=-1){
                mini=Math.min(last_seen[2],Math.min(last_seen[0],last_seen[1]));
                c=c+(1+mini);
            }
        }
        return c;
    }
}