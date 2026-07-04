class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxl = -9;
        int maxsum=0;
        for(int i=k;i<nums.length;i++){
            int sum=nums[i]+Math.max(maxl,nums[i-k]);
            maxsum=Math.max(sum,maxsum);
            maxl=Math.max(nums[i-k],maxl);
        }
        return maxsum;
    }
}
