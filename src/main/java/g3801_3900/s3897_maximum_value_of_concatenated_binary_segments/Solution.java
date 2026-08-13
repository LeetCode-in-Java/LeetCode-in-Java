package g3801_3900.s3897_maximum_value_of_concatenated_binary_segments;

// #Hard #Array #Sorting #Greedy #Senior_Staff #Biweekly_Contest_180
// #2026_08_13_Time_12_ms_(100.00%)_Space_104.12_MB_(56.00%)

import java.util.Arrays;

public class Solution {
    private static final int MOD = (int) 1e9 + 7;
    private static final int N = 10001;
    private static final int[] POW2 = new int[N];

    static {
        POW2[0] = 1;
        for (int i = 1; i < N; i++) {
            POW2[i] = POW2[i - 1] * 2 % MOD;
        }
    }

    public int maxValue(int[] nums1, int[] nums0) {
        int n = nums0.length;
        Integer[] indices = new Integer[n];
        int size = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums0[i] == 0) {
                count += nums1[i];
            } else {
                indices[size++] = i;
            }
        }
        Arrays.sort(
                indices,
                0,
                size,
                (i, j) -> nums1[i] == nums1[j] ? nums0[i] - nums0[j] : nums1[j] - nums1[i]);
        long ans = pow(2, count) - 1;
        for (int i = 0; i < size; ++i) {
            int index = indices[i];
            int count1 = nums1[index];
            int count0 = nums0[index];
            ans = (ans * POW2[count1] + POW2[count1] - 1) % MOD * POW2[count0] % MOD;
        }
        return (int) ans;
    }

    private long pow(long x, int n) {
        long result = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                result = result * x % MOD;
            }
            x = x * x % MOD;
            n >>= 1;
        }
        return result;
    }
}
