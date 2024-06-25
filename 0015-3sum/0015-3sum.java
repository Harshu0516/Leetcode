class Solution {
    public List<List<Integer>> threeSum(int[] A) {
        int n=A.length;
        Arrays.sort(A);
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(i>0 && A[i]==A[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int s=A[i]+A[j]+A[k];
                if(s<0){
                  j++;
                }
                else if(s>0){
                    k--;
                }
                else{
                set.add(Arrays.asList(A[i],A[j],A[k]));
                k--;
                j++;
                // while(j<k && A[j]!=A[j-1]) j++;
                // while(j<k && A[j]!=A[k+1]) k--;
                }
            }
        }
        ans.addAll(set);
        return ans;
     }
}