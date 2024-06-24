class Solution {
    static int dayWithCap(int []wt,int cap){
        int day=1;
        int load=0;
        for(int i=0;i<wt.length;i++){
            load+=wt[i];
            if(load>cap){
                day++;
                load=wt[i];
            }
            // else{
            //     load+=wt[i];
            // }
        }
        return day;
    }
    public int shipWithinDays(int[] wt, int d) {
        int maxi=0;
        int sum=0;
        for(int i=0;i<wt.length;i++){
            sum+=wt[i];
            maxi=Math.max(maxi,wt[i]);
        }        
        int i=maxi;
        int j=sum;
            while(i<=j){
            int m=(i+j)/2;
            int daysRwithCap=dayWithCap(wt,m);
            if(daysRwithCap<=d){
                j=m-1;
            }
            else i=m+1;
        }
        return i;
    }
}