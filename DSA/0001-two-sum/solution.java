class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();
        int[] ret = new int[2];
        int sum = target;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < nums.length; i++) {
            num1 = nums[i];
            num2 = sum - num1;
            if (hash.containsKey(num2)) {
                ret[0] = i;
                ret[1] = hash.get(num2);
                break;
            }
            hash.put(num1,i);
        }
        return ret;
    }
}
