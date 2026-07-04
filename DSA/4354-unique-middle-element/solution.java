class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int mid = nums.length / 2 ;
        int n = nums[mid];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==n && i!=mid){
                return false;
            }
        }
        return true;
    }
}
