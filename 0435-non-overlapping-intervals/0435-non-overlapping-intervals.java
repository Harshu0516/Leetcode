class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int c=1;
        int n=intervals.length;
        int free=intervals[0][1];
        for(int i=1;i<n;i++){
            if(free<=intervals[i][0]){
                free=intervals[i][1];
                c++;
            }
        }
        return n-c; 
    }
}