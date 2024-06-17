class Solution {
    static void swap(int a[],int y){
      int i=0;
      while(i<y){
          int t=a[i];
          a[i]=a[y];
          a[y]=t;
          i++;
          y--;
      }
    }
    public void rotate(int[][] a) {
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int t=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=t;
            }
        }
       for(int i=0;i<n;i++){
           swap(a[i],n-1);
       }
    }
}