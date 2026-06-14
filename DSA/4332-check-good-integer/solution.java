class Solution {
    public boolean checkGoodInteger(int n) {
    int x=n;
    int digitsum=0;
        while(x>0)
            {
            digitsum=digitsum+x%10;
                x=x/10;
            }
        int y=n;
        int squaresum=0;
        while (y>0){
            squaresum=squaresum+ (y%10)*(y%10);
            y=y/10;
        }
        return (squaresum-digitsum)>=50;
    }
}
