package g3801_3900.s3891_minimum_increase_to_maximize_special_indices;

// #Medium #Array #Dynamic_Programming #Greedy #Prefix_Sum #Staff #Weekly_Contest_496
// #2026_08_13_Time_2_ms_(100.00%)_Space_97.78_MB_(97.44%)

public class Solution {
    public long minIncrease(int[] nums) {
        int n = nums.length;
        long min = 0;
        if ((n & 1) == 1) {
            for (int i = 1; i < n; i += 2) {
                min += Math.max(Math.max(nums[i - 1], nums[i + 1]) + 1 - nums[i], 0);
            }
        } else {
            long[] starting = new long[] {0, 0};
            for (int i = 1; i < n - 1; i += 2) {
                int firstOp = Math.max(Math.max(nums[i - 1], nums[i + 1]) + 1 - nums[i], 0);
                int secondOp = Math.max(Math.max(nums[i], nums[i + 2]) + 1 - nums[i + 1], 0);
                starting[1] = Math.min(starting[0], starting[1]) + secondOp;
                starting[0] += firstOp;
            }
            min = Math.min(starting[0], starting[1]);
        }
        return min;
    }
}
