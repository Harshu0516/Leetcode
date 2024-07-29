class Solution {
    public double minimumAverage(int[] n) {
        Arrays.sort(n);
        // ArrayList<Double> ans=new ArrayList<>();
        int i=0;
        int j=n.length-1;
        double small=Double.MAX_VALUE;
        while(i<j){
            double avg=(n[i]+n[j])/2.0;
            if(avg<small) small=avg;
            i++;
            j--; 
        }
        // Collections.sort(ans);
        // return ans.get(0);
        return small;
    }
}