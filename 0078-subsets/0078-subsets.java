class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int sub=(1<<nums.length);
        for(int i=0;i<sub;i++){
            List<Integer> st=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if ( ((i >> j) & 1)==1) st.add(nums[j]);
            }
            ans.add(st);
        } 
        return ans;
    }
}