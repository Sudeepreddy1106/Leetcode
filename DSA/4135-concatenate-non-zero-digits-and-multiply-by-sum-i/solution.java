class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        int x = 0;
        int rnum = 0;
        int r=0;
        while (n > 0) {
            r = n % 10;
            if(r!=0){
            rnum = rnum * 10 + r;
            
            sum = sum + r;
            }
            n = n / 10;
        }
        while (rnum > 0) {
            r = rnum % 10;
            x = x * 10 + r;
            rnum = rnum / 10;
        }
        return (long) x * sum;
    }
}
