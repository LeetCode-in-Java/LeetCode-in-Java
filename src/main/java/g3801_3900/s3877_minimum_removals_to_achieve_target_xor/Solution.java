package g3801_3900.s3877_minimum_removals_to_achieve_target_xor;

// #Medium #Array #Dynamic_Programming #Bit_Manipulation #Staff #Weekly_Contest_494
// #2026_08_13_Time_10_ms_(100.00%)_Space_48.52_MB_(75.00%)

import java.util.Arrays;

public class Solution {
    public int minRemovals(int[] nums, int target) {
        int max = 0;
        for (int n : nums) {
            max = Math.max(max, n);
        }
        int u = 1 << (32 - Integer.numberOfLeadingZeros(max));
        if (target >= u) {
            return -1;
        }
        int n = nums.length;
        int[][] f = new int[n + 1][u];
        Arrays.fill(f[0], Integer.MAX_VALUE / 2);
        f[0][0] = 0;
        for (int i = 0; i < n; i++) {
            for (int x = 0; x < u; x++) {
                f[i + 1][x] = Math.min(f[i][x] + 1, f[i][x ^ nums[i]]);
            }
        }
        return f[n][target] == Integer.MAX_VALUE / 2 ? -1 : f[n][target];
    }
}
