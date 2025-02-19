class Solution {
    public List<List<Integer>> threeSum(int[] n) {
        Set<List<Integer>> st = new HashSet<>();
        int l=n.length;
        for(int i=0;i<l;i++){
            Set<Integer> hashset = new HashSet<>();
            for(int j=i+1;j<l;j++){
                int x=-(n[i]+n[j]);
                if(hashset.contains(x)){
                    List<Integer> t=Arrays.asList(n[i],n[j],x);
                    t.sort(null);
                    st.add(t);  
                }
                hashset.add(n[j]);
            }
        }
        List<List<Integer>> ans=new ArrayList<>(st);
        return ans;
    }
}