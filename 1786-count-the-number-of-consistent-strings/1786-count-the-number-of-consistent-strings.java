class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
        for(String s:words){
            boolean f=true;
            for(char ch:s.toCharArray()){
                if(!allowed.contains(String.valueOf(ch))){
                    f=false;
                }
            }
            if(f) c++;
        }
        return c;
    }
}