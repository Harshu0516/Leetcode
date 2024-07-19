class Solution {
    public int[] nextGreaterElements(int[] n) {
        int len=n.length;
        int x=(2*(len))-1;
        int ans[]=new int[len];
        Stack<Integer> st=new Stack<>();
        
        for(int i=x;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=n[i%len]){
                st.pop();
            }
            if(i<len){
                ans[i]=st.isEmpty()?-1:st.peek();
            }
            st.push(n[i%len]);
        }
        return ans;
    }
}