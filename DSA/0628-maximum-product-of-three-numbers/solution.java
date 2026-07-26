class Solution {
    public int maximumProduct(int[] nums) {
    int one=Integer.MIN_VALUE;
    int two=Integer.MIN_VALUE;
    int three=Integer.MIN_VALUE;
    int firstmin=Integer.MAX_VALUE;
    int smin=Integer.MAX_VALUE;
    for(int i=0;i<nums.length;i++){
        if(nums[i]>one){
            three=two;
            two=one;
            one=nums[i];
        }
        else if(nums[i]>two){
            three=two;
            two=nums[i];
        }
        else if(nums[i]>three){
            three=nums[i];
        }
    }  
    for(int i=0;i<nums.length;i++){
        if(nums[i]<firstmin){
            smin=firstmin;
            firstmin=nums[i];
        }
        else if(nums[i]<smin){
            smin=nums[i];
        }
    }  
    return Math.max(one*two*three,firstmin*smin*one);
    }
}
