class Solution {
    public int getLength(int[] nums) {
    int []demo=nums;
        int n=demo.length;
        int maxLen=1;
        for(int i=0;i<n;i++){
            int maxFreq=0;
             Map<Integer, Integer> freq = new HashMap<>();
            for(int j=i;j<n;j++){
                                int newCount = freq.getOrDefault(demo[j], 0) + 1;
                freq.put(demo[j], newCount);
                maxFreq = Math.max(maxFreq, newCount);

                 if (isbalanced(freq,maxFreq)) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
            
        }
        return maxLen;
    }
       public boolean isbalanced(Map<Integer, Integer> freq,int maxFreq){
        if(freq.size()==1){return true;}
        if(maxFreq%2!=0){
            return  false;
        }
        boolean hasHalf = false; 
        int half=maxFreq/2;
        for(int f: freq.values()){
            if(f!=maxFreq && f!=half){
                return false;
            }
            if(f==half){ hasHalf = true;}
        }
        return hasHalf;
    }
 
}
