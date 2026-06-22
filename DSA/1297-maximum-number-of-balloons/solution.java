class Solution {
    public int maxNumberOfBalloons(String text) {
     Map<Character, Integer> freq = new HashMap<>();
     Map<Character, Integer> freq1 = new HashMap<>();

    for(int i=0;i<text.length();i++){
        if(text.charAt(i)=='b'||text.charAt(i)=='a'||text.charAt(i)=='l'||text.charAt(i)=='o'||text.charAt(i)=='n')
           freq.put(text.charAt(i),freq.getOrDefault(text.charAt(i),0)+1); 
    }    
   
 int min1 = Math.min(
    Math.min(freq.getOrDefault('a', 0),
             freq.getOrDefault('b', 0)),
    freq.getOrDefault('n', 0)
);

int min2 = Math.min(
    freq.getOrDefault('l', 0),
    freq.getOrDefault('o', 0)
);
    
    if(min1*2>min2){return min2/2;}
    
    return min1;
    }
}
