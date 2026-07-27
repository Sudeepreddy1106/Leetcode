class Solution {
    public int maxProduct(int[] nums) {
    int max=-99;
    int max1=-99;
    for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            max1=max;
            max=nums[i];
        }
        else if(nums[i]>max1){
            max1=nums[i];
        }
    }    
    return (max1-1)*(max-1);
    }
}
