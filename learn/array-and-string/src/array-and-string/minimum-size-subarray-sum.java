class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
  
        int i = 0, j = 0, sum = 0, min = nums.length + 1;
  
        while (j < nums.length) {
            sum += nums[j];
            j++;
            while (sum >= s) {
                min = Math.min(min, j - i);
                sum -= nums[i];
                i++;
            }
        }
        return min == nums.length + 1 ? 0 : min;
    }
}
