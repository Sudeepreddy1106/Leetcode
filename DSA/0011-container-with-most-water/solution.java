class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxv = -999;
        int v = 0;
        while (left < right) {
            v = (right - left) * Math.min(height[left], height[right]);
            if (v > maxv) {
                maxv = v;
            } else {
                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return maxv;

    }
}
