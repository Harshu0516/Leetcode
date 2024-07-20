class Solution {

    static int[] f_NSE(int[]a){
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            while(!st.isEmpty() && a[i]<a[st.peek()]) st.pop();

            ans[i]=st.isEmpty()?a.length:st.peek();
            st.push(i);
        } 
        return ans;
    }

    static int[] f_PSE(int[]a){
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            while(!st.isEmpty() && a[i]<=a[st.peek()]) st.pop();

            ans[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        } 
        return ans;
    }
    

    public int sumSubarrayMins(int[] a) {
        int nse[]=f_NSE(a);
        int pse[]=f_PSE(a);
        long sum=0;
        int mod=1000000007;;
        for(int i=0;i<a.length;i++){
            int L=i-pse[i];
            int R=nse[i]-i;
            long m = ((long) L * R) % mod;
            sum = (sum + m * a[i]) % mod;
        }
        return (int)sum;
    }
}