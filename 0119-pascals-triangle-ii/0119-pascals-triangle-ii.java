class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> sol=new ArrayList<>();
        long ans=1;
        sol.add(1);
        // 0-th indexed

        // just remember ==>ans*(Row-Col)/Col;
        rowIndex++;
        // columns
        for(int i=1;i<rowIndex;i++){
            ans=ans*(rowIndex-i);
            ans=ans/i;
            sol.add((int)ans);
        }
        return sol;
    }
}