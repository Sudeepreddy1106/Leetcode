class Solution {
    public int minimumCost(int[] nums, int k) {
        long resources = k;
        long cost = 0;
        long it = 1;
        for (int i = 0; i < nums.length; i++) {
            if (resources >= nums[i]) {
                resources = resources - nums[i];
            } else {
                long diff = nums[i] - resources;
                long need = (diff + k - 1) / k;
                resources += need * k;
                long first = it;
                long last = it + need - 1;
                long a = need;
                long b = first + last;
                long MOD = 1000000007;
                if (a % 2 == 0) {
                    a /= 2;
                } else {
                    b /= 2;
                }
                a %= MOD;
                b %= MOD;
                cost = (cost + (a * b) % MOD) % MOD;
                it += need;
                resources -= nums[i];
            }
        }
        return (int) (cost);
    }
}
