class Solution {
    public double minimumAverage(int[] n) {
        Arrays.sort(n);
        ArrayList<Double> ans=new ArrayList<>();
        int i=0;
        int j=n.length-1;
        while(i<j){
            double avg=(n[i]+n[j])/2.0;
            ans.add(avg);
            i++;
            j--; 
        }
        Collections.sort(ans);
        return ans.get(0);
    }
}