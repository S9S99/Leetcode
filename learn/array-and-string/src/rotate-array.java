class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        if (nums == null || nums.length == 0 || k == 0) {
            return;
        }
        int indexOriginal = 0;
        int index = 0;
        int source = nums[0];
        int desIndex, tmp;
        
        for (int i = 0; i < nums.length; i++) {
            desIndex = (index + k) > nums.length - 1 ? (index + k - nums.length) : index + k;
            tmp = nums[desIndex];
            nums[desIndex] = source;
            source = tmp;
            index = desIndex;
            if (index == indexOriginal) {
                index++;
                indexOriginal = index;
                source = nums[index];
            }
        }
    }
}
