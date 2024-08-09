class Solution {
    public boolean lemonadeChange(int[] b) {
        int f=0,t=0;
        for(int i=0;i<b.length;i++){
            if(b[i]==5){
                f++;
            }
            else if(b[i]==10){
                if(f>=1){
                    f--;
                    t++;
                }
                else return false;
            }
            else{
                if(f>=1 && t>=1){
                    f--;
                    t--;
                }
                else if(f>=3){
                    f=f-3;
                }
                else return false;
            }
        }
        return true;
    }
}