class Solution {
    static void swap(int[] n,int x,int y){
        int t=n[x];
        n[x]=n[y];
        n[y]=t;
    }
    public void sortColors(int[] n) {
     int low=0,mid=0,high=n.length-1;
     while(mid<=high){
     
     if(n[mid]==0){
       swap(n,low,mid);
        low++;
        mid++;
     }
     else if(n[mid]==1){
        mid++;
     }
     else{
      swap(n,mid,high);
      high--;
     }
     }   
    }
}