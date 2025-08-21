class Solution {
    public void nextPermutation(int[] nums) {
        boolean found = false;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                int justLargerIndex = i + 1;
                for (int j = nums.length - 1; j > i; j--) {
                    if (nums[j] > nums[i]) {
                        justLargerIndex = j;
                        break;
                    }
                }
                int temp = nums[i];
                nums[i] = nums[justLargerIndex];
                nums[justLargerIndex] = temp;
                Arrays.sort(nums, i + 1, nums.length);
                found = true;
                break;
            }
        }
        if (!found) {
            Arrays.sort(nums);
        }
    }
}