class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int maxIndex = -1;
        int maxValue = 0;
        int secondValue = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= maxValue) {
                secondValue = maxValue;
                maxValue = nums[i];
                maxIndex = i;              
            } else if(nums[i] > secondValue) {
                secondValue = nums[i];
            }
        }
        return maxValue >= secondValue * 2 ? maxIndex : -1;
    }
}
