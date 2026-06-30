class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    List<Integer> []freq= new ArrayList [nums.length+1];
    Map<Integer,Integer> hash= new HashMap<>();
    for(int i=0;i<nums.length;i++){
          hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
    }
    for(int i=0;i<freq.length;i++){
        freq[i]= new ArrayList<>();
    }
    int i=0;
    for(Map.Entry<Integer, Integer> entry : hash.entrySet()){
        if(i<nums.length){
        freq[entry.getValue()].add(entry.getKey());
        i++;
        }
    }
    int output[]= new int[k];
    int j=0;
    for(int y=freq.length-1;y>=0;y--){
        if(freq[y].size()==0){
            continue;
        }
        else if(j<k){
            for(int p=0;p<freq[y].size();p++){
            output[j]=freq[y].get(p);
            j++;
            if(j==k){
                return output;
            }
            }
            
        }
    }
    return output;
    }
}
