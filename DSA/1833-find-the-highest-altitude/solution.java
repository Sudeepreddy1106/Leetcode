class Solution {
    public int largestAltitude(int[] gain) {
    int alt=0;
    int maxalt=-99999;
    for(int i=0;i<gain.length;i++){
       alt=alt+gain[i];
       if(alt>maxalt){
        maxalt=alt;
       }
    }    
     if(maxalt>0)return maxalt;
    return 0;
    }
}
