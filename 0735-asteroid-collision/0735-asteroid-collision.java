class Solution {
    public int[] asteroidCollision(int[] a) {
        // ArrayList<Integer> st=new ArryaList<>();
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<a.length;i++){
            if(a[i]>0) st.push(a[i]);
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(a[i])) st.pop();

                if(!st.isEmpty() && st.peek()==Math.abs(a[i])) st.pop();
                
                else if(st.isEmpty() || st.peek()<0){
                    st.push(a[i]);
                }
            }       
        }
        int s=st.size();
        int []n=new int[s];
        int i=s-1;
        while(!st.isEmpty()){
            n[i--]=st.pop();
        }
        return n;
    }
}