class Solution {

// Generating row
    static List<Integer> generateRow(int n){
        List<Integer> sol=new ArrayList<>();
        sol.add(1);
        long ans=1;
        for(int c=1;c<n;c++){
            ans=ans*(n-c);
            ans=ans/c;
            sol.add((int)ans);
        }
        return sol;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(generateRow(i));
        }
        return ans;
        
    }
}