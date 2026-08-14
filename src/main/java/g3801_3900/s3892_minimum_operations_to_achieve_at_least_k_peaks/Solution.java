package g3801_3900.s3892_minimum_operations_to_achieve_at_least_k_peaks;

// #Hard #Array #Dynamic_Programming #Senior_Staff #Weekly_Contest_496
// #2026_08_13_Time_92_ms_(93.75%)_Space_47.26_MB_(78.13%)

import java.util.Arrays;

public class Solution {
    private static final long INF = Long.MAX_VALUE / 4;

    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        if (k == 0) {
            return 0;
        }
        if (k > n / 2) {
            return -1;
        }
        long[] c = new long[n];
        for (int i = 0; i < n; i++) {
            int left = nums[(i - 1 + n) % n];
            int right = nums[(i + 1) % n];
            c[i] = Math.max(0L, (long) Math.max(left, right) + 1 - nums[i]);
        }
        long best = pathMin(c, 1, n - 1, k);
        long withZero = pathMin(c, 2, n - 2, k - 1);
        if (withZero < INF) {
            best = Math.min(best, c[0] + withZero);
        }
        return (int) best;
    }

    private long pathMin(long[] c, int lo, int hi, int need) {
        if (need == 0) {
            return 0;
        }
        int m = hi - lo + 1;
        if (m <= 0 || need > (m + 1) / 2) {
            return INF;
        }
        long[] prev2 = new long[need + 1];
        long[] prev1 = new long[need + 1];
        long[] cur = new long[need + 1];
        Arrays.fill(prev2, INF);
        prev2[0] = 0;
        Arrays.fill(prev1, INF);
        prev1[0] = 0;
        for (int i = 0; i < m; i++) {
            long w = c[lo + i];
            cur[0] = 0;
            for (int j = 1; j <= need; j++) {
                cur[j] = Math.min(prev1[j], prev2[j - 1] + w);
            }
            long[] t = prev2;
            prev2 = prev1;
            prev1 = cur;
            cur = t;
        }
        return prev1[need];
    }
}
