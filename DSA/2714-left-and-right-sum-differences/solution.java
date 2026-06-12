class Solution {
    public int[] leftRightDifference(int[] nums) {
    int[]leftsum= new int[nums.length];
    int[]rightsum=new int[nums.length];
    int []result = new int[nums.length];
    int Lsum=0;
    int Rsum=0;
    for(int i=1;i<nums.length;i++){
    Lsum=Lsum+nums[i-1];
    leftsum[i]=Lsum;   
    }  
    for(int i=nums.length-2;i>=0;i--){
    Rsum=Rsum+nums[i+1];
    rightsum[i]=Rsum;   
    }  
    for(int i=0;i<nums.length;i++){
        result[i]=Math.abs(leftsum[i]-rightsum[i]);
    }
   return result;

    }
}
