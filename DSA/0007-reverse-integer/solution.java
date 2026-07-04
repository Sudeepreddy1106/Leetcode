class Solution {
    public int reverse(int x) {
        long rev=0;
        while(x!=0){
            rev=rev*10+x%10;
            x=x/10;
        }
        int ret=0;
        if(rev>=Integer.MIN_VALUE && rev<= Integer.MAX_VALUE){
            ret=(int)rev;
            return ret;
        }
        return 0;
    }
}
