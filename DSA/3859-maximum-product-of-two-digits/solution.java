class Solution {
    public int maxProduct(int n) {
        int x=n;
        int max=-99;
        int max1=-99;
        while(x>0){
            if(max<x%10){
                max1=max;
                max=x%10;
            }
            else if(max1<x%10){
                max1=x%10;
            }
            x=x/10;
        }    
        return max*max1;
    }
}
