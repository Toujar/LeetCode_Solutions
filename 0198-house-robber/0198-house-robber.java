class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int prev2 = 0;          // Max profit from 2 houses ago
        int prev1 = nums[0];    // Max profit from 1 house ago

        for (int i = 1; i < nums.length; i++) {
            // Formula: max(skip current house, rob current house)
            int current = Math.max(prev1, prev2 + nums[i]);
            
            // Shift your tracking variables forward
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}
