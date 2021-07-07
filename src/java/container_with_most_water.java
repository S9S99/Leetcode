// 11. Container With Most Water
// https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int result_height = Math.min(height[left], height[right]);
            int area = result_height * (right - left);
            max = Math.max(max, area);
            
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
