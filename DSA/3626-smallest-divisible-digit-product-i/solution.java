class Solution {
    public int smallestNumber(int n, int t) {
    for(int i=n;i<=100;i++){
        int pr=1;
        int x=i;
        while(x>0){
            pr=pr*(x%10);
            x=x/10;
        }
        if(pr%t==0){
            return i; 
        }
    }    
    return -1;
    }
}
