class Solution {
    public int[][] merge(int[][] a) {
        int n=a.length;
         Arrays.sort(a, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<List<Integer>> ans=new ArrayList<>();
       for(int i=0;i<n;i++){
        int start=a[i][0];
        int end=a[i][1];
        if(!ans.isEmpty() && end<=ans.get(ans.size()-1).get(1)){
            continue;
        }
        for(int j=i+1;j<n;j++){
            if(a[j][0]<=end){
                end=Math.max(end,a[j][1]);
            }
        }
        ans.add(Arrays.asList(start,end));
       }
        int[][] result = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);
        }
        
        return result;  
    }
}