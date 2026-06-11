class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int globalMin = Integer.MAX_VALUE;
        int globalMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            globalMin = Math.min(globalMin, nums[i]);
            globalMax = Math.max(globalMax, nums[i]);
        }
        return (long)(globalMax - globalMin) * k;
    }
}
