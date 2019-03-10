class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length < 3) {
            return -1;
        }
        int sum = 0;
        int left = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (left * 2 == sum - nums[i]) {
                return i;
            } else {
                left += nums[i];
            }
        }
        return -1;
    }
}
