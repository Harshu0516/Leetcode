class Solution {
    static List<Integer> rows(int n){
        int ans=1;
        List<Integer> res=new ArrayList<>();
        res.add(1);
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            res.add(ans);
        }
        return res;
    }
    public List<List<Integer>> generate(int n) {
        List<List<Integer>>ans=new ArrayList<>();

        for(int i=1;i<=n;i++){
            // List<Integer> res=new ArrayList<>();
            ans.add(rows(i));
        }
        return ans;

    }
}