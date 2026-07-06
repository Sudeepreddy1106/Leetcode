class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        int length;
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            s.add(nums[i]);
        }
        for (int num:s) {
            if (!s.contains(num - 1)) {
                length = 1;
                int curr = num;
                while (curr != Integer.MAX_VALUE && s.contains(curr + 1)) {
                    length++;
                    curr++;
                }
                max = Math.max(length, max);
            }
        }
        return max;
    }
}

