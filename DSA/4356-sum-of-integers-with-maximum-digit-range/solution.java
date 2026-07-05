class Solution {
    public int maxDigitRange(int[] nums) {
        int[] n = new int[nums.length];
        int sd = 99;
        int ld = -99;
        int maxr = 0;
        for (int i = 0; i < nums.length; i++) {
            ld = -99;
            sd = 99;
            int x = nums[i];
            while (x > 0) {
                int digit = x % 10;
                ld = Math.max(ld, digit);
                sd = Math.min(sd, digit);

                x = x / 10;
            }
            int range = ld - sd;
            if (range > maxr) {
                maxr = range;
            }
            n[i] = range;
        }
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == maxr) {
                sum = sum + nums[i];
            }
        }
        return sum;
    }
}
