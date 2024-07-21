class Solution {
    public int maximalRectangle(char[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;
        int [][]ps=new int[rows][cols];
        int sum;
        for(int j=0;j<cols;j++){
            sum=0;
            for(int i=0;i<rows;i++){
                if (mat[i][j] == '1') {
                    sum += 1;
                } else {
                    sum = 0;
                }
                ps[i][j]=sum;
            }
        }
        int maxi=0;
        for(int i=0;i<rows;i++){
            maxi=Math.max(maxi,LAH(ps[i]));
        }
        return maxi;        
    }


    public int LAH(int[] a) {
        Stack<Integer> st=new Stack<>();
        int maxi=0;
        for(int i=0;i<a.length;i++){
            while(!st.isEmpty() && a[st.peek()]>a[i]){
                int nse=i;
                int ele=st.pop();
                int pse=st.isEmpty()?-1:st.peek();
                maxi=Math.max(maxi,a[ele]*(nse-pse-1));
            }
            st.push(i);
        }  
            while(!st.isEmpty()){
                int nse=a.length;
                int ele=st.pop();
                int pse=st.isEmpty()?-1:st.peek();
                maxi=Math.max(maxi,a[ele]*(nse-pse-1));
            }
        return maxi;
    }







}