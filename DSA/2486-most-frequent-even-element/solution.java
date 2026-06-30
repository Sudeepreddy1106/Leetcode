class Solution {
    public int mostFrequentEven(int[] nums) {
    int count=-1;
    Map<Integer, Integer> hash= new HashMap<>();
    for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0){
            hash.put(nums[i], hash.getOrDefault(nums[i],0)+1);
        }
    }   
    List<Integer> l= new ArrayList<>(hash.keySet());
    int maxfre=-9;
    int minval=-1;
    for(int i=0;i<l.size();i++){
        int n= l.get(i);
        int fre=hash.get(n);
        if(fre>maxfre){
            maxfre=fre;
            minval=n;
        }
        else if(fre==maxfre && minval>n){
            minval=n;
        }
    }
    return minval;
    }
}
