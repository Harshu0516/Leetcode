class Solution {
    public List<List<Integer>> fourSum(int[] A, int T) {
        Set<List<Integer>> st=new HashSet<>();
        int n=A.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Long> sol=new HashSet<>();
                for(int k=j+1;k<n;k++){
                    long sum = (long)A[i] + A[j];
                    sum+=A[k];
                    long fourth=T-sum;
                    if(sol.contains(fourth)){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(A[i]);
                        temp.add(A[j]);
                        temp.add(A[k]);
                        temp.add((int)fourth);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                    sol.add((long)A[k]);
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>(st);
        return ans;
    }
}