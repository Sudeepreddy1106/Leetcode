class Solution {
    public String rearrangeString(String s, char x, char y) {
        String t="";
        int cc=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)==y){
            cc++;
        }
    }   
        for(int i=0;i<cc;i++){
            t=t+y;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==y){
                continue;
            }else{
                t=t+s.charAt(i);
            }
        }
        return t;
    }
}
