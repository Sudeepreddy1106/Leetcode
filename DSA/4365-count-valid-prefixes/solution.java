class Solution {
    public int countValidPrefixes(String s) {
        int count[]= new int[2];
        int ret=0;
        for(int i=0;i<s.length();i++){
            count[Character.getNumericValue(s.charAt(i))]++;
            if(Math.abs(count[1]-count[0])==1 ||Math.abs(count[1]-count[0])==0 ){
                ret++;
            }
            
        }
        return ret;
    }
}
