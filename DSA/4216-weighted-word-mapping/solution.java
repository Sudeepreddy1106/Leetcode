class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
    StringBuilder ans= new StringBuilder();
    for(int i=0;i<words.length;i++){
        String word= words[i];
        int sum=0;
        for(char ch :word.toCharArray()){
            sum=sum+weights[ch-'a'];
        }
         ans.append((char)(Math.abs('z'-sum%26)));
    }    
    return ans.toString();
    }
}
