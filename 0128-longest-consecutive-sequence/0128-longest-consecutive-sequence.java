class Solution {
    public int longestConsecutive(int[] A) {
        if(A.length==0) return 0;
    int longest=1;
    int c=0;
    Set<Integer> ans=new HashSet<>();
    for(int i=0;i<A.length;i++){
        ans.add(A[i]);
    }
    for(int x:ans){
        if(!ans.contains(x-1)){
         c=1;
         int val=x;
         while(ans.contains(val+1)){
            val+=1;
            c+=1;
         }
        longest=Math.max(longest,c);
    }
}
        return longest;
    }
}