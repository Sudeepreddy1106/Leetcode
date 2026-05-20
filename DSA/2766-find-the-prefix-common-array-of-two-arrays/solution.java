class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
    HashSet<Integer> set= new HashSet<>(); 
    int count=0;
    int ans[]= new int [A.length];   
    for(int i=0;i<A.length;i++){
    if(set.contains(A[i])){
        count++;
    }
    else{
        set.add(A[i]);
    }
     if(set.contains(B[i])){
        count++;
    }
    else{
        set.add(B[i]);
    }
       ans[i]=count;
    }    
    return ans;
    }
}
