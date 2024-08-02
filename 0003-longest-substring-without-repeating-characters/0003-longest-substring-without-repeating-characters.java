class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=s.length();
        if (len==0 || len==1) return len;
        // if (len==1) return 1; 
        int maxi=0;
        for(int i=0;i<len;i++){
            Set < Character > ls = new HashSet < > ();
            for(int j=i;j<len;j++){
                char ch=s.charAt(j);
                if(ls.contains(ch)) break;
                maxi=Math.max(j-i+1,maxi);
                ls.add(ch);
            }
        }
        return maxi;
    }
}